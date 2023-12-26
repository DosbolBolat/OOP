package OOP.Util;


import OOP.Courses.Course;
import OOP.Enums.Attendance;
import OOP.Enums.Role;
import OOP.Enums.UserRole;
import OOP.Transcript.Mark;
import OOP.UserSystem.*;
import OOP.Util.ID_User;
import OOP.Util.database;


import java.io.Serializable;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Authorization implements Serializable {
    private UserRole role;
    private String Login;
    private String password;
    private database data;
    private ID_User idUser;
    public String id_admin;
    public Authorization() {
        this.data  = new database();
        this.data = this.data.getInstance();
        this.idUser = new ID_User();
    }

    public UserRole getRole() {
        return this.role;
    }
    public void setRole(UserRole role) {
        this.role = role;
    }
    public String getLogin() {
        return this.Login;
    }
    public void setLogin(String Login) {
        this.Login = Login;
    }
    public void createUser(Role role, User u) throws Exception{
        String id = idUser.generateUniqueID();
        u.setID(id);
        u.setRole(role);
        if (Role.ADMIN == role && u instanceof Employee) {
            Employee e = (Employee) u;  // This line is causing the ClassCastException
            if (e instanceof Admin) {
                Admin a = (Admin) e;
                a.setDatabase(data);
                a.setAuthorization(this);
            }
            data.saveUser(id, u);
        } else {
            data.saveUser(id, u);
        }
        saveDataBase.saveData(data);
    }
    public void RemoveUser(String s, String UserName){
        for (Map.Entry<String, User> hm : data.getListOfUsers().entrySet()) {
            if(Objects.equals(hm.getKey(), s) && Objects.equals(hm.getValue().getUsername(), UserName)){
                data.getListOfUsers().remove(hm.getKey());
                System.out.println("---- Done ----");
                return;
            }
        }
        System.out.println("---- The user was not found ----");
    }
    public String getPassword() {
        return this.password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public User LoginToSystem(String login, String password) {
        for (Map.Entry<String, User> hm : data.getListOfUsers().entrySet()) {
            if (Objects.equals(hm.getValue().getUsername(), login) && hm.getValue().getPassword().equals(password)){
                    return hm.getValue();
                }
            }
            return null;
        }
    public void viewMenu() throws Exception {
        System.out.println("--- University System ---");
        while (true) {
            System.out.println("\nWelcome to university system!");
            (new Viewable()).showUserMenu1();
            System.out.print("Option: ");
            int command = Integer.parseInt((new Scanner(System.in)).nextLine());
            User u;
            if (command == 1) {
                System.out.print("Login: ");
                String login = (new Scanner(System.in)).nextLine();
                System.out.print("Password: ");
                String password = (new Scanner(System.in)).nextLine();
                u = LoginToSystem(login, password);
                if (u == null) return;
            } else {
                return;
            }
            if (u instanceof Student) {
                while (true) {
                    Student student = (Student) u;
                    student.showStudentMenu();

                    System.out.print("Option: ");
                    int option = Integer.parseInt((new Scanner(System.in)).nextLine());
                    if (option == 1) {
                        System.out.println("---Change password---");
                        System.err.print("New password: ");
                        String newPassword = (new Scanner(System.in)).nextLine();
                        student.setPassword(newPassword);
                        System.out.println("---Done---");
                    } else if (option == 4) {
                        System.err.println("---Courses---");
                        System.out.println();
                        student.viewCourses();
                    } else if (option == 5) {
                        System.err.println("---Transcript---");
                        System.out.println();
                        student.viewTranscript();
                    } else if (option == 6) {
                        LogoutFromSystem();
                        break;
                    } else {
                        System.err.println("Error: wrong option");
                    }
                }
            } else if (u instanceof Admin) {
                while (true) {
                    Admin admin = (Admin) u;
                    admin.showAdminMenu();
                    System.out.print("Option: ");
                    int option = Integer.parseInt((new Scanner(System.in)).nextLine());
                    if (option == 1) {
                        System.out.println("---Change password---");
                        System.out.print("New password: ");
                        String newPassword = (new Scanner(System.in)).nextLine();
                        admin.setPassword(newPassword);
                        System.out.println("\n---Done---");
                    } else if (option == 3) {
                        System.out.println("\n---All users---");
                        System.out.println();
                        for (Map.Entry<String, User> hm : data.getListOfUsers().entrySet()) {
                            System.out.println("- User ID " + hm.getKey() + ", Name: " + hm.getValue().getUsername());
                        }
                    } else if (option == 4) {
                        System.out.println("\n---Create user---");
                        System.out.print("Name: ");
                        String newUserName = (new Scanner(System.in)).nextLine();
                        System.out.print("Password: ");
                        String newUserPassword = (new Scanner(System.in)).nextLine();
                        System.out.print("Role: ");
                        Role newUserRole = Role.of((new Scanner(System.in)).nextLine().toLowerCase());
                        admin.addUser(newUserName, newUserPassword, newUserRole);
                        data.setInstance(data);
                        System.out.println("---- Done ----");
                    } else if (option == 5) {
                        System.out.println("\n---Delete user---");
                        System.out.print("ID: ");
                        String deleteID = (new Scanner(System.in)).nextLine();
                        System.out.print("User Name: ");
                        String deleteName = (new Scanner(System.in)).nextLine();
                        admin.removeUser(deleteID, deleteName);
                    } else if (option == 6) {
                        LogoutFromSystem();
                        break;
                    } else {
                        System.err.println("Error: wrong option");
                    }
                }
            }
            else if (u instanceof Teacher) {
                while (true) {
                    Teacher teacher = (Teacher) u;
                    teacher.showTeacherMenu();
                    System.out.print("Option: ");
                    int option = Integer.parseInt((new Scanner(System.in)).nextLine());
                    if (option == 1) {
                        System.out.println("Write course");
                        String courseName = (new Scanner(System.in).nextLine());
                        teacher.viewJournal(courseName);
                    } else if (option == 2) {
                        System.out.println("Name course");
                        String courseName = (new Scanner(System.in).nextLine());
                        System.out.println("ID student");
                        String id = (new Scanner(System.in).nextLine());
                        User user = null;
                        for (Map.Entry<String, User> hm : data.getListOfUsers().entrySet()) {
                            if (Objects.equals(hm.getValue().getUsername(), id)){
                                user = hm.getValue();
                                break;
                            }
                        }
                        if(user != null){
                            Student student = (Student)user;
                            System.out.println("Attendance");
                            String studentAttendance = (new Scanner(System.in).nextLine());
                            Attendance attendance = Attendance.of(studentAttendance);
                            teacher.markAttendance(courseName,student,attendance);
                        }
                        else{
                            System.out.println("User not found!");
                        }
                    } else if (option == 3) {
                        System.out.println("Name course");
                        String courseName = (new Scanner(System.in).nextLine());
                        System.out.println("ID student");
                        String id = (new Scanner(System.in).nextLine());
                        User user = null;
                        for (Map.Entry<String, User> hm : data.getListOfUsers().entrySet()) {
                            if (Objects.equals(hm.getValue().getUsername(), id)) {
                                user = hm.getValue();
                                break;
                            }
                        }
                        if (user != null) {
                            Student student = (Student) user;
                            System.out.println("Enter the grade for the student:");
                            double grade = Double.parseDouble((new Scanner(System.in)).nextLine());
                            teacher.gradeCourse(courseName, student, grade);
                        } else {
                            System.out.println("User not found!");
                        }
                    } else if (option == 4) {
                        // ... (опция для уведомления о расписании, оставлена для наглядности)
                    } else if (option == 5) {
                        LogoutFromSystem();
                        break;
                    } else {
                        System.err.println("Error: wrong option");
                    }
                }
            }
        }
    }

    public boolean LogoutFromSystem() {
        return false;
    }
}
