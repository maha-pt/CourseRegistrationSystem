package CourseRegistraionSystem.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="course")
public class Course {


    @Id
    private int courseId;
    private String courseName;
    private String trainer;
    private String durationInWeek;


    public Course() {
    }


    public Course(int courseId, String courseName, String trainer, String durationInWeek) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.trainer = trainer;
        this.durationInWeek = durationInWeek;
    }



    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    public String getDurationInWeek() {
        return durationInWeek;
    }

    public void setDurationInWeek(String durationInWeek) {
        this.durationInWeek = durationInWeek;
    }





}
