package OOP.UniSystem;

import OOP.Courses.Course;
import OOP.Enums.Role;
import OOP.Enums.Schools;
import OOP.Transcript.Mark;
import OOP.Transcript.Transcript.Transcript;
import OOP.UserSystem.Admin;
import OOP.UserSystem.User;

import OOP.UserSystem.Student;
import OOP.Util.Database.Authorization;

import java.util.HashMap;

public class test {
    public static void main(String[] args) {
        Authorization a = new Authorization();

        User admin = new Admin("Admin", "Admin", 129000, 1);
        a.createUser(Role.ADMIN, admin);
        Student student = new Student("k_yermakhan", "12341234", Schools.SITE);
        Course course1 = new Course("OOP", 3);
        Course course2 = new Course("Algo", 3);

        Mark mark1 = new Mark(28, 30, 40);
        Mark mark2 = new Mark(20, 25, 40);
        HashMap<Course, Mark> courseMarkHashMap = new HashMap<>();
        courseMarkHashMap.put(course1, mark1);
        courseMarkHashMap.put(course2, mark2);
        Transcript t = new Transcript(courseMarkHashMap);
        student.setTranscript(t);
        a.createUser(Role.STUDENT, (User)student);
        a.viewMenu();
    }
}
