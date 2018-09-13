package com.zh.test;

/**
 * 方法内的变量是局部变量，必须初始化，否则会报错；类里面的属性变量会在java运行时自动赋值，基本数据类型赋0/0.0，引用数据类型赋null。
 * @author Administrator
 *
 */

public class InitTestDemo {
	private static int i;
	private static Integer integer;
	private static String string;
	
	public static void main(String[] args) {
		int i_1;
		Integer integer_1;
		String string_1;
		System.out.println("i="+i+", integer="+integer+", string="+string);
		//System.out.println(i_1);
		//System.out.println(integer_1);
		//System.out.println(s1);
	}

}
