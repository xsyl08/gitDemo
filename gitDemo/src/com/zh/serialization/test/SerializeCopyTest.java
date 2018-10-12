package com.zh.serialization.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

import com.zh.serialization.vo.UserCopy;

public class SerializeCopyTest {
	public static void main(String[] args) {
		//首先创建一个User对象
		UserCopy user = new UserCopy();
		user.setUserName("张三");
		user.setUserPassword("0");
		user.setUserSex("男");
		user.setUserAge(18);
		user.setUserBirthday(new Date(100, 10, 10));
		System.out.println(user);
		//定义一个File文件，用于存放序列化后的对象
		String pathname = "G:/test1.out";
		File file = new File(pathname);
		
		//序列化
		serializeObject(user, file);
		//反序列化
		System.out.println(deSerializeObject(file));
	}
	public static void serializeObject(Object obj, File file) {
		ObjectOutputStream objectOutputStream = null;
		try {
			//将输出流写入指定文件
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			//写入指定 OutputStream
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			//将指定对象写入objectOutputStream
			objectOutputStream.writeObject(obj);
			objectOutputStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Object deSerializeObject(File file) {
		ObjectInputStream objectInputStream = null;
		Object obj = null;
		try {
			//从指定文件读取流数据
			FileInputStream fileInputStream = new FileInputStream(file);
			objectInputStream = new ObjectInputStream(fileInputStream);
			//把对象流读取成对象
			obj = objectInputStream.readObject();
			objectInputStream.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}
}
