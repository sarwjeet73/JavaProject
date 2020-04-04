package com.nt.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.nt.singleton.SerilzationDesSingleton;

public class SerializationSingletonTest {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		SerilzationDesSingleton object1,object2=null;
		ObjectOutputStream oos=null;
		ObjectInputStream ois=null;
		
		object1=SerilzationDesSingleton.getInstance();
		System.out.println("Object 1 ::"+object1.hashCode());
		
		//Seralization
		oos=new ObjectOutputStream(new FileOutputStream("I:/singleton.ser"));
		oos.writeObject(object1);
		oos.close();
		System.out.println("Serialization Performed");
		
		//DeSeralization
		ois=new ObjectInputStream(new FileInputStream("I:/singleton.ser"));
		object2=(SerilzationDesSingleton) ois.readObject();
		ois.close();
		System.out.println("DeSerialization Completed");
		System.out.println("Object 2 ::"+object2.hashCode());
	}

}
