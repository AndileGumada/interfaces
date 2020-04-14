package com.oca.animals;

public interface BaseInterface1 {
	String getString();
	
	default void saySomething(){
		System.out.println("Base 1");
	}
	static String status() {
		System.out.println("");
		return "";
	} 
}
