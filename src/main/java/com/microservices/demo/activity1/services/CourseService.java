package com.microservices.demo.activity1.services;

import com.microservices.demo.activity1.entities.Course;

import java.util.List;

public interface CourseService {
    public List<Course> getAllCourses();

    Course getCourseById(int i);

    String addCourse(Course course);

    String deleteCourseById(int id);

    Course updateCourseById(int id, Course course);

    Course getCourseByTitle(String title);

}
