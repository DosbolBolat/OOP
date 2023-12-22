package OOP.UserSystem;


import OOP.Courses.Course;
import OOP.Courses.Schedule;
import OOP.Enums.TeacherRank;
import OOP.Journal.Journal;

import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

/**
* @generated
*/
public class Teacher extends Employee{

    private TeacherRank teacherType;
    private Vector<Course> coursesTaken;

    private Schedule schedule;

    private Set<Journal> journal;

    public Teacher(String username, String password,int salary, int workExperience, TeacherRank teacherType, Vector<Course> coursesTaken, Schedule schedule, Set<Journal> journal) {
        super(username, password,salary, workExperience);
        this.teacherType = teacherType;
        this.coursesTaken = coursesTaken;
        this.schedule = schedule;
        this.journal = journal;
    }

    private TeacherRank getTeacherType() {
        return this.teacherType;
    }
    
    /**
    * @generated
    */
    private void setTeacherType(TeacherRank teacherType) {
        this.teacherType = teacherType;
    }
    
    
    /**
    * @generated
    */
    private Vector<Course> getCoursesTaken() {
        return this.coursesTaken;
    }
    
    /**
    * @generated
    */
    private void setCoursesTaken(Vector<Course> coursesTaken) {
        this.coursesTaken = coursesTaken;
    }
    
    
    /**
    * @generated
    */
    private Schedule getSchedule() {
        return this.schedule;
    }
    
    /**
    * @generated
    */
    private void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    
    /**
    * @generated
    */
    public Set<Journal> getJournal() {
        if (this.journal == null) {
            this.journal = new HashSet<Journal>();
        }
        return this.journal;
    }
    
    /**
    * @generated
    */
    public void setJournal(Set<Journal> journal) {
        this.journal = journal;
    }
    
    
    

    //                          Operations                                  
    
    /**
    * @generated
    */
    public void putMark() {

    }
    
    /**
    * @generated
    */
    public void viewCourse() {

    }
    
    /**
    * @generated
    */
    public Vector<Course> getCoursesTakem() {
        //TODO
        return null;
    }
    
    /**
    * @generated
    */
    public boolean putFirstAttestationMark() {
        //TODO
        return false;
    }
    
    /**
    * @generated
    */
    public boolean putSecondAttestation() {
        //TODO
        return false;
    }
    
    /**
    * @generated
    */
    public boolean putFinalAttestationMark() {
        //TODO
        return false;
    }
    
    
}
