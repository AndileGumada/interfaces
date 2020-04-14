package com.oca.people;

import java.time.LocalDateTime;

public interface Interviewer {
	
	public abstract void conductInterview();
	
	int AGE = 10;//all the variables in an interface are implicitly public , final and static
	abstract String currentPosition();
	
	static Object submitInterviewStatus() {
		System.out.println("Accept");
		return null;
	}
	//static utility method used to book the conference room for an interview 
	static String bookConferenceRomm(LocalDateTime dateTime, int duration) {
		System.out.println("Interview scheduled on :"+ dateTime);
		System.out.println("Book conference room for "+duration + "hrs");
		return null;
	}
}
