package org.tnsif.capgemini.c2tc.exceptionhandlingdemo;

public class NullPointerexceptionDemo {

	public static void main(String[] args) {
		 String str=null;
		 try {
			 System.out.println(str.length()); 
		 }catch (NullPointerException  e)
		 {
			 System.out.println(e);
		 }
		 finally
		 {
			 System.out.println("No matterwhat this block we get executed");
		 }
		 
	}

}