package com.oca.people;

//IS-A Relationship between the parent class and the subclass 
public class Programmer extends Employee  implements Trainable{
	String[] programmingLanguages;
	void writeCode() {}
	
	
	@Override
	public void attendTraining() {
		System.out.println("Programmer attends training");
		
	}


	public String currentPosition() {
		// TODO Auto-generated method stub
		return "home";
	}


	public int maxDistance() {
		// TODO Auto-generated method stub
		return 100;
	}
	
	
}
