package OOP.Enums;

import OOP.UserSystem.Manager;
import OOP.UserSystem.Teacher;

public enum Role {
    ADMIN, STUDENT, TEACHER, MANAGER, EMPLOYEE, LIBRARIAN, TECH_SUPPORT;

    public static Role of(String lowerCase) {
        switch(lowerCase) {
            case "admin":
                return ADMIN;
            case "student":
                return STUDENT;
            case "teacher":
                return TEACHER;
            case "manager":
                return MANAGER;
            case "employee":
                return EMPLOYEE;
            case "librarian":
                return LIBRARIAN;
            case "tech_support":
                return TECH_SUPPORT;
            default:
                return null;
        }
    }
}
