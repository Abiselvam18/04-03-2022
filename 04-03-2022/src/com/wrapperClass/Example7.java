package com.wrapperClass;

public class Example7 {

	public static void main(String[] args) 
	{
		System.out.println("Double");
		double val = 20.28;
		
		//double d = val;
		Double d = Double.valueOf(val);
		
		System.out.println(val);
		
		System.out.println("==================");
		
		Double d2 = new Double(40.34);
		
		//double value = d2;
		double value = d2.doubleValue();		
		
		System.out.println(value);
	}
}
