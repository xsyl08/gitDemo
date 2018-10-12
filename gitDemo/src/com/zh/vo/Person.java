package com.zh.vo;

public class Person {
	public String name;
	private int age;
	private String sex;
	
	public Person() {
		super();
	}
	public Person(String name) {
		super();
		this.name = name;
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Person(String name, int age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
//	public Person() {
//		
//	}
//	public Person(String name) {
//		this();
//		this.name = name;
//		this.setName(name);
//	}
//	public Person(String name, int age) {
//		this(name);
//		this.age = age;
//	}
//	public Person(String name, int age, String sex) {
//		this(name,age);
//		this.sex = sex;
//	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
}
