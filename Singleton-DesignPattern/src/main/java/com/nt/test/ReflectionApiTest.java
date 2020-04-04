package com.nt.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.nt.singleton.LazySingleton;

public class ReflectionApiTest {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		LazySingleton object1,object2 = null;
		
		object1=LazySingleton.getInstance();
		System.out.println("Object 1 ::"+object1.hashCode());
		
		Constructor[] constructors=LazySingleton.class.getDeclaredConstructors();
 		for(Constructor constructor:constructors) {
 			constructor.setAccessible(true);
 			object2=(LazySingleton) constructor.newInstance();
 			System.out.println("Object 2 ::"+object2.hashCode());
 		}
 		System.out.println("Object 1 and Object 2 are Referring to the Same Object ?"+(object1==object2));
 	 
 	
		/*
		//Approach2
		Class clazz;
		Constructor[] constructor;
		try {
			//load the Clazz
			clazz=Class.forName("com.nt.singleton.LazySingleton");
			//All get all declared Constrctor
			constructor=clazz.getDeclaredConstructors();
			//providing acess to private Constructor
			constructor[0].setAccessible(true);
			//Create Object using above accessed Constructor
			object1=(LazySingleton) constructor[0].newInstance(null);
			System.out.println("Object 1 ::"+object1.hashCode());
			object2=LazySingleton.getInstance();
			System.out.println("Object 1 ::"+object1.hashCode());
		}catch (Exception e) {
			e.printStackTrace();
		}
		*/
	}

}
