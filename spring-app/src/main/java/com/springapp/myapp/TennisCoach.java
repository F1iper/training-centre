package com.springapp.myapp;

public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Play tennis 35 minutes";
    }
}
