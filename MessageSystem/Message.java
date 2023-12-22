package OOP.MessageSystem;


import OOP.UserSystem.User;
import OOP.Enums.*;
import java.util.Date;

/**
* @generated
*/
public class Message {
    
    /**
    * @generated
    */
    private Date date;
    
    /**
    * @generated
    */
    private String content;
    
    /**
    * @generated
    */
    private User receiver;
    
    /**
    * @generated
    */
    private User employee;
    
    /**
    * @generated
    */
    private SpeedMessage speed;
    
    
    /**
    * @generated
    */
    private User student;



    
    /**
    * @generated
    */
    private User getReceiver() {
        return this.receiver;
    }
    
    /**
    * @generated
    */
    private void setReceiver(User receiver) {
        this.receiver = receiver;
    }
    
    
    /**
    * @generated
    */
    private User getEmployee() {
        return this.employee;
    }
    
    /**
    * @generated
    */
    private void setEmployee(User employee) {
        this.employee = employee;
    }
    
    
    /**
    * @generated
    */
    private SpeedMessage getSpeed() {
        return this.speed;
    }
    
    /**
    * @generated
    */
    private void setSpeed(SpeedMessage speed) {
        this.speed = speed;
    }
    
    
    
    /**
    * @generated
    */
    public User getStudent() {
        return this.student;
    }
    
    /**
    * @generated
    */
    public void setStudent(User student) {
        this.student = student;
    }


}
