package spring.framework.springapp.model;


import javax.persistence.Entity;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Author {

    private String firstName;
    private String lastName;

    private Set<Book> books = new HashSet<>();

    public Author(){

    }

    public Author(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
