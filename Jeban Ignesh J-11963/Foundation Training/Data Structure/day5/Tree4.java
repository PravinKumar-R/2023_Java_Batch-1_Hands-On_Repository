package com.jeban.day5;//Revers order 

import java.util.Collections;
import java.util.TreeSet;

public class Tree4 {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>(Collections.reverseOrder());// Intger

		ts.add(6);
		ts.add(9);
		ts.add(9);
		ts.add(4);
		ts.add(1);
		ts.add(2);

		System.out.println("numbers:" + ts);

//		TreeSet<String> ts1=new TreeSet<String>(Collections.reverseOrder());//String
//		
//		ts1.add("g");
//		ts1.add("h");
//		ts1.add("A");
//		ts1.add("c");
//		ts1.add("f");
//		ts1.add("j");
//		ts1.add("jeban");
//		ts1.add("Apple");
//		ts1.add("Banana");
//		ts1.add("Orange");
//		ts1.add("Mango");
//		
//		System.out.println(ts1);

	}

}
