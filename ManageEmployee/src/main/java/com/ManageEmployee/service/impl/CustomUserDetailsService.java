package com.ManageEmployee.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ManageEmployee.dao.impl.AccountDAO;
import com.ManageEmployee.model.AccountModel;

@Service
public class CustomUserDetailsService implements UserDetailsService {
	
	@Autowired
	private AccountDAO accountDao;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		AccountModel account = (AccountModel) accountDao.findByUsername(username);
		
		if (account == null) {
			throw new UsernameNotFoundException("User not found");
		}
		List<GrantedAuthority> authorities = new ArrayList<>();

		AccountModel myUser = new AccountModel(account.getUserName(), account.getPassword(), 
				account.getRole(), true, true, true, authorities);
		return myUser;
	}

}
