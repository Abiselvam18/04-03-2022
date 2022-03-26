package com.wrapperClass;

public class Example6 {
	
	public static void main(String[] args) 
	{
		System.out.println("Short");
		short length = 6;
		//short s1 = length
		Short s1= Short.valueOf(length);
		
		System.out.println(length);
		
		System.out.println("=================");
		
		short s = 15;
		Short val = new Short(s);
		short s2 = val.shortValue();		
		
		System.out.println(val);	
		
	}

}
