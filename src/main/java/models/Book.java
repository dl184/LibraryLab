package models;



public class Book {

    private int id;
    private String title;
    private String author;
    private String genre;
    private Boolean onLoan;

    public Book(){

    }

    public Book(String title, String author, String genre, Boolean onLoan) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.onLoan = onLoan;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Boolean getOnLoan() {
        return onLoan;
    }

    public void setOnLoan(Boolean onLoan) {
        this.onLoan = onLoan;
    }
}
