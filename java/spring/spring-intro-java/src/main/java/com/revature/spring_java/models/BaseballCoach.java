package com.revature.spring_java.models;

import com.revature.spring_java.services.MotivationService;
import com.revature.spring_java.services.WorkoutService;

public class BaseballCoach implements Coach {

    private final MotivationService motivationService;
    private final WorkoutService workoutService;

    public BaseballCoach(MotivationService motivationService, WorkoutService workoutService) {
        System.out.println("BaseballCoach#<init> invoked!");
        this.motivationService = motivationService;
        this.workoutService = workoutService;
    }

    @Override
    public String getDailyWorkout() {
        return workoutService.fetchWorkoutRegimen("baseball");
    }

    @Override
    public String getMotivation() {
        return motivationService.fetchMotivationalQuote();
    }

    @Override
    public MotivationService getMotivationService() {
        return motivationService;
    }

}
