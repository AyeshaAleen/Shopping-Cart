package com.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CDs {
    @GeneratedValue
    @Id
    private long id;
    private String Name;
    private String Description;
    private double Price;
    static long counter = 0;

    public CDs()
    {

    }

    public CDs(String name, String description, double price) {
        super();
        this.id = setId();
        this.Name = name;
        this.Description = description;
        this.Price = price;
    }

    public long getId() {
        return id;
    }

    public long setId()
    {
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

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }
}
