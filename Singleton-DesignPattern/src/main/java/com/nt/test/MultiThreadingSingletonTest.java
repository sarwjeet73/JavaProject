package com.nt.test;

public class MultiThreadingSingletonTest {

		public static void main(String[] args) {
			Thread t1,t2=null;
			TicketBookingServlet servlet=null;
			//Intialize Servlet
			servlet=new TicketBookingServlet();
			//Create Threads
			t1=new Thread(servlet);
			t2=new Thread(servlet);
			
			t1.start();
			t2.start();
			
		}
}
