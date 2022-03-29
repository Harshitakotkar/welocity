package com.testingshastra.exceptionhandling;

import javax.crypto.AEADBadTagException;

public class NestedBlock {
	
public static void main(String[] args) {
	
	try {
	String	s=null;
		System.out.println(s.length());
	try {	
	int arr[] = {1,2,3,4,5,6,7};
	System.out.println(arr[7]);
			
	
	
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("array endex out of bound");
			
		}
	}catch (NullPointerException e){
		System.out.println("exception handdled");
	}
	System.out.println("program execute");
}

}
