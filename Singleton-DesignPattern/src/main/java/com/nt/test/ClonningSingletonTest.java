package com.nt.test;

import com.nt.singleton.CloneLazySingleton;

/**
 * This is Client Test To test the Clone Lazy Singleton
 * @author ATISH
 *
 */
public class ClonningSingletonTest {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		CloneLazySingleton object1,object2;
		
		object1=CloneLazySingleton.getInstance();
		System.out.println("Object 1 ::"+object1.hashCode());
		object2=(CloneLazySingleton) object1.clone();
				
		System.out.println("Object 2 ::"+object2.hashCode());
	
		System.out.println("Object 1 and Object 2 are Referring to the Same Object ?"+(object1==object2));
	}
}
