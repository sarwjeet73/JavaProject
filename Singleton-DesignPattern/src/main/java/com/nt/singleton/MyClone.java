package com.nt.singleton;

import java.io.Serializable;

public class MyClone implements Cloneable,Serializable {
	
@Override
	public Object clone() throws CloneNotSupportedException {
		System.out.println("CommonUtils.clone()");
		return super.clone();
	}

}
