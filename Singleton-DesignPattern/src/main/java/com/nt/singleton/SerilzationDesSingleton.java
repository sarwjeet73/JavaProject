package com.nt.singleton;

/**
 * This Class Is Extending from the MyClone
 * @author ATISH
 *
 */
public class SerilzationDesSingleton extends MyClone{
	
	/**
	 * This is a Static Reference Variable to hold the Current Class Object
	 */
	private static SerilzationDesSingleton instance;
	
	/**
	 * This is 0-Param Constructor
	 */
	private SerilzationDesSingleton() {
	System.out.println("SerilzationDesSingleton.SerilzationDesSingleton()");
	}
	
	/**
	 * OverRiding the ReadResolve Method to Maintain the Singleton Behavior 
	 * @return
	 */
	public Object readResolve() {
		return instance;
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
	public static final SerilzationDesSingleton getInstance() {
		if(instance==null)
			instance=new SerilzationDesSingleton();
		return instance;
	}
}
