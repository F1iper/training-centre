package com.springapp;

import com.springapp.myapp.BaseballCoach;
import com.springapp.myapp.Coach;
import com.springapp.myapp.TennisCoach;
import com.springapp.myapp.TrackCoach;

public class Main {
    public static void main(String[] args) {

        //create the object
        Coach baseballCoach = new BaseballCoach();
        Coach trackCoach = new TrackCoach();
        Coach tennisCoach = new TennisCoach();

        //use the object
        System.out.println(baseballCoach.getDailyWorkout());
        System.out.println(trackCoach.getDailyWorkout());
        System.out.println(tennisCoach.getDailyWorkout());
    }
}
