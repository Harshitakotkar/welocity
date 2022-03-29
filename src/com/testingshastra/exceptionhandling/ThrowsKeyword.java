package com.testingshastra.exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword {
public void readFile() throws FileNotFoundException {
	System.out.println("continoues");
	FileInputStream fis= new FileInputStream ("F:\\harshita.docx");
	
}

 public void m1() throws FileNotFoundException {
 
	System.out.println("run method m1"); 
	 
	 readFile() ;

 

}
 public void m1(int a,int b) {
	 
 }
 public boolean p1(int a,int b) throws FileNotFoundException {
	 
 try {
	 m1();
	 }catch( Exception e){
		 System.out.println("run catch block");
		 System.out.println("exception handled");
	 }
	 if(a==b) {
		 System.out.println("value is same");
		 return true;
	 }else {
			 System.out.println("value not same");
		 }
	return	false;
	 
 }
 public static void main(String[] args) throws FileNotFoundException {
	 ThrowsKeyword  obj=new ThrowsKeyword();
	 obj.p1(3, 3);
}
}

