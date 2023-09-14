package com.aravind.day13;
interface  MyInterface1
{
	void addition(int a,int b);// by default interface methods are abstract,public
	void subtraction(int a,int b);
}

interface MyInterface2
{
	void multiplication(int a,int b);
	void division(int a,int b);
	
}
class Calculator1 implements MyInterface1,MyInterface2{
	 public void addition(int a,int b)
	 {
		 System.out.println("Addition ="+(a+b));
		 }
	 public void subtraction(int a,int b)
	 {
		 System.out.println("Subtraction ="+(a-b));
	 }
	 public void multiplication(int a,int b)
	 {
		 System.out.println("multiplication ="+(a*b));
	 }
	 public void division(int a,int b)
	 {
		 System.out.println("division ="+(a/b));
	 }
}

public class InterfaceExample2 {

	public static void main(String[] args) {
		
//		MyInterface1 obj1=new Calculator1();
//		obj1.addition(20,20);
//		obj1.subtraction(30,40);
		//MyInterface2 obj2=new Calculator1();
//		obj2.multiplication(20,20);
//		obj2.division(30,40);
		
		
		Calculator1 obj=new Calculator1();// one way
		obj.addition(10,20);
		obj.subtraction(30, 20);
		obj.multiplication(10,20);
		obj.division(20,10);
		

	}

}
