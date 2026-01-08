package com.example.petshop;

import java.util.Date;

public abstract class Pet {

    // Attributes
    private String name;
    private Date birthDate;

    // Constructors

    /**
     * Creates a new Pet object. Sets the birth date to a default value.
     *
     * @param name The name of the pet
     */
    Pet(String name) {
        this.name = name;
        this.birthDate = new Date();
    }

    /**
     * Creates a new Pet object.
     *
     * @param name The name of the pet
     * @param birthDate The Pet's birthday
     */
    Pet(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    // Getters & Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    // Methods

    public abstract String speak();
}
