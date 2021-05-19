package com.ManageEmployee.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.ManageEmployee.model.AccountModel;

public class AccountMapper implements RowMapper<AccountModel> {

	@Override
	public AccountModel mapRow(ResultSet resultSet) {
		try {
			AccountModel accounts = new AccountModel();
			accounts.setUserName(resultSet.getString("userName"));
			accounts.setPassWord(resultSet.getString("passWord"));
			accounts.setRole(resultSet.getBoolean("role"));
			
			return accounts;
		} catch (SQLException e) {
			return null;
		}	
	}
}
