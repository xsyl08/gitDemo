package com.zh.serialization.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

import com.zh.serialization.vo.User;

public class SerializeTest {
	public static void main(String[] args) {
		//首先创建一个User对象
		User user = new User();
		user.setUserName("张三");
		user.setUserPassword("0");
		user.setUserSex("男");
		user.setUserAge(18);
		user.setUserBirthday(new Date(100, 10, 10));
		System.out.println(user);
		//定义一个File文件，用于存放序列化后的对象
		String pathname = "G:/test.out";
		File file = new File(pathname);
		//定义对象输出流和输入流
		ObjectOutputStream objectOutputStream = null;
		ObjectInputStream objectInputStream = null;
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			//写入指定 OutputStream
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			//将指定对象写入objectOutputStream
			objectOutputStream.writeObject(user);
			
			FileInputStream fileInputStream = new FileInputStream(file);
			objectInputStream = new ObjectInputStream(fileInputStream);
			User user2 = (User) objectInputStream.readObject();
			System.out.println(user2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
