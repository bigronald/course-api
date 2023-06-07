package org.creatonworks.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CourseService {
@Autowired
 private CourseRepository courseRepository;
public Course course = new Course();

/*private List<Course> courses =new ArrayList<>( Arrays.asList(
        new Course("spring","SpringTests","Spring testing handbook"),
        new Course("vb.net","VB.Net Tests","Visual Basic testing handbook"),
        new Course("java","JavaTests","Java testing handbook")
));*/

public List<Course> getAllCourses(){
    List<Course> courses = new ArrayList<>();
    courseRepository.findAll().forEach(courses::add);
    return courses;
}

public Course getCourse(String id){

    return courseRepository.findById(id);
//return topicRepository.findById(Id id);
   // return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
}

    public void addCourse(Course course) {
    courseRepository.save(course);
    }

    public void updateCourse(String id, Course course) {
      /**  for (int i = 0; i < topics.size(); i++){
            Topic t = topics.get(i);
            if(t.getId().equals(id)){
                topics.set(i,topic);
                return;
            }

        }**/

      courseRepository.save(course);

}
    public void deleteCourse(String id) {
    courseRepository.deleteById(id);
    //topics.removeIf(t->t.getId().equals(id));
    }
}
