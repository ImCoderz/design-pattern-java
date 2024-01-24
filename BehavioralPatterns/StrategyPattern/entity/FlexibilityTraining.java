package BehavioralPatterns.StrategyPattern.entity;

public class FlexibilityTraining implements WorkoutStrategy {
    @Override
    public String generateWorkoutPlan() {
        return "Include stretches and yoga poses for flexibility training.";
    }
}