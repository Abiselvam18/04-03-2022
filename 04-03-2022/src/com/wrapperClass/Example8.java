package com.wrapperClass;

public class Example8 {
	
	public static void main(String[] args) 
	{
		System.out.println("Integer");
		int age = 23;
		Integer I1 = Integer.valueOf(age);	
		System.out.println(age);	
		
		System.out.println("==============");
		
		int Age = 24;	
		Integer I2 = new Integer(24);		
		System.out.println(I2);

	}

}
