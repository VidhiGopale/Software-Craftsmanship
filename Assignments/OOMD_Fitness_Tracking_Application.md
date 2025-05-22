# Fitness Tracking Application - OOMD
### Fitness Tracking Application
Problem Statement:

You are tasked with designing a simple fitness tracking application for individual 
users. The system should help users log their workouts, track progress, and manage
their exercises.

### Questions
1. Do we allow user to send notifications to user?
2. Do we need to add the goal?
3. Do we want detailed stats?
4. Do we want report?
5. Do we allow user to delete or update workout?
6. Do we want to store user's data at our database or store it at their local machine?
7. Do we want to track bp?
8. Do we want to track sugar?
9. 

### Classes

1. User
   1. Attributes: id, name, weight, height, age
   2. Behaviours: login, get/set/update, addExercise, removeExercise, updateExercise,addProgress,viewProgress, updateProgress

2. Exercise
    1. Attributes: id, duration, exerciseType(enum), date
    2. Behaviours: get/set
   
3. Progress
    1. Attributes: id, height, weight
    2. Behaviours: get/set



### Enums
1. ExerciseType: Cardio, Strenth Training, Zumba, Yoga
2. GoalType

