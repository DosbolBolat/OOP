package OOP.Courses;


import java.io.Serializable;

/**
* @generated
*/
public class Room implements Serializable {
    
    /**
    * @generated
    */
    private int NumOfRoom;
    
    
    /**
    * @generated
    */
    private Lesson lesson;
    
    

    /**
    * @generated
    */
    private int getNumOfRoom() {
        return this.NumOfRoom;
    }
    
    /**
    * @generated
    */
    private void setNumOfRoom(Integer NumOfRoom) {
        this.NumOfRoom = NumOfRoom;
    }
    
    
    
    /**
    * @generated
    */
    public Lesson getLesson() {
        return this.lesson;
    }
    
    /**
    * @generated
    */
    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }
    
    
    

    //                          Operations                                  
    
    /**
    * @generated
    */
    public boolean IsEmpty() {
        //TODO
        return false;
    }
    
    
}
