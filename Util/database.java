package OOP.Util;


import OOP.Courses.Course;
import OOP.Library.Book;
import OOP.News.News;
import OOP.RequestSystem.Request;
import OOP.UserSystem.Admin;
import OOP.UserSystem.User;

import java.util.HashMap;
import java.util.Vector;


public class database {

    private boolean isRegistration;
    private database instance;

    private HashMap<String, User> listOfUsers;

    private Vector<News> listOfNews;

    private Vector<Book> listOfBooks;

    private Vector<Request> listOfRequests;

    {
        listOfBooks = new Vector<>();
        listOfNews = new Vector<>();
        listOfUsers = new HashMap<>();
    }


    private boolean getIsRegistration() {
        return this.isRegistration;
    }

    private void setIsRegistration(Boolean isRegistration) {
        this.isRegistration = isRegistration;
    }
    

    /**
    * @generated
    */
    public void setInstance(database instance) {
        this.instance = instance;
    }
    
    
    /**
    * @generated
    */
    public HashMap<String, User> getListOfUsers() {
        return this.listOfUsers;
    }
    
    /**
    * @generated
    */
    public void setListOfUsers(HashMap<String, User> listOfUsers) {
        this.listOfUsers = listOfUsers;
    }
    
    
    /**
    * @generated
    */
    private Vector<News> getListOfNews() {
        return this.listOfNews;
    }
    
    /**
    * @generated
    */
    private void setListOfNews(Vector<News> listOfNews) {
        this.listOfNews = listOfNews;
    }
    
    
    /**
    * @generated
    */
    private Vector<Book> getListOfBooks() {
        return this.listOfBooks;
    }
    
    /**
    * @generated
    */
    private void setListOfBooks(Vector<Book> listOfBooks) {
        this.listOfBooks = listOfBooks;
    }
    
    
    /**
    * @generated
    */
    private Vector<Request> getListOfRequests() {
        return this.listOfRequests;
    }
    
    /**
    * @generated
    */
    private void setListOfRequests(Vector<Request> listOfRequests) {
        this.listOfRequests = listOfRequests;
    }

    

    public database getInstance() {
        return null;
    }




    public void readDatabase() {
    }
    
    /**
    * @generated
    */
    public void saveDatabase() {
    }

    public void saveNews() {
    }
    public void saveUser(String id, User u) {
        listOfUsers.put(id, u);
    }
    
    /**
    * @generated
    */
    public String getNews() {
        //TODO
        return "";
    }
    
    /**
    * @generated
    */
    public String getBooks() {
        return "";
    }
    
    /**
    * @generated
    */
    public void saveBooks() {

    }
    
    /**
    * @generated
    */
    public Vector<Course> getActiveCourses() {
        return null;
    }
    
    /**
    * @generated
    */
    public boolean isCourseAviable() {
        //TODO
        return false;
    }
    
    /**
    * @generated
    */
    public boolean registerForCourse() {
        //TODO
        return false;
    }
    

    public void loadNews() {
    }
    
    
}
