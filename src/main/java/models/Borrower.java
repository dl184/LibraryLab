package models;

import java.util.ArrayList;
import java.util.List;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBook) {
        this.borrowedBooks = borrowedBook;
    }


}
