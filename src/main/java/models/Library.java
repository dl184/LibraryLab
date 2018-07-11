package models;

import java.util.List;

public class Library {

    int id;
    String name;
    List<Book> bookCollection;
    List<Borrower> borrowers;

    public Library() {
    }

    public Library(String name, List<Book> bookCollection, List<Borrower> borrowers) {
        this.name = name;
        this.bookCollection = bookCollection;
        this.borrowers = borrowers;
    }

    public void addBookToLibrary(Book book){
        this.bookCollection.add(book);
    }

    public void removeBookFromLibrary(Book book){
        this.bookCollection.remove(book);
    }

    public void addBookToBorrower(Borrower borrower, Book book){
        borrower.getBorrowedBook().add(book);
    }

    public void loanBook(Borrower borrower, Book book){
        addBookToBorrower(borrower, book);
        removeBookFromLibrary(book);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBookCollection() {
        return bookCollection;
    }

    public void setBookCollection(List<Book> bookCollection) {
        this.bookCollection = bookCollection;
    }

    public List<Borrower> getBorrowers() {
        return borrowers;
    }

    public void setBorrowers(List<Borrower> borrowers) {
        this.borrowers = borrowers;
    }
}
