package com.springlearn.annotation.coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.springlearn.annotation.fortune.FortuneServices;

// Implementing explicit component naming
@Component("coach")
public class BaseballCoach implements Coach{

	private FortuneServices fortune;
	
	// Implementing Autowiring
	// Constructor Injection
	@Autowired
	public BaseballCoach(@Qualifier("randomFortune")FortuneServices fortune) {
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
