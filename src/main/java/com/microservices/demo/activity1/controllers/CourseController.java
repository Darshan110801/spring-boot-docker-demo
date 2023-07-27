package com.microservices.demo.activity1.controllers;

import com.microservices.demo.activity1.entities.Course;
import com.microservices.demo.activity1.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    CourseService courseService;
    @GetMapping("/")
    public String helloWorld()
    {
        return "Hello World!!!";
    }

    @GetMapping("courses")
    public List<Course> getAllCourses()
    {
        return this.courseService.getAllCourses();
    }

    @GetMapping("/courses/{id}")
    public Course getCourseById(@PathVariable String id)
    {
        return this.courseService.getCourseById(Integer.parseInt(id));
    }

    @PostMapping("/courses/")
    public String addCourse(@RequestBody Course course)
    {
        return this.courseService.addCourse(course);
    }

    @DeleteMapping("/courses/{id}")
    public String deleteCourseById(@PathVariable int id)
    {
        return this.courseService.deleteCourseById(id);
    }

    @PutMapping("/courses/{id}")
    public Course updateCourseById(@PathVariable int id,@RequestBody Course course)
    {
        return this.courseService.updateCourseById(id,course);
    }
    @GetMapping("/courseByTitle/{title}")
    public Course getCourseByTitle(@PathVariable String title)
    {
        return this.courseService.getCourseByTitle(title);
    }



}
