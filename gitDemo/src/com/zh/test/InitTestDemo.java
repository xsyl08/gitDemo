package com.zh.test;

/**
 * 方法内的变量是局部变量，必须初始化，否则会报错；类里面的属性变量会在java运行时自动赋值，基本数据类型赋0/0.0，引用数据类型赋null。
 * @author ZH
 */

public class InitTestDemo {
	private static int i;
	private static Integer integer;
	private static double d;
	private static Double doub;
	private static String string;

	public static void main(String[] args) {
		int i_1;
		Integer integer_1;
		double d_1;
		double doub_1;
		String string_1;
		System.out.println("i="+i+", integer="+integer);
		System.out.println("d="+d+", doub="+doub);
		System.out.println("string="+string);
		//System.out.println(i_1);
		//System.out.println(integer_1);
		//System.out.println(d_1);
		//System.out.println(doub_1);
		//System.out.println(string_1);
	}

}
