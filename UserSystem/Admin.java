package OOP.UserSystem;


import OOP.Enums.Role;
import OOP.Util.Authorization;
import OOP.Util.database;

import java.io.Serializable;

public class Admin extends Employee implements Serializable {

    private database data;
    private Authorization authorization;

    public Admin(String username, String password) {
        super(username, password, 12000, 2);
    }
    public database getDatabase() {
        return this.data;
    }
    public database getData(){
        return this.data;
    }

    public void setDatabase(database data) {

        this.data = data;
    }


    public void addUser(String UserName, String password, Role role) throws Exception{
        User u = null;
        if(role == Role.ADMIN)u = new Admin(UserName, password);
        else if(role == Role.STUDENT)u = new Student(UserName, password);
        authorization.createUser(role, u);
    }
    public void showAdminMenu() {
        (new Viewable()).showUserMenu();
        System.out.println("3. View all users");
        System.out.println("4. Create user");
        System.out.println("5. Delete user");
        System.out.println("6. Logout");
    }

    public Authorization getAuthorization() {

        return authorization;
    }

    public void setAuthorization(Authorization authorization) {

        this.authorization = authorization;
    }

    public void removeUser(String ID, String UserName) {
        authorization.RemoveUser(ID, UserName);
    }
    public void printOptions() {

    }
    public void getMenu() {

    }
}
