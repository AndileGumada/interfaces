package com.oca.animals;


public interface BaseInterface2 {
  String getSting();
  
  default void saySomething(){
		System.out.println("Base 2");
  }
  static void status() {
		System.out.println("");
  } 
}
