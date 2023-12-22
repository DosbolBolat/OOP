package OOP.Util.Database;


import OOP.Courses.Course;
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
    {
        this.idUser = new ID_User();
    }

    {
        data = new database();
    }

    public UserRole getRole() {
        return this.role;
    }


    public void setRole(UserRole role) {
        this.role = role;
    }
    
    
    /**
    * @generated
    */
    public String getLogin() {
        return this.Login;
    }
    
    /**
    * @generated
    */
    public void setLogin(String Login) {
        this.Login = Login;
    }

    public void createUser(Role role, User u){
        String id = idUser.generateUniqueID();
        u.setID(id);
        if(Role.ADMIN == role){
            Employee e = (Employee)u;
            Admin a = (Admin)e;
            a.setDatabase(data);
            a.setAuthorization(this);
            data.saveUser(id, u);
        }
        else{
            data.saveUser(id, u);
        }
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
    
    /**
    * @generated
    */
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
    public void viewMenu() {
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
        }
    }

    public boolean LogoutFromSystem() {
        //TODO
        return false;
    }
}
