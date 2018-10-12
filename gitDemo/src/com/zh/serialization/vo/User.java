package com.zh.serialization.vo;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
	/**
	 * default serial version ID
	 */
	private static final long serialVersionUID = 1L;
	
	private String userName;
	private String userPassword;
	private String userSex;
	private int userAge;
	private Date userBirthday;
	//新添加的属性
	private String userAddress;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserSex() {
		return userSex;
	}
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public Date getUserBirthday() {
		return userBirthday;
	}
	public void setUserBirthday(Date userBirthday) {
		this.userBirthday = userBirthday;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", userPassword=" + userPassword + ", userSex=" + userSex + ", userAge="
				+ userAge + ", userBirthday=" + userBirthday + "]";
	}
}
