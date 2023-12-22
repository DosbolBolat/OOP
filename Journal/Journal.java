package OOP.Journal;


import OOP.Courses.Course;
import OOP.Enums.Attendance;
import OOP.Enums.SemesterType;
import OOP.UserSystem.Student;
import OOP.UserSystem.Teacher;

import java.util.Date;
import java.util.Vector;

/**
* @generated
*/
public class Journal {
    
    /**
    * @generated
    */
    private Date date;
    
    /**
    * @generated
    */
    private Vector<Course> Course;
    
    /**
    * @generated
    */
    private SemesterType Semester;
    
    /**
    * @generated
    */
    private double grade;
    
    /**
    * @generated
    */
    private Attendance Attendance;
    
    
    /**
    * @generated
    */
    private Teacher teacher;
    
    /**
    * @generated
    */
    private Student student;
    
    

    /**
    * @generated
    */
    private Date getDate() {
        return this.date;
    }
    
    /**
    * @generated
    */
    private void setDate(Date date) {
        this.date = date;
    }
    
    
    /**
    * @generated
    */
    private Vector<Course> getCourse() {
        return this.Course;
    }
    
    /**
    * @generated
    */
    private void setCourse(Vector<Course> Course) {
        this.Course = Course;
    }
    
    
    /**
    * @generated
    */
    private SemesterType getSemester() {
        return this.Semester;
    }
    
    /**
    * @generated
    */
    private void setSemester(SemesterType Semester) {
        this.Semester = Semester;
    }
    
    
    /**
    * @generated
    */
    private double getGrade() {
        return this.grade;
    }
    
    /**
    * @generated
    */
    private void setGrade(Double grade) {
        this.grade = grade;
    }
    
    
    /**
    * @generated
    */
    private Attendance getAttendance() {
        return this.Attendance;
    }
    
    /**
    * @generated
    */
    private void setAttendance(Attendance Attendance) {
        this.Attendance = Attendance;
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
    
    
    

    //                          Operations                                  
    
    /**
    * @generated
    */
    public void ViewJournal() {
    }
    
    
}
