package com.ManageEmployee.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ManageEmployee.dao.IAccountDAO;
import com.ManageEmployee.mapper.AccountMapper;
import com.ManageEmployee.model.AccountModel;

@Repository
public class AccountDAO extends AbstractDAO<AccountModel> implements IAccountDAO {
	
	
	@Override
	public List<AccountModel> getAccount() {
		StringBuilder sql = new StringBuilder("SELECT * FROM public.\"Account\"");

		return query(sql.toString(), new AccountMapper());
	}
	
	@Override
	public List<AccountModel> findByUsername(String username, String password) {
		StringBuilder sql = new StringBuilder("SELECT * FROM public.\"Account\" WHERE \"UserName\" = '"+username+"' AND  \"PassWord\" = '"+password+"'");

		return query(sql.toString(), new AccountMapper());
	}

	
}
