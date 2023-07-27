package com.microservices.demo.activity1.dao;

import com.microservices.demo.activity1.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface CourseDao extends JpaRepository<Course,Integer> {


}
