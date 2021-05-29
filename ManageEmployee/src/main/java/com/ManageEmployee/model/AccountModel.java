package com.ManageEmployee.model;

public class AccountModel extends AbstractModel<AccountModel>{
	

	private String userName;
	private String passWord;
	private Boolean role;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public Boolean getRole() {
		return role;
	}
	public void setRole(Boolean role) {
		this.role = role;
	}
}
