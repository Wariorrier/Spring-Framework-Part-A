package com.springlearn.core;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Coach coach = new TrackCoach();
        System.out.println(coach.getDailyWorkout());
    }
}
