package com.zh.serialization.vo;
/**
 * 不设置serializeVersionID，修改对象如添加属性后，读取未修改前对象序列化的文件时会报java.io.InvalidClassException
 */
import java.io.Serializable;
import java.util.Date;

public class UserCopy implements Serializable {
	
	private String userName;
	private String userPassword;
	private String userSex;
	private int userAge;
	private Date userBirthday;
	//新添加一个属性
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
	@Override
	public String toString() {
		return "User [userName=" + userName + ", userPassword=" + userPassword + ", userSex=" + userSex + ", userAge="
				+ userAge + ", userBirthday=" + userBirthday + "]";
	}
}
