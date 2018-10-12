package com.zh.vo;

public class Student extends Person {
	private int student_id;
	private double score;
	
	public Student() {
		super();
	}
	public Student(String name) {
		super(name);
	}
	public Student(String name, int age) {
		super(name,age);//this(name);this.setAge(age);
	}
	public Student(String name, int age, String sex) {
		super(name,age,sex);
	}
	public Student(String name, int age, String sex, int student_id) {
		super(name, age, sex);
		this.student_id = student_id;
	}
	public Student(String name, int age, String sex, int student_id, double score) {
		super(name, age, sex);
		this.student_id = student_id;
		this.score = score;
	}
	
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student ["+super.toString()+"student_id=" + student_id + ", score=" + score + "]";
	}
}
