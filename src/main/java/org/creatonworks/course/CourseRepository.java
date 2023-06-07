package org.creatonworks.course;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;

public interface CourseRepository extends JpaRepository<Course, Id> {
    Course findById(String id);
    Course deleteById(String id);
}
