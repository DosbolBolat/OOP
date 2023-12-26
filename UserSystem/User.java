package OOP.UserSystem;
import java.io.Serializable;
import java.util.Vector;


import OOP.Enums.Languages;
import OOP.Enums.Role;
import OOP.Library.Book;
import OOP.MessageSystem.Message;
import OOP.News.News;


public class User implements Serializable{
    private Role role;
    private String username;
    private String password;
    private String ID;
    private String firstName;
    private String lastName;
    private String email;
    private String mobilePhone;
    private Languages SystemLanguage;
    private Vector<Book> books;
    private Message message;


    {
        SystemLanguage = Languages.RU;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User() {

    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    public Vector<Book> getBooks() {
        return books;
    }
    public void setBooks(Vector<Book> books) {
        this.books = books;
    }

    public String getUsername() {

        return this.username;
    }

    public void setUsername(String username) {

        this.username = username;
    }

    public String getPassword() {

        return this.password;
    }

    public void setPassword(String password) {

        this.password = password;
    }

    public String getID() {

        return this.ID;
    }

    public void setID(String ID) {

        this.ID = ID;
    }

    public String getFirstName() {

        return this.firstName;
    }
    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }
    public String getLastName() {

        return this.lastName;
    }
    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public String getEmail() {

        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getMobilePhone() {

        return this.mobilePhone;
    }
    public void setMobilePhone(String mobilePhone) {

        this.mobilePhone = mobilePhone;
    }
    public Languages getSystemLanguage() {

        return this.SystemLanguage;
    }
    public void setSystemLanguage(Languages SystemLanguage) {

        this.SystemLanguage = SystemLanguage;
    }
    public Message getMessage() {

        return this.message;
    }
    public void setMessage(Message message) {

        this.message = message;
    }

    public void showUserMenu() {
        System.out.println("\nWelcome to university system");
        System.out.println("Menu: choose your option");
        System.out.println("1. Login");
        System.out.println("2. Exit");
    }
    public void showUserMenu(User user) {
        System.out.println("\nWelcome " + this.username + "university system");
        System.out.println("Menu: choose your option");
        System.out.println("1. Change password.");
        System.out.println("2. Create request");
    }
    public void updateLogin() {
    }
    public boolean changePassword() {
        //TODO
        return false;
    }

    public void viewNews() {
    }

    public void createRequest() {
    }
    public void showNews() {

    }
    public boolean logOutSystem() {
        //TODO
        return false;
    }

    public void logInSystem() {

    }
    public void changeLanguage(Languages languages) {
        if(languages == Languages.EN){
            return;
        }
        else if (languages == Languages.RU){
            return;
        }
        else{
            return;
        }
    }
}
