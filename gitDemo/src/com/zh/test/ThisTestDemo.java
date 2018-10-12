package com.zh.test;

import com.zh.vo.Person;
import com.zh.vo.Student;

public class ThisTestDemo {
	public static void main(String[] args) {
		Person person = new Person("张三",18);
		System.out.println(person);
		Student student = new Student("李四",18,"男");
		System.out.println(student);
	}
}

