package com.nt.singleton;

/**
 * This Class is to Perform the Inner Class Singleton
 * @author ATISH
 *
 */
public class LazyInnerClassSingleton {
	
	/**
	 * 0-param Contructor
	 */
	private LazyInnerClassSingleton() {
		System.out.println("0-param ");
	}
	/**
	 * Inner Class
	 * @author ATISH
	 *
	 */
	private static final class SingletonHelper{
		private static LazyInnerClassSingleton innerInstance=new LazyInnerClassSingleton();
	}
	
	/**
	 * Static Method
	 */
	public static LazyInnerClassSingleton getInstance() {
		return SingletonHelper.innerInstance;
	}
}
