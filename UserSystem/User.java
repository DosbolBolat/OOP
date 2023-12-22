package OOP.UserSystem;
import java.io.Serializable;
import java.util.Vector;


import OOP.Enums.Languages;
import OOP.Library.Book;
import OOP.MessageSystem.Message;
import OOP.News.News;


public class User implements Serializable{

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
    
    
    /**
    * @generated
    */
    public String getPassword() {
        return this.password;
    }
    
    /**
    * @generated
    */
    public void setPassword(String password) {
        this.password = password;
    }
    
    
    /**
    * @generated
    */
    public String getID() {
        return this.ID;
    }
    
    /**
    * @generated
    */
    public void setID(String ID) {
        this.ID = ID;
    }
    
    
    /**
    * @generated
    */
    public String getFirstName() {
        return this.firstName;
    }
    
    /**
    * @generated
    */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    
    /**
    * @generated
    */
    public String getLastName() {
        return this.lastName;
    }
    
    /**
    * @generated
    */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    
    /**
    * @generated
    */
    public String getEmail() {
        return this.email;
    }
    
    /**
    * @generated
    */
    public void setEmail(String email) {
        this.email = email;
    }
    
    
    /**
    * @generated
    */
    public String getMobilePhone() {
        return this.mobilePhone;
    }
    
    /**
    * @generated
    */
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }
    
    
    /**
    * @generated
    */
    public Languages getSystemLanguage() {
        return this.SystemLanguage;
    }
    
    /**
    * @generated
    */
    public void setSystemLanguage(Languages SystemLanguage) {
        this.SystemLanguage = SystemLanguage;
    }

    public Message getMessage() {
        return this.message;
    }
    
    /**
    * @generated
    */
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
    
    /**
    * @generated
    */
    public boolean changePassword() {
        //TODO
        return false;
    }
    
    /**
    * @generated
    */
    public void viewNews() {
    }
    
    /**
    * @generated
    */
    public void createRequest() {
    }
    
    /**
    * @generated
    */
    public void showNews() {

    }
    public boolean logOutSystem() {
        //TODO
        return false;
    }
    
    /**
    * @generated
    */
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
