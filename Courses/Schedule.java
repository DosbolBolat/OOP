package OOP.Courses;
import OOP.Enums.*;
import OOP.UserSystem.Student;
import OOP.UserSystem.Teacher;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


/**
* @generated
*/
public class Schedule {
    
    /**
    * @generated
    */
    private String ID;
    
    /**
    * @generated
    */
    private HashMap<HashMap<DayOfWeek, Date>, Course> ListOfCourses;
    
    
    /**
    * @generated
    */
    private Teacher teacher;
    
    /**
    * @generated
    */
    private Set<Course> course;
    
    /**
    * @generated
    */
    private Student student;
    
    

    /**
    * @generated
    */
    private String getID() {
        return this.ID;
    }
    
    /**
    * @generated
    */
    private void setID(String ID) {
        this.ID = ID;
    }
    
    
    /**
    * @generated
    */
    private HashMap<HashMap<DayOfWeek, Date>, Course> getListOfCourses() {
        return this.ListOfCourses;
    }
    
    /**
    * @generated
    */
    private void setListOfCourses(HashMap<HashMap<DayOfWeek, Date>, Course> ListOfCourses) {
        this.ListOfCourses = ListOfCourses;
    }
    
    
    
    /**
    * @generated
    */
    public Teacher getTeacher() {
        return this.teacher;
    }
    
    /**
    * @generated
    */
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    
    
    /**
    * @generated
    */
    public Student getStudent() {
        return this.student;
    }
    
    /**
    * @generated
    */
    public void setStudent(Student student) {
        this.student = student;
    }
    
    
    /**
    * @generated
    */
    public Set<Course> getCourse() {
        if (this.course == null) {
            this.course = new HashSet<Course>();
        }
        return this.course;
    }
    
    /**
    * @generated
    */
    public void setCourse(Set<Course> course) {
        this.course = course;
    }
    
    
    
}
