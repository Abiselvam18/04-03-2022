package com.wrapperClass;

public class Example2 
{

	public static void main(String[] args) 
	{
		System.out.println("Float");
		float price = 30.45f;
		
		//Float f = price;
		Float f = Float.valueOf(price);
		
		System.out.println(f);
		
		System.out.println("==================");
		
		Float f2 = new Float(56.34f);
		
		//float value = f2;
		float value = f2.floatValue();		
		
		System.out.println(value);
			
	}

}
