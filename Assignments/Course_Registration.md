Problem Statement: 
Managing a University Course Registration System
You need to design a system for a university to manage its course offerings, 
student registrations, and instructor assignments.

# Course Registration System

## Questions-
1. Does course should have restriction to the number of Registrations?

## Analysis-
1. University should create and manage courses.
2. University will manage instructors.
3. University will manage student records.
4. Student should register in the course.
5. Student can view the course schedule.
6. Student can manage their enrollment.
7. Instructor will teach course.

## Class
1. University-
   1. Attributes- id, name, administrator, instructor(list), course, student
   2. Methods- get/set

2. Administrator-
    1. Attributes- id, name, course(list), instructor
    2. Methods- setCourseCode, setCourseName, setCourseDescription, setPrerequisites, assignCourseToInstructor

3. Instructor-
    1. Attributes- id, name, specialization, course, student
    2. Methods- get/set, viewAssignedCourse, viewEnrolledStudents, manageAttendence

4. Course- 
    1. Attributes- code, name, description, prerequisite, instructor, schedule, maximumEnrollmentCapacity, currentEnrollment
    2. Methods- get/set
   
5. Student- 
    1. Attributes- id, Name, courseAvailability(enum), Course
    2. Methods- checkCourseAvailability, registerForCourse, viewRegisteredCourse, 

## Enum
1. CourseAvailability- Open, Closed, Cancelled




