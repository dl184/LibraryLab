package models;


import javax.persistence.*;

@Entity
@Table(name="books")
public class Book {

    private int id;
    private String title;
    private String author;
    private String genre;
    private Boolean onLoan;
    private Borrower borrower;
    private Library library;

    public Book(){
    }

    public Book(String title, String author, String genre, Library library) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.onLoan = false;
        this.library = library;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name="author")
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Column(name="genre")
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Column(name="onLoan")
    public Boolean getOnLoan() {
        return onLoan;
    }

    public void setOnLoan(Boolean onLoan) {
        this.onLoan = onLoan;
    }

    @ManyToOne
    @JoinColumn(name="borrower_id", nullable = true)
    public Borrower getBorrower() {
        return borrower;
    }

    public void setBorrower(Borrower borrower) {
        this.borrower = borrower;
    }

    @ManyToOne
    @JoinColumn(name="library_id", nullable = true)
    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }
}
