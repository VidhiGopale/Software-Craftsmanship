# Fitness Tracking Application - OOMD
### Fitness Tracking Application
Problem Statement:

You are tasked with designing a simple fitness tracking application for individual 
users. The system should help users log their workouts, track progress, and manage
their exercises.

### Questions
1. Do we allow user to send notifications to user?
2. Do we need to add the goal?-Yes
3. Do we want detailed stats?
4. Do we want to generate report?
5. Do we allow user to delete or update workout?
6. Do we want to store user's data at our database or store it at their local machine?

### Classes

1. User
   1. Attributes: id, name, weight, height, age, exerciseList, progress, goals
   2. Behaviours: login, get/set/update, addExercise, removeExercise, updateExercise,viewProgress, updateProgress,addGoal,updateGoal,deleteGoal

2. Exercise
    1. Attributes: id, duration, exerciseType(enum), date, caloriesBurned
    2. Behaviours: get/set , addCaloriesBurned
   
3. Progress
    1. Attributes: id, weightProgress, exerciseSummary(eg.zumba: 1 hr)
    2. Behaviours: get/set, addWeightProgress, addExerciseSummary

4. Goal
   1. Attributes: id, goalType(enum), targetHeight, targetWeight, targetDate
   2. Behaviours: viewGoal , updateGoal

### Enums
1. ExerciseType : Cardio, StrengthTraining, Zumba, Yoga
2. GoalType : WeightLoss, WeightGain, Flexibility, Stamina

