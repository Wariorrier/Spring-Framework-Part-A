package com.springlearn.core.coach;

import com.springlearn.core.fortune.FortuneServices;

public class BaseballCoach implements Coach{

	private FortuneServices fortune;
	
	public BaseballCoach(FortuneServices fortune) {
		super();
		this.fortune = fortune;
	}

	public BaseballCoach() {
		// TODO Auto-generated constructor stub
	}

	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "10 min Batting";
	}

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortune.getFortune();
	}
	
}
