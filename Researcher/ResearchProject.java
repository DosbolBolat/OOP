package OOP.Researcher;


import java.util.Vector;

/**
* @generated
*/
public class ResearchProject implements Supervisor, Researcher {
    
    /**
    * @generated
    */
    private String TopicName;
    
    /**
    * @generated
    */
    private Vector<ResearchPaper> publishedPapers;
    
    /**
    * @generated
    */
    private Vector<Researcher> participant;
    
    
    

    /**
    * @generated
    */
    private String getTopicName() {
        return this.TopicName;
    }
    
    /**
    * @generated
    */
    private void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }
    
    
    /**
    * @generated
    */
    private Vector<ResearchPaper> getPublishedPapers() {
        return this.publishedPapers;
    }
    
    /**
    * @generated
    */
    private void setPublishedPapers(Vector<ResearchPaper> publishedPapers) {
        this.publishedPapers = publishedPapers;
    }
    
    
    /**
    * @generated
    */
    private Vector<Researcher> getParticipant() {
        return this.participant;
    }
    
    /**
    * @generated
    */
    private void setParticipant(Vector<Researcher> participant) {
        this.participant = participant;
    }
    
    
    
    
}
