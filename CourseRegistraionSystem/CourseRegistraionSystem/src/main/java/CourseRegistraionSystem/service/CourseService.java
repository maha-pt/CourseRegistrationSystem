package CourseRegistraionSystem.service;


import CourseRegistraionSystem.model.Course;
import CourseRegistraionSystem.model.CourseRegistry;
import CourseRegistraionSystem.repository.CourseRegistryRepo;
import CourseRegistraionSystem.repository.CourseRepository;
import org.hibernate.boot.internal.Abstract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CourseRegistryRepo courseRegistryRepo;

    public List<Course> availableCourse() {

        return courseRepository.findAll();
    }

    public List<Course> addCourse(Course course) {

        return Collections.singletonList(courseRepository.save(course));
    }

    public List<CourseRegistry> entrollstudents() {
        return courseRegistryRepo.findAll();
    }

    public CourseRegistry entrolledstudents(CourseRegistry courseRegistry) {
        return courseRegistryRepo.save(courseRegistry);
    }

    public void entrolledstudents(String courseName, String emailId, String name) {
        CourseRegistry courseRegistry= new CourseRegistry(courseName,emailId,name);
        courseRegistryRepo.save(courseRegistry);
    }
}
