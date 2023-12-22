package OOP.UserSystem;


import java.util.Vector;

/**
* @generated
*/
public class TechSupportSpecialist extends Employee {
    
    /**
    * @generated
    */
    private Vector<String> orders;


    public TechSupportSpecialist(String username, String password, int salary, int workExperience, Vector<String> orders) {
        super(username, password, salary, workExperience);
        this.orders = orders;
    }

    /**
    * @generated
    */
    private Vector<String> getOrders() {
        return this.orders;
    }
    
    /**
    * @generated
    */
    private void setOrders(Vector<String> orders) {
        this.orders = orders;
    }

    
    /**
    * @generated
    */
    public boolean acceptOrder() {
        //TODO
        return false;
    }
    
    /**
    * @generated
    */
    public boolean rejectOrder() {
        //TODO
        return false;
    }
    
    /**
    * @generated
    */
    public Vector<String> ViewOrders() {
        //TODO
        return null;
    }
    
    
}
