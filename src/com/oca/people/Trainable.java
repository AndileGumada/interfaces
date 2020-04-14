package com.oca.people;

public interface Trainable {
	
	public void attendTraining();
	
	static String currentPosition() {
		
		return "Home";
	}
	
	static int maxDistance() {
		// TODO Auto-generated method stub
		return 100;
	}
}
