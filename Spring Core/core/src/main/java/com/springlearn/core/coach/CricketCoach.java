package com.springlearn.core.coach;

import com.springlearn.core.fortune.FortuneServices;

public class CricketCoach implements Coach {

	private String email;
	private FortuneServices fortune;
	
	public CricketCoach() {
		// TODO Auto-generated constructor stub
	}
	
	public FortuneServices getFortune() {
		return fortune;
	}

	public void setFortune(FortuneServices fortune) {
		this.fortune = fortune;
	}

	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "10min spinning";
	}

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortune.getFortune();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
