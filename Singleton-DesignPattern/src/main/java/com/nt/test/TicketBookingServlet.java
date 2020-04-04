package com.nt.test;

import com.nt.singleton.LazySingleton;

/**
 * This Class is implemented from the Runnable interface
 * @author ATISH
 *
 */
public class TicketBookingServlet implements Runnable{
	
	public void run() {
		LazySingleton object1=null;
		object1=LazySingleton.getInstance();
		  System.out.println("Thread name::"+Thread.currentThread().getName()+"hashcode ::  "+object1.hashCode());
	}

}
