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

    public Borrower(){

    }

    public Borrower(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<Book>();
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


}
