package com.muthu.day14;
//n Number of Interface CLASS TO INTERFACE
interface MyInterface1{
	void addition(int a,int b);
	void subtraction(int a,int b);	
}
interface MyInterface2{
	void multiplication(int a,int b);
	void division(int a,int b);	
}
class Calculator1 implements MyInterface1,MyInterface2{
  public  void addition(int a,int b) {
	  System.out.println("Addition:"+(a+b));
  }
  public void subtraction(int a,int b) {
	  System.out.println("subtraction:"+(a+b));
  }
  public  void multiplication(int a,int b) {
	  System.out.println("muliplication:"+(a*b));
  }
  public void division(int a,int b) {
	  System.out.println("division:"+(a/b));
  }
}

public class ex2 {
	public static void main(String[]args) {
		Calculator1 obj=new Calculator1();//have we had create object for subclsss because we have 2.
		obj.addition(10, 20);
		obj.subtraction(20, 10);
		obj.multiplication(10,3);
		obj.division(50, 2);
	}
}


