package OOP.Courses;

import OOP.Enums.DayOfWeek;
import OOP.Enums.LessonType;
import OOP.UserSystem.Student;
import OOP.UserSystem.Teacher;

import java.util.Vector;

/**
* @generated
*/
public class Lesson {
    
    /**
    * @generated
    */
    private String courseName;
    
    /**
    * @generated
    */
    private DayOfWeek day;
    
    /**
    * @generated
    */
    private Teacher teacher;
    
    /**
    * @generated
    */
    private int startTime;
    
    /**
    * @generated
    */
    private LessonType type;
    
    
    /**
    * @generated
    */
    private Course course;
    
    /**
    * @generated
    */
    private Room room;
    
    

    /**
    * @generated
    */
    private String getCourseName() {
        return this.courseName;
    }
    
    /**
    * @generated
    */
    private void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
    
    /**
    * @generated
    */
    private DayOfWeek getDay() {
        return this.day;
    }
    
    /**
    * @generated
    */
    private void setDay(DayOfWeek day) {
        this.day = day;
    }
    
    
    /**
    * @generated
    */
    private Teacher getTeacher() {
        return this.teacher;
    }
    
    /**
    * @generated
    */
    private void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    
    
    /**
    * @generated
    */
    private int getStartTime() {
        return this.startTime;
    }
    
    /**
    * @generated
    */
    private void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    
    /**
    * @generated
    */
    private void setType(LessonType type) {
        this.type = type;
    }
    
    
    
    /**
    * @generated
    */
    public Course getCourse() {
        return this.course;
    }
    
    /**
    * @generated
    */
    public void setCourse(Course course) {
        this.course = course;
    }
    
    
    /**
    * @generated
    */
    public Room getRoom() {
        return this.room;
    }
    
    /**
    * @generated
    */
    public void setRoom(Room room) {
        this.room = room;
    }
    
    
    

    //                          Operations                                  
    
    /**
    * @generated
    */
    public LessonType getType() {
        return this.type;
    }
    
    /**
    * @generated
    */
    public Vector<Student> students() {
        //TODO
        return null;
    }
    
    
}
