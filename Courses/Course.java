package OOP.Courses;

import OOP.Enums.CourseType;
import OOP.Transcript.Mark;
import OOP.UserSystem.Student;
import OOP.UserSystem.Teacher;
import OOP.Transcript.Transcript.Transcript;

import java.util.HashMap;
import java.util.Vector;


public class Course {

    private String courseName;

    private int creditsNumber;

    private Vector<Teacher> listOfInstructors;

    public Course(String courseName, int creditsNumber) {
        this.courseName = courseName;
        this.creditsNumber = creditsNumber;
    }

    /**
    * @generated
    */
    private String courseCode;
    
    /**
    * @generated
    */
    private int maxStudentNumber;
    
    /**
    * @generated
    */
    private CourseType courseType;
    
    /**
    * @generated
    */
    private HashMap<Student, Mark> listOfStudent;
    
    
    /**
    * @generated
    */
    private Teacher teacher;
    
    /**
    * @generated
    */
    private Lesson lesson;

    private Schedule schedule;
    
    /**
    * @generated
    */
    private Student student;



    public String getCourseName() {
        return this.courseName;
    }
    
    /**
    * @generated
    */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
    
    /**
    * @generated
    */
    public int getCreditsNumber() {
        return this.creditsNumber;
    }
    
    /**
    * @generated
    */
    private void setCreditsNumber(Integer creditsNumber) {
        this.creditsNumber = creditsNumber;
    }

    
    /**
    * @generated
    */
    private void setListOfInstructors(Vector<Teacher> listOfInstructors) {
        this.listOfInstructors = listOfInstructors;
    }
    
    
    /**
    * @generated
    */
    private String getCourseCode() {
        return this.courseCode;
    }
    
    /**
    * @generated
    */
    private void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    
    /**
    * @generated
    */
    private void setMaxStudentNumber(Integer maxStudentNumber) {
        this.maxStudentNumber = maxStudentNumber;
    }
    
    
    /**
    * @generated
    */
    private CourseType getCourseType() {
        return this.courseType;
    }
    
    /**
    * @generated
    */
    private void setCourseType(CourseType courseType) {
        this.courseType = courseType;
    }
    
    
    /**
    * @generated
    */
    private HashMap<Student, Mark> getListOfStudent() {
        return this.listOfStudent;
    }
    
    /**
    * @generated
    */
    private void setListOfStudent(HashMap<Student, Mark> listOfStudent) {
        this.listOfStudent = listOfStudent;
    }
    
    
    
    /**
    * @generated
    */
    public Schedule getSchedule() {
        return this.schedule;
    }
    
    /**
    * @generated
    */
    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
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
    

    public Lesson getLesson() {
        return this.lesson;
    }
    
    /**
    * @generated
    */
    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
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
    public Teacher assignTeacher() {
        //TODO
        return null;
    }
    
    /**
    * @generated
    */
    public void setCourseCode() {
    }
    
    /**
    * @generated
    */
    public void setCourseName() {
    }
    
    /**
    * @generated
    */
    public void setCreditsNumber() {

    }
    
    /**
    * @generated
    */
    public Vector<Course> getPrerequisites() {
        //TODO
        return null;
    }
    
    /**
    * @generated
    */
    public Vector<Teacher> getListOfInstructors() {
        //TODO
        return null;
    }
    
    /**
    * @generated
    */
    public Vector<Student> getListOfStudents() {
        //TODO
        return null;
    }
    
    /**
    * @generated
    */
    public void setMaxStudentNumber() {
    }
    
    /**
    * @generated
    */
    public int getMaxStudentNumber() {
        //TODO
        return 0;
    }
    
    /**
    * @generated
    */
    public Student containts() {
        //TODO
        return null;
    }
    
    /**
    * @generated
    */
    public Student addStudent() {
        //TODO
        return null;
    }
    
    
}
