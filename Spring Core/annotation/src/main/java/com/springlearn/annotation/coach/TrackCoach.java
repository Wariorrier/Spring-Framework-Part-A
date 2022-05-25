package com.springlearn.annotation.coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.springlearn.annotation.fortune.FortuneServices;

@Component
public class TrackCoach implements Coach {

	@Autowired
	@Qualifier("randomFortune")
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
