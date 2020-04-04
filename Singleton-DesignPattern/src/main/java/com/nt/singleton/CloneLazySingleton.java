package com.nt.singleton;

/**
 * This Class Is Extending from the MyClone
 * @author ATISH
 *
 */
public class CloneLazySingleton extends MyClone{
	
	/**
	 * This is a Static Reference Variable to hold the Current Class Object
	 */
	private static CloneLazySingleton instance;
	
	/**
	 * This is 0-Param Constructor
	 */
	private CloneLazySingleton() {
	System.out.println("CloneLazySingleton.CloneLazySingleton()");
	}
	/**
	 * Throwing the Exception that Object will not Created
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
			throw new CloneNotSupportedException();
		}
 /**
  * This is Static factory Method
  * @return Instance
  */
	public static final CloneLazySingleton getInstance() {
		if(instance==null)
			instance=new CloneLazySingleton();
		return instance;
	}
}
