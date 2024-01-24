package BehavioralPatterns.StrategyPattern.context;

import BehavioralPatterns.StrategyPattern.entity.WorkoutStrategy;

public class WorkoutPlanner {
    private WorkoutStrategy workoutStrategy;

    public WorkoutPlanner(WorkoutStrategy workoutStrategy) {
        this.workoutStrategy = workoutStrategy;
    }

    public void setWorkoutStrategy(WorkoutStrategy workoutStrategy) {
        this.workoutStrategy = workoutStrategy;
    }

    public String generateWorkoutPlan() {
        return workoutStrategy.generateWorkoutPlan();
    }
}
