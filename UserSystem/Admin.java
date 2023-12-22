package OOP.UserSystem;


import OOP.Enums.Role;
import OOP.Util.Database.Authorization;
import OOP.Util.ID_User;
import OOP.Util.database;

public class Admin extends Employee {

    private database data;
    private Authorization authorization;

    public Admin(String username, String password, int salary, int workExperience) {
        super(username, password, salary, workExperience);
    }
    public database getDatabase() {
        return this.data;
    }

    public void setDatabase(database data) {
        this.data = data;
    }
    

    public void addUser(String UserName, String password, Role role) {
        User u = new User(UserName, password);
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

    /**
    * @generated
    */
    public void removeUser(String ID, String UserName) {
        authorization.RemoveUser(ID, UserName);
    }
    
    /**
    * @generated
    */
    public void printOptions() {

    }
    
    /**
    * @generated
    */
    public void getMenu() {

    }
    
    
}
