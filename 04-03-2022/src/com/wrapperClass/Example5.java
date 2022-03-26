package com.wrapperClass;

public class Example5 {
	
	public static void main(String[] args) 
	{
		System.out.println("Long");
		long height = 10;
		//long = height;
		Long h1= Long.valueOf(height);
		
		System.out.println(height);
		
		System.out.println("==================");
		
		Long h2 = new Long(15);
		//long value = l2;
		long value = h2.longValue();		
		
		System.out.println(value);
				
	}

}
