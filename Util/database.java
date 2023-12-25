package OOP.Util;


import OOP.Courses.Course;
import OOP.Library.Book;
import OOP.News.News;
import OOP.RequestSystem.Request;
import OOP.UserSystem.Admin;
import OOP.UserSystem.User;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Vector;


public class database implements Serializable {

    public static database instance;
    private boolean isRegistration;
    private HashMap<String, User> listOfUsers;

    private Vector<News> listOfNews;

    private Vector<Book> listOfBooks;

    private Vector<Request> listOfRequests;

    {
        listOfBooks = new Vector<>();
        listOfNews = new Vector<>();
        listOfUsers = new HashMap<>();
        new saveDataBase();
    }


    private boolean getIsRegistration() {

        return this.isRegistration;
    }

    private void setIsRegistration(Boolean isRegistration) {

        this.isRegistration = isRegistration;
    }
    public void setInstance(database instance) {

        this.instance = instance;
    }
    public HashMap<String, User> getListOfUsers() {

        return this.listOfUsers;
    }

    public void setListOfUsers(HashMap<String, User> listOfUsers) {

        this.listOfUsers = listOfUsers;
    }

    private Vector<News> getListOfNews() {

        return this.listOfNews;
    }

    private void setListOfNews(Vector<News> listOfNews) {

        this.listOfNews = listOfNews;
    }

    private Vector<Book> getListOfBooks() {

        return this.listOfBooks;
    }
    

    private void setListOfBooks(Vector<Book> listOfBooks) {

        this.listOfBooks = listOfBooks;
    }
    

    private Vector<Request> getListOfRequests() {

        return this.listOfRequests;
    }

    private void setListOfRequests(Vector<Request> listOfRequests) {

        this.listOfRequests = listOfRequests;
    }

    public database getInstance() {
        if (instance == null){
            instance = new database();
        }
        return instance;
    }


    public void readDatabase() {
    }

    public void saveDatabase() {
    }

    public void saveNews() {
    }
    public void saveUser(String id, User u) {

        listOfUsers.put(id, u);
    }

    public String getNews() {
        //TODO
        return "";
    }

    public String getBooks() {
        return "";
    }

    public void saveBooks() {

    }
    

    public Vector<Course> getActiveCourses() {
        return null;
    }
    

    public boolean isCourseAviable() {
        //TODO
        return false;
    }

    public boolean registerForCourse() {
        //TODO
        return false;
    }
    

    public void loadNews() {
    }
    
    
}
