package com.nt.test;

import com.nt.singleton.DoubleCheckingSingleton;

public class DoubleCheckingTest {
	
	public static void main(String[] args) {
		
		DoubleCheckingSingleton instance1,instance2;
		
		instance1=DoubleCheckingSingleton.getInstance();
		instance2=DoubleCheckingSingleton.getInstance();
		System.out.println("Object 1 ::"+instance1.hashCode());
		System.out.println("Object 2 ::"+instance2.hashCode());
		
		
		
		System.out.println("Object 1 and Object 2 are Referring to the Same Object ?"+(instance1==instance2));
	}

}
