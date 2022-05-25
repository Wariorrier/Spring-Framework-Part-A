package com.springlearn.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springlearn.annotation.coach.Coach;

public class OriginalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		Coach coach = context.getBean("cricketCoach", Coach.class);
		Coach coach = context.getBean("coach", Coach.class);
//		Coach coach = context.getBean("trackCoach", Coach.class);
		
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
//		System.out.println(coach.getEmail());
		
	}

}
