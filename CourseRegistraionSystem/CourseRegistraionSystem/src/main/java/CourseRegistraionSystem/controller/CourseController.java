package CourseRegistraionSystem.controller;


import CourseRegistraionSystem.model.Course;
import CourseRegistraionSystem.model.CourseRegistry;
import CourseRegistraionSystem.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5500")
public class CourseController {


    @Autowired
    CourseService courseService;

    @GetMapping("Course")
    public List<Course> availableCourse(){
        return courseService.availableCourse();
    }


    @PostMapping("add/course")
    public ResponseEntity<String> addCourse(@RequestBody Course course){
        courseService.addCourse(course);
        return new ResponseEntity<>("added..",HttpStatus.CREATED);
    }



    @GetMapping("/course/entrolledStudent")
    public List<CourseRegistry> entrollStudent(){
        return courseService.entrollstudents();
    }


    @PostMapping("/course/register")
    public String entrolledstudents(@RequestParam ("courseName") String CourseName,
                                            @RequestParam("emailId") String emailId,
                                            @RequestParam("name") String name){
         courseService.entrolledstudents(CourseName,emailId,name);
         return "congratulation! "+name+"for your  entrollment successfull for"   +CourseName;
    }
}
