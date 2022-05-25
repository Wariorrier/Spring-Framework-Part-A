package com.springlearn.annotation;

import com.springlearn.annotation.coach.BaseballCoach;
import com.springlearn.annotation.coach.Coach;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Coach coach = new BaseballCoach();
        System.out.println(coach.getDailyWorkout());
    }
}
