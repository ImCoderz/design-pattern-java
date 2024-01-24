package BehavioralPatterns.StrategyPattern.entity;

public class Cardio implements WorkoutStrategy {
    @Override
    public String generateWorkoutPlan() {
        return "Engage in cardiovascular exercises like running, cycling, or swimming.";
    }
}
