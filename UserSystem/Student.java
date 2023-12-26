package OOP.UserSystem;

import OOP.Courses.Course;
import OOP.Courses.Schedule;
import OOP.Enums.Degree;
import OOP.Enums.Schools;
import OOP.Journal.Journal;
import OOP.Library.Book;
import OOP.RequestSystem.Request;

import java.io.Serializable;
import java.util.*;

import OOP.Transcript.Mark;
import OOP.Transcript.Transcript.Transcript;

/**
* @generated
*/
public class Student extends User implements Serializable {

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
    public Student(String username, String password) {
        super(username, password);
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

    public int getYear() {
        return this.year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Schedule getSchedule() {
        return this.schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public Set<Request> getRequest() {
        if (this.request == null) {
            this.request = new HashSet<Request>();
        }
        return this.request;
    }

    public void setRequest(Set<Request> request) {
        this.request = request;
    }

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
    public void chooseCourse() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Available courses:");

        for (int i = 0; i < courses.size(); i++) {
            System.out.println((i + 1) + ". " + courses.get(i).getCourseName());
        }

        System.out.print("Choose a course (enter the corresponding number): ");
        int choice = scanner.nextInt();

        if (choice > 0 && choice <= courses.size()) {
            // Пользователь выбрал корректный номер курса
            Course selectedCourse = courses.get(choice - 1);
            // Теперь вы можете использовать этот выбранный курс для дальнейших действий
            System.out.println("You have chosen the course: " + selectedCourse.getCourseName());
            // Здесь вы можете, например, просмотреть журнал для выбранного курса
            viewJournal(selectedCourse);
        } else {
            System.out.println("Invalid choice. Please enter a valid number.");
        }
    }

    private void viewJournal(Course selectedCourse) {
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
