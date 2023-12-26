package OOP.UniSystem;

import OOP.Courses.Course;
import OOP.Enums.Role;
import OOP.Enums.Schools;
import OOP.Transcript.Mark;
import OOP.Transcript.Transcript.Transcript;
import OOP.UserSystem.Admin;
import OOP.UserSystem.User;

import OOP.UserSystem.Student;
import OOP.Util.Authorization;

import java.util.HashMap;

public class test {
    public static void main(String[] args) throws Exception {
        Authorization a = new Authorization();

        User admin = new Admin("Admin", "ad123");
        a.createUser(Role.ADMIN, admin);
        a.viewMenu();
    }
}
