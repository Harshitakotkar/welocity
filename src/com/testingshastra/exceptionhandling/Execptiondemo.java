package com.testingshastra.exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class Execptiondemo {
	public static void main(String[] args) {
	try//File not found Exception is used
	{
			
		FileInputStream fis= new FileInputStream ("C:\\Users\\DC\\Desktop\\CardDetai.xlsx");//cheaked exception
		System.out.println("file found");
	}catch(FileNotFoundException e){
		System.out.println("file not found at this location");
	}
	
	int a=5;
	int b=0;
	int c;
	try {//Arithmetic exception is used
		 c=a/b;
	}catch (ArithmeticException e)
	{
		
		System.out.println("Arithmetic exception="+e.getMessage());
		
	}
	try {//NullPointerException is used
	String s=null;
	System.out.println(s.length());
	}catch (NullPointerException e){
	System.out.println("Nullpointer exception="+e.getMessage());
	}
	
	
	
	int arr[]= {1,2,3,4,5};
	try//ArrayIndexOutOfBoundsException is used.

	{
		System.out.println(arr[5]);
	}catch (ArrayIndexOutOfBoundsException e)
	{
	
	System.out.println("ArrayIndexOutOfBoundsException="+e.getMessage());
	}
	
	
	
	String s="hello";
	try {//StringIndexOutOfBoundsException is used.
	int p=s.length();
	System.out.println("string lengthis:"+p);
	
	char ch=s.charAt(5);// after exception occur  rest of code in try block is not excute.
	System.out.println(ch);
	System.out.println("continue");///this line will not print
	}catch (StringIndexOutOfBoundsException e) {
		System.out.println(e);//after handling exception rest code will excute.
		System.out.println("rest of the code continues");//this line will excute
	}
	
	
	
	int arr1[]=new int[5];
	System.out.println("enter the length of array=");
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	
	for(int i=0;i<size;i++) {
		System.out.println("array elements are:");
		arr1[i]=sc.nextInt();
		System.out.println(arr1[i]);
	}
	
	
	try {
	System.out.println(arr1[7]);
	System.out.println("run code in try block");
}catch (ArrayIndexOutOfBoundsException e) {
	System.out.println("run catch block code");//here handled eception in try block
	System.out.println(arr1[6]);//exception in catch bock is not handled
}
}
}
