package com.ManageEmployee.dao;

import java.util.List;

import com.ManageEmployee.model.AccountModel;

public interface IAccountDAO extends GenericDAO<AccountModel> {

	/*
	 * void update(AccountModel updateNew); void delete(long id);
	 */
	List<AccountModel> getAccount();
	
	List<AccountModel> findByUsername(String userName);
	/* int getTotalItem(); */
}
