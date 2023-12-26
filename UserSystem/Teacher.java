package OOP.UserSystem;

import OOP.Courses.Course;
import OOP.Courses.Schedule;
import OOP.Enums.Attendance;
import OOP.Enums.TeacherRank;
import OOP.Journal.Journal;

import java.io.Serializable;
import java.util.Set;
import java.util.Vector;

public class Teacher extends Employee implements Serializable {

    private TeacherRank teacherType;
    private Vector<Course> coursesTaken;
    private Schedule schedule;
    private Set<Journal> journal;

    public Teacher(String username, String password, int salary, int workExperience, TeacherRank teacherType, Vector<Course> coursesTaken, Schedule schedule, Set<Journal> journal) {
        super(username, password, 200000, 5);
        this.teacherType = teacherType;
        this.coursesTaken = coursesTaken;
        this.schedule = schedule;
        this.journal = journal;
    }

    public Teacher(String userName, String password) {
        super(userName, password, 200000, 5);
    }

    // Геттеры и сеттеры для остальных полей

    public void showTeacherMenu() {
        System.out.println("\n--- Teacher Menu ---");
        System.out.println("1. View Course Journal");
        System.out.println("2. Mark Attendance");
        System.out.println("3. Grade Course");
        System.out.println("4. View Schedule");
        System.out.println("5. Logout");
    }
    public void viewJournal(String course) {
        // Предполагается, что у учителя есть доступ к объекту Journal для выбранного курса
        for (Journal journal : this.journal) {
            if (journal.getCourse().equals(course)) {
                journal.ViewJournal();
                return;
            }
        }
        System.out.println("Journal for the selected course not found.");
    }

    public void markAttendance(String course, Student studentUsername, Attendance isPresent) {
        // Предполагается, что у учителя есть доступ к объекту Journal для выбранного курса
        for (Journal journal : this.journal) {
            if (journal.getCourse().equals(course)) {
                journal.markAttendance(studentUsername, isPresent);
                return;
            }
        }
        System.out.println("Journal for the selected course not found.");
    }

    public void gradeCourse(String course, Student studentUsername, double grade) {
        // Предполагается, что у учителя есть доступ к объекту Journal для выбранного курса
        for (Journal journal : this.journal) {
            if (journal.getCourse().equals(course)) {
                journal.gradeCourse(studentUsername, grade);
                return;
            }
        }
        System.out.println("Journal for the selected course not found.");
    }

}
