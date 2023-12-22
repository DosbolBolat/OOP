package OOP.UserSystem;


import OOP.MessageSystem.Message;

import java.util.Vector;

/**
* @generated
*/
public class Employee extends User {

    private int salary;

    private int workExperience;

    private Vector<Message> message;


    public Employee(String username, String password, int salary, int workExperience) {
        super(username, password);
        this.salary = salary;
        this.workExperience = workExperience;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
    
    
    /**
    * @generated
    */
    public int getWorkExperience() {
        return this.workExperience;
    }
    
    /**
    * @generated
    */
    public void setWorkExperience(Integer workExperience) {
        this.workExperience = workExperience;
    }

    
    /**
    * @generated
    */
    public void setMessage(Vector<Message> message) {
        this.message = message;
    }

    /**
    * @generated
    */
    public Vector<Message> viewMessages() {
        //TODO
        return null;
    }
    
    /**
    * @generated
    */
    public int getSalary() {
        //TODO
        return 0;
    }
    
    /**
    * @generated
    */
    public boolean sendMessage() {
        //TODO
        return false;
    }
    
    
}
