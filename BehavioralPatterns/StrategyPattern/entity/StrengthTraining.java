package BehavioralPatterns.StrategyPattern.entity;

public class StrengthTraining implements WorkoutStrategy {
    @Override
    public String generateWorkoutPlan() {
        return "Perform weight lifting exercises for strength training.";
    }
}
