package OOP.Library;


/**
* @generated
*/
public class Book {

    private String bookId;
    private String title;
    private String content;
    private int numberOfPages;
    private String author;

    // Constructors, getters, and setters for Book class

    public String getBookID() {
        return bookId;
    }

    public void setBookID(String bookId) {
        this.bookId = bookId;
    }

    public void setStateOfBook() {
        // Implement logic to set the state of the book (e.g., available, checked out)
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId='" + bookId + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", author='" + author + '\'' +
                '}';
    }

}
