package com.naveen.day2;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number: ");
	int n = sc.nextInt();
	int fact = 1;
	for(int i=1;i<=n;i++) {
	    fact=fact*i;
	}
	System.out.println("The Fcatorial of a number " +n+ " is :"+fact);
	sc.close();
	}

}
