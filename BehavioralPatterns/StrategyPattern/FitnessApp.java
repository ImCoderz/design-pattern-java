package BehavioralPatterns.StrategyPattern;

import java.util.Scanner;

import BehavioralPatterns.StrategyPattern.context.WorkoutPlanner;
import BehavioralPatterns.StrategyPattern.entity.Cardio;
import BehavioralPatterns.StrategyPattern.entity.FlexibilityTraining;
import BehavioralPatterns.StrategyPattern.entity.StrengthTraining;
import BehavioralPatterns.StrategyPattern.entity.WorkoutStrategy;

public class FitnessApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose your workout strategy (1: Strength Training, 2: Cardio, 3: Flexibility Training): ");
        String userPreference = scanner.nextLine();

        WorkoutStrategy strategy;
        switch (userPreference) {
            case "1":
                strategy = new StrengthTraining();
                break;
            case "2":
                strategy = new Cardio();
                break;
            case "3":
                strategy = new FlexibilityTraining();
                break;
            default:
                System.out.println("Invalid choice. Please choose a valid workout strategy.");
                scanner.close();
                return;
        }

        WorkoutPlanner workoutPlanner = new WorkoutPlanner(strategy);
        String workoutPlan = workoutPlanner.generateWorkoutPlan();

        System.out.println("Your personalized workout plan:");
        System.out.println(workoutPlan);
        scanner.close();
    }
}
