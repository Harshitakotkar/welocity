package com.testingshastra.exceptionhandling;

public class Test {
	public static void main(String[] args) {
	String s ="hello";
	int x[]= {1,2,3,4,5};
	try {
		System.out.println(x[5]);
		System.out.println(s.charAt(5));
	}catch(StringIndexOutOfBoundsException e){
	//	System.exit(0);
	System.out.println("handling code");
		
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("handle successfully");
	}catch(RuntimeException e) {
		System.out.println("excute");
	}
	
	finally {
		System.out.println("excute code");
	}

System.out.println("continue");



	} 
}