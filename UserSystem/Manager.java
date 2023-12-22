package OOP.UserSystem;


import OOP.Enums.*;
import OOP.RequestSystem.Request;

import java.util.Queue;


public class Manager extends Employee implements ManageRequest {

    private Queue<Request> listOfRequestsOR;

    private Schools faculty;
    

    private Queue<Request> listOfRequestsFaculty;

    private ManagerType ManagerType;

    public Manager(String username, String password, int salary, int workExperience, Schools faculty, OOP.Enums.ManagerType managerType) {
        super(username, password, salary, workExperience);
        this.faculty = faculty;
        ManagerType = managerType;
    }

    private Queue<Request> getListOfRequestsOR() {
        return this.listOfRequestsOR;
    }
    
    /**
    * @generated
    */
    private void setListOfRequestsOR(Queue<Request> listOfRequestsOR) {
        this.listOfRequestsOR = listOfRequestsOR;
    }
    
    
    /**
    * @generated
    */
    private Schools getFaculty() {
        return this.faculty;
    }
    
    /**
    * @generated
    */
    private void setFaculty(Schools faculty) {
        this.faculty = faculty;
    }
    
    
    /**
    * @generated
    */
    private Queue<Request> getListOfRequestsFaculty() {
        return this.listOfRequestsFaculty;
    }
    
    /**
    * @generated
    */
    private void setListOfRequestsFaculty(Queue<Request> listOfRequestsFaculty) {
        this.listOfRequestsFaculty = listOfRequestsFaculty;
    }
    
    
    /**
    * @generated
    */
    private ManagerType getManagerType() {
        return this.ManagerType;
    }
    
    /**
    * @generated
    */
    private void setManagerType(ManagerType ManagerType) {
        this.ManagerType = ManagerType;
    }

    public boolean addCourse() {
        //TODO
        return false;
    }
    
    /**
    * @generated
    */
    public void manageCourse() {
    }
    
    /**
    * @generated
    */
    public boolean deleteCourse() {
        //TODO
        return false;
    }
    
    /**
    * @generated
    */
    public boolean openCourse() {
        //TODO
        return false;
    }
    
    /**
    * @generated
    */
    public void closeCourse() {
    }
    
    /**
    * @generated
    */
    public void getMenu() {

    }
    
    /**
    * @generated
    */
    public boolean deleteNews() {
        //TODO
        return false;
    }
    
    /**
    * @generated
    */
    public void manageNews() {
    }
    
    /**
    * @generated
    */
    public boolean createNews() {
        //TODO
        return false;
    }
    
    /**
    * @generated
    */
    public void updateNews() {
    }
    
    /**
    * @generated
    */
    public void showNews() {

    }
    
    /**
    * @generated
    */
    public boolean createSurvey() {
        //TODO
        return false;
    }
    
    /**
    * @generated
    */
    public String manageRequest() {
        //TODO
        return "";
    }
    
    /**
    * @generated
    */
    public boolean addTeacherToCourse() {
        //TODO
        return false;
    }
    
    /**
    * @generated
    */
    public boolean addTeacherToSubject() {
        //TODO
        return false;
    }
    
    
}
