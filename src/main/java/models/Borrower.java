package models;

import java.util.List;

public class Borrower {

    private int id;
    private String name;
    List<Book> borrowedBook;

    public Borrower(){

    }

    public Borrower(String name, List<Book> borrowedBook) {
        this.name = name;
        this.borrowedBook = borrowedBook;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBorrowedBook() {
        return borrowedBook;
    }

    public void setBorrowedBook(List<Book> borrowedBook) {
        this.borrowedBook = borrowedBook;
    }
}
