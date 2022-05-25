package com.springlearn.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.springlearn.annotation.coach.Coach;

@Configuration
@ComponentScan("com.springlearn.annotation")
public class JavaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaMain.class);
		
//		Coach coach = context.getBean("cricketCoach", Coach.class);
		Coach coach = context.getBean("coach", Coach.class);
//		Coach coach = context.getBean("trackCoach", Coach.class);
		
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
	}

}
