package com.springlearn.core.coach;

import com.springlearn.core.fortune.FortuneServices;

public class TrackCoach implements Coach {

	private FortuneServices fortune;
	
	public TrackCoach(FortuneServices fortune) {
		super();
		this.fortune = fortune;
	}

	public TrackCoach() {
		// TODO Auto-generated constructor stub
	}

	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "10 min running";
	}

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortune.getFortune();
	}

}
