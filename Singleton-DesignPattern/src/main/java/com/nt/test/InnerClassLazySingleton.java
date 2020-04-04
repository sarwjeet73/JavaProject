
package com.nt.test;

import com.nt.singleton.LazyInnerClassSingleton;

/**
 * This is Test Client of the LazyInnerClassSingleton
 * @author ATISH
 *
 */
public class InnerClassLazySingleton {
	
	public static void main(String[] args) {
		LazyInnerClassSingleton object1,object2;
		
		object1=LazyInnerClassSingleton.getInstance();
		object2=LazyInnerClassSingleton.getInstance();
		
		System.out.println("Object 1 ::"+object1.hashCode());
		System.out.println("Object 2 ::"+object2.hashCode());
		
		
		System.out.println("Object 1 and Object 2 are Referring to the Same Object ?"+(object1==object2));
	}

}
