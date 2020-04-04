package com.nt.singleton;

public class DoubleCheckingSingleton {

	/**
	 * This is Static Reference variable of the Current Class
	 */
	private static DoubleCheckingSingleton instance;

	
	
	/**
	 * This is a Private Constructor i.e,o-param Constructor
	 */
	private DoubleCheckingSingleton() {
		System.out.println("DoubleCheckingSingleton.DoubleCheckingSingleton()");
	}
	
	/**
	 * Double checking the Condition
	 * @return Instance
	 */
	public static final DoubleCheckingSingleton getInstance() {
		if(instance==null) //First Null Check
			synchronized(DoubleCheckingSingleton.class) {
				if(instance==null)//Second Null Check
					instance=new DoubleCheckingSingleton();
			}
		return instance;
	}


}
