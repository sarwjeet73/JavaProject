package com.nt.singleton;

/**
 * This is a LazySingleton Class
 * @author ATISH
 *
 */
public class LazySingleton {
	
	/**
	 * This is Static Reference variable of the Current Class
	 */
	private static LazySingleton instance;

	
	
	/**
	 * This is a Private Constructor i.e,o-param Constructor
	 */
	private LazySingleton() {
		if(instance!=null)
			throw new IllegalStateException("Object Cannot be Created Using Reflection");
		System.out.println("LazySingleton.LazySingleton()");
	}
	
	/**
	 * LAZY SINGLETON Environment
	 * This is a Static factory Method which is Create New Instance for first Time and 
	 * the Same Object Will return after then
	 * @return Instance
	 */
	
	public static  LazySingleton getInstance() {
		if(instance==null) 
			instance=new LazySingleton();//Creates 2 Objects by 2 Threads
		return instance;
	}
	
	/**
	 * MULTITHREADING  Environment
	 * To avoid the Race Condition In the MultiThreading Environment Keep the Synchronized KeyWord .
	 * To avoid the Creating  Two Objects Double Check the Condition
	 * To Acheive it Remove the synchronized keyword from the Method level. see the Code Below for the DOuble check
	 * @return Instance
	 */
	/*
	public static synchronized LazySingleton getInstance() {
		if(instance==null) 
			instance=new LazySingleton();//Creates 2 Objects by 2 Threads
		return instance;
	}
	*/
	/**
	 * Double checking the Condition
	 * @return Instance
	 */
	/*
	public static final LazySingleton getInstance() {
		if(instance==null) //First Null Check
			synchronized(LazySingleton.class) {
				if(instance==null)//Second Null Check
					instance=new LazySingleton();
			}
		return instance;
	}
*/
}
