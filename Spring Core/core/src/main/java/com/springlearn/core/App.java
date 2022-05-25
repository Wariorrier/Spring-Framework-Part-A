package com.springlearn.core;

import com.springlearn.core.coach.BaseballCoach;
import com.springlearn.core.coach.Coach;

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
