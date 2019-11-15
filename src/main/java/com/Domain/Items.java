package com.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Items {

    @GeneratedValue
    @Id
    private long id;
    private String Name;
    private String Description;
    static long counter = 0;

 //   @OneToMany
 //  private Books book;

    public Items()
    {

    }

    public Items(String name, String description, String bookId)
    {
        super();
        this.id = setId();
        this.Name = name;
        this.Description = description;
        //this.book = new Books(bookId, "", "","");
    }


    public long getId() {
        return id;
    }

    public long setId() {
        counter++;
        return counter;
        //this.id = id;

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
/*
    public Books getBook() {
        return book;
    }

    public void setBook(Books book) {
        this.book = book;
    }
*/


}
