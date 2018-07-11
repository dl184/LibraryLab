package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="libraries")
public class Library {

    int id;
    String name;
    List<Book> bookCollection;
    List<Borrower> borrowers;

    public Library() {
    }

    public Library(String name) {
        this.name = name;
        this.bookCollection = new ArrayList<Book>();
        this.borrowers = new ArrayList<Borrower>();
    }

    public void addBookToLibrary(Book book){
        this.bookCollection.add(book);
    }

    public void removeBookFromLibrary(Book book){
        this.bookCollection.remove(book);
    }

    public void addBookToBorrower(Borrower borrower, Book book){
        borrower.getBorrowedBooks().add(book);
        book.setBorrower(borrower);
    }

    public void loanBook(Borrower borrower, Book bookToBeLoaned){
        ArrayList<Book> checkingArray = new ArrayList<Book>(this.bookCollection);
        for (Book book : checkingArray) {
            if (book == bookToBeLoaned && !book.getOnLoan()){

                    addBookToBorrower(borrower, book);
                    removeBookFromLibrary(book);
                    book.setOnLoan(true);
                }
            }

    }

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "library")
    public List<Book> getBookCollection() {
        return bookCollection;
    }

    public void setBookCollection(List<Book> bookCollection) {
        this.bookCollection = bookCollection;
    }

    @OneToMany(mappedBy = "library")
    public List<Borrower> getBorrowers() {
        return borrowers;
    }

    public void setBorrowers(List<Borrower> borrowers) {
        this.borrowers = borrowers;
    }
}
