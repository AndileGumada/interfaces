package com.oca.people;

public class Manager extends Employee implements Interviewer,Trainable{
	
	int teamSize;
	void reportProjectStatus() {
		
	}
	public Object submitInterviewStatus() {
		System.out.println("Accept");
		return null;
	}
	
	@Override
	public void attendTraining() {
		System.out.println("Manager attends training");
		
	}
	@Override
	public void conductInterview() {
		System.out.println("Manager conducts interviewers");
		
	}
	
	public String submitInterviewerStatus() {
		
		return null;
		
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
