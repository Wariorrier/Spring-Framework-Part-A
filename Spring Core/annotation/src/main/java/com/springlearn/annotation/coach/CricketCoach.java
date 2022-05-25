package com.springlearn.annotation.coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.springlearn.annotation.fortune.FortuneServices;

@Component
public class CricketCoach implements Coach {

	private String email;
	
	private FortuneServices fortune;
	
	public CricketCoach() {
		// TODO Auto-generated constructor stub
	}
	
	public FortuneServices getFortune() {
		return fortune;
	}

	@Autowired
	@Qualifier("happyFortune")
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
