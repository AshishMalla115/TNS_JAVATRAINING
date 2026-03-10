package org.tnsif.capgemini.c2tc.javabasics;

public class VariableDemo {
	int price = 10;
	void print()
	{
		String msg ="Hello World";
		System.out.println(msg);
		
	}
	static String message = "Hello Students";

	public static void main(String[] args)
	{
		VariableDemo obj = new VariableDemo();
		System.out.println("The Value of the price " + obj.price);
		obj.print();
		System.out.println(message);
	}

}
