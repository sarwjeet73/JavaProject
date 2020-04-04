package com.nt.test;

import com.nt.singleton.LazySingleton;

/**
 * This is a Test Application of the Singleton
 * @author ATISH
 *
 */
public class LazySingletonTest {
	
	/**
	 * Main Method  to Execute
	 * @param args
	 */
	public static void main(String[] args) {
		
		LazySingleton object1,object2,object3;
		
		object1=LazySingleton.getInstance();
		object2=LazySingleton.getInstance();
		object3=LazySingleton.getInstance();
		
		System.out.println("Object 1 ::"+object1.hashCode());
		System.out.println("Object 2 ::"+object2.hashCode());
		
		
		
		System.out.println("Object 1 and Object 2 are Referring to the Same Object ?"+(object1==object2));
	}

}
