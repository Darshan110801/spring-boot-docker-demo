package com.microservices.demo.activity1.servicesImpl;

import com.microservices.demo.activity1.dao.CourseDao;
import com.microservices.demo.activity1.entities.Course;
import com.microservices.demo.activity1.services.CourseService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseDao courseDao;
    @Autowired
    EntityManager entityManager;
    public CourseServiceImpl(){


    }
    @Override
    public List<Course> getAllCourses() {
        return this.courseDao.findAll();
    }

    @Override
    public Course getCourseById(int i) {
//        return this.courseDao.findById(i);
        return this.courseDao.findById(i).orElse(null);
    }

    @Override
    public String addCourse(Course course) {
        this.courseDao.save(course);
        return "Course saved. ID : "+course.getId();
    }
    @Override
    public String deleteCourseById(int id)  {
        this.courseDao.deleteById(id);
        return "Deleted Course with id : "+ id;
    }

    @Override
    public Course updateCourseById(int id, Course course) {

        Course course1  = this.courseDao.findById(id).orElse(null);
        if(course1 == null)
        {
            return course1;
        }
        else {
            course1.setTitle(course.getTitle());
            course1.setDescription(course.getDescription());
            return this.courseDao.save(course1);
        }
    }

    @Override
    public Course getCourseByTitle(String title) {
        TypedQuery<Course> getCourseByNameQuery = entityManager.createQuery("From Course where title=:name",Course.class);
        getCourseByNameQuery.setParameter("name",title);



        return getCourseByNameQuery.getSingleResult();
    }




}
