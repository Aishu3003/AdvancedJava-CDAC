package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.Entities.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
