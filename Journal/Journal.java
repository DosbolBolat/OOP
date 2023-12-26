package OOP.Journal;

import OOP.Courses.Course;
import OOP.Enums.Attendance;
import OOP.UserSystem.Student;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Journal implements Serializable {
    private Date date;
    private Map<Student, Record> studentRecords;
    private Course course;

    public Journal(Date date) {
        this.date = date;
        this.studentRecords = new HashMap<>();
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Map<Student, Record> getStudentRecords() {
        return this.studentRecords;
    }

    public void addStudentRecord(Student student, Record record) {
        this.studentRecords.put(student, record);
    }

    public void viewJournal() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println("Журнал на " + dateFormat.format(this.date) + ":");

        for (Map.Entry<Student, Record> entry : studentRecords.entrySet()) {
            Student student = entry.getKey();
            Record record = entry.getValue();

            System.out.println("Студент: " + student.getUsername());
            System.out.println("Посещаемость: " + (record.getAttendance() ? "Присутствовал" : "Отсутствовал"));
            System.out.println("Оценка: " + record.getGrade());
            System.out.println("------------------------------");
        }
    }

    public void markAttendance(Student student, Attendance atten) {
        if (studentRecords.containsKey(student)) {
            Record record = studentRecords.get(student);
            record.setAttendance(atten);
        } else {
            System.out.println("Студент не найден в журнале.");
        }
    }

    public void gradeCourse(Student student, double grade) {
        if (studentRecords.containsKey(student)) {
            Record record = studentRecords.get(student);
            record.setGrade(grade);
        } else {
            System.out.println("Студент не найден в журнале.");
        }
    }

    public Course getCourse() {
        return this.course;
    }

    public void ViewJournal() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println("Журнал для курса \"" + course.getCourseName() + "\", " +
                "за " + dateFormat.format(this.date) + ":");

        for (Map.Entry<Student, Record> entry : studentRecords.entrySet()) {
            Student student = entry.getKey();
            Record record = entry.getValue();

            System.out.println("Студент: " + student.getUsername());
            System.out.println("Посещаемость: " + (record.getAttendance() ? "Присутствовал" : "Отсутствовал"));
            System.out.println("Оценка: " + record.getGrade());
            System.out.println("------------------------------");
        }
    }
}