package com.springlearn.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springlearn.core.coach.Coach;
import com.springlearn.core.coach.CricketCoach;

public class OriginalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CricketCoach coach = context.getBean("myCoach1", CricketCoach.class);
		
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getEmail());
		
	}

}
