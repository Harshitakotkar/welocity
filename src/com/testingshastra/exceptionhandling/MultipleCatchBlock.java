package com.testingshastra.exceptionhandling;

public class MultipleCatchBlock {
	public static void main(String[] args) {
		
	

	String  s="hello";
	
	int arr[]= {1,2,3,4,5,6,7};
	
	int a=10;
	int b=0;
	try {
	int p=s.charAt(4);
	
	int n=Integer.parseInt(s);
	
	int h=arr[7];
	
	int c=a/b;
	
	}catch (StringIndexOutOfBoundsException e) {
		System.out.println("no character found ="+e.getMessage());
	}catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("no array index found ="+e.getMessage());
	}catch (NumberFormatException e) {
		System.out.println("not convert charcter string to intger ="+e.getMessage());
		//int h=arr[7];
	}/*catch( ArithmeticException e) {
		System.out.println("number cannot divide by zero="+e.getMessage());
	}catch (Exception e) {
		System.out.println("exception is handled ="+e.getMessage());
	}*/
	finally  {
		//int h=a/b;//finally block can't throw exception
		System.out.println("the code is run complsory");
	}
}
	
}
