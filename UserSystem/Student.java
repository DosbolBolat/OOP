package OOP.UserSystem;

import OOP.Courses.Course;
import OOP.Courses.Schedule;
import OOP.Enums.Degree;
import OOP.Enums.Schools;
import OOP.Journal.Journal;
import OOP.Library.Book;
import OOP.RequestSystem.Request;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import OOP.Transcript.Mark;
import OOP.Transcript.Transcript.Transcript;

/**
* @generated
*/
public class Student extends User {

    private Vector<Course> courses;

    private Degree studentType;

    private Schools facultyName;

    private int year;

    private Transcript transcript;
    private Set<Request> request;

    private Set<Journal> journal;

    private Schedule schedule;

    public Student(String username, String password, Schools facultyName) {
        super(username, password);
        this.facultyName = facultyName;

    }

    public Vector<Course> getCourses() {
        return this.courses;
    }

    public void setCourses(Vector<Course> courses) {
        this.courses = courses;
    }

    public Degree getStudentType() {
        return this.studentType;
    }

    public void setStudentType(Degree studentType) {
        this.studentType = studentType;
    }

    public Schools getFacultyName() {
        return this.facultyName;
    }

    public void setFacultyName(Schools facultyName) {
        this.facultyName = facultyName;
    }
    
    
    /**
    * @generated
    */
    public int getYear() {
        return this.year;
    }
    
    /**
    * @generated
    */
    public void setYear(Integer year) {
        this.year = year;
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
    public Set<Request> getRequest() {
        if (this.request == null) {
            this.request = new HashSet<Request>();
        }
        return this.request;
    }
    
    /**
    * @generated
    */
    public void setRequest(Set<Request> request) {
        this.request = request;
    }
    
    
    /**
    * @generated
    */
    public Transcript getTranscript() {
        return this.transcript;
    }

    public void setTranscript(Transcript transcript) {
        this.transcript = transcript;
    }

    public Set<Journal> getJournal() {
        if (this.journal == null) {
            this.journal = new HashSet<Journal>();
        }
        return this.journal;
    }

    public void setJournal(Set<Journal> journal) {
        this.journal = journal;
    }

    public void showStudentMenu() {
        User u = this;
        u.showUserMenu();
        System.out.println("3. Student's schedule.");
        System.out.println("4. Student's courses.");
        System.out.println("5. Student's transcript.");
        System.out.println("6. Logout.");
    }

    public void viewTranscript() {
        for(Map.Entry<Course, Mark> hm: transcript.getCourseMarkHashMap().entrySet()) {
            System.out.println("- " + hm.getKey().getCourseName() + " " + hm.getValue().CalculateGP() + " " + hm.getValue().getMark());
        }
    }
    public void viewCourses(){
        for (Map.Entry<Course, Mark> hm : transcript.getCourseMarkHashMap().entrySet()) {
            System.out.println("- Course name " + hm.getKey().getCourseName() + " - credits " + hm.getKey().getCreditsNumber());
        }
    }


    public double viewGPA() {
        //TODO
        return 0.0;
    }
    

    public boolean addDrop() {
        //TODO
        return false;
    }

    public boolean registerForCourses() {
        //TODO
        return false;
    }


    public void displaySchedule() {

    }


    public void receiveBook(Book book) {
    }
}
