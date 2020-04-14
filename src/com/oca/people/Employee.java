package com.oca.people;

import java.time.LocalDateTime;

public class Employee {
	
	String name;
	String address;
	String phoneNumber;
	float experience;
	
	//a static method defined in the class can be called using Class name or reference variable	
	static void myStatic() {
		System.out.println("This is my static method");
	}
}

class MyClass {
	
	public static void main(String args[]) {
		//static utility methods can be called using the 
		Interviewer.bookConferenceRomm(LocalDateTime.now(), 2);
		Employee.myStatic();
		
		Trainable manager = new Manager();
		System.out.println(Trainable.maxDistance());//we can not reference a static from a non static context
		System.out.println("The current position i'm at :"+Trainable.currentPosition());

	}

}