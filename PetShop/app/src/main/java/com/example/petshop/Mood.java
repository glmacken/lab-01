package com.example.petshop;

import java.util.Date;

public abstract class Mood {
    // Attributes
    private Date date;

    // Constructors

    /**
     * Default Mood class constructor
     */
    public Mood() {
        this.date = new Date();
    }

    /**
     * Creates an instance of the Mood class
     *
     * @param date The date the mood was felt
     */
    public Mood(Date date) {
        this.date = date;
    }

    // Methods

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract String reportMood();

}
