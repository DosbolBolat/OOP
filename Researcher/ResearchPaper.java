package OOP.Researcher;


import java.util.Date;
import java.util.Vector;

/**
* @generated
*/
public class ResearchPaper implements Supervisor, Researcher {
    
    /**
    * @generated
    */
    private String title;
    
    /**
    * @generated
    */
    private Vector<String> authors;
    
    /**
    * @generated
    */
    private ResearcherJournal journal;
    
    /**
    * @generated
    */
    private int pages;
    
    /**
    * @generated
    */
    private Date date;
    
    
    

    /**
    * @generated
    */
    private String getTitle() {
        return this.title;
    }
    
    /**
    * @generated
    */
    private void setTitle(String title) {
        this.title = title;
    }
    
    
    /**
    * @generated
    */
    private Vector<String> getAuthors() {
        return this.authors;
    }
    
    /**
    * @generated
    */
    private void setAuthors(Vector<String> authors) {
        this.authors = authors;
    }
    
    
    /**
    * @generated
    */
    private ResearcherJournal getJournal() {
        return this.journal;
    }
    
    /**
    * @generated
    */
    private void setJournal(ResearcherJournal journal) {
        this.journal = journal;
    }
    
    
    /**
    * @generated
    */
    private int getPages() {
        return this.pages;
    }
    
    /**
    * @generated
    */
    private void setPages(Integer pages) {
        this.pages = pages;
    }
    
    
    /**
    * @generated
    */
    private Date getDate() {
        return this.date;
    }
    
    /**
    * @generated
    */
    private void setDate(Date date) {
        this.date = date;
    }
    
    
    
    

    //                          Operations                                  
    
    /**
    * @generated
    */
    public String getCitation() {
        //TODO
        return "";
    }
    
    
}
