package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="borrowers")
public class Borrower {

    private int id;
    private String name;
    List<Book> borrowedBooks;
    Library library;

    public Borrower(){

    }

    public Borrower(String name, Library library) {
        this.name = name;
        this.borrowedBooks = new ArrayList<Book>();
        this.library = library;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "borrower", fetch = FetchType.LAZY)
    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBook) {
        this.borrowedBooks = borrowedBook;
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
