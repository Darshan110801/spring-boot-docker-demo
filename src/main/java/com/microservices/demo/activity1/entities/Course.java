package com.microservices.demo.activity1.entities;

import jakarta.persistence.*;
import org.hibernate.id.factory.spi.GenerationTypeStrategy;

import java.util.Objects;

@Entity
@Table(name="Course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String description;

    private String courseType;

    private Integer numStudents;

    public Course(int id, String title, String description, String courseType, Integer numStudents) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.courseType = courseType;
        this.numStudents = numStudents;
    }
    public Course()
    {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public Integer getNumStudents() {
        return numStudents;
    }

    public void setNumStudents(Integer numStudents) {
        this.numStudents = numStudents;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", courseType='" + courseType + '\'' +
                ", numStudents=" + numStudents +
                '}';
    }
}
