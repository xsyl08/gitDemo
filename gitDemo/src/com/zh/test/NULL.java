package com.zh.test;

/**
 * 1、null代表不确定的对象：java中，null是一个关键字，用来标识一个不确定的对象。因此可以将null赋给引用类型变量，但不能赋给基本类型变量。
 * 2、null本身不是对象，也不是Object的实例。
 * 3、java默认给引用类型变量自动赋值为null。
 * 4、容器类型里面元素可以为null。
 * 5、判断一个引用类型数据是否为null，用==来判断。
 * 6、让一个非null的引用类型变量指向null，这个对象就不再被其他对象引用了，等待JVM垃圾回收机制去回收。
 * @author ZH
 */

public class NULL {
	public static void haha() {
		System.out.println("hahahaha....");
	}
	public static void main(String[] args) {
		if(null instanceof java.lang.Object){
			System.out.println("null属于java.lang.Object类型");
		}else {
			System.out.println("null不属于java.lang.Object类型");
		}
		((NULL)null).haha();
	}
}
