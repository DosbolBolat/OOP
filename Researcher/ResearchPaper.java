package OOP.Researcher;

import java.util.Date;
import java.util.List;
import java.util.Vector;

public class ResearchPaper{

    private String title;

    private List<String> authors;

    private int pages;

    private Date date;
    private String doi;
    private int citations;

    public ResearchPaper(String title, List<String> authors, int pages, Date date, String doi, int citations) {
        this.title = title;
        this.authors = authors;
        this.pages = pages;
        this.date = date;
        this.doi = doi;
        this.citations = citations;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getAuthors() {
        return this.authors;
    }

    public void setAuthors(Vector<String> authors) {
        this.authors = authors;
    }

    public int getPages() {
        return this.pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getDoi() {
        return doi;
    }

    public void setDoi(String doi) {
        this.doi = doi;
    }

    public int getCitations() {
        return citations;
    }

    public void setCitations(int citations) {
        this.citations = citations;
    }
}
