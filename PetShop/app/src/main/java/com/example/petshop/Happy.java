package com.example.petshop;

import java.util.Date;

/**
 * A class representing a Happy mood
 * Includes a function to report the mood
 */
public class Happy extends Mood {
    // Constructors

    /**
     * Default Happy class constructor
     */
    public Happy() {
        super();
    }

    /**
     * Creates an instance of the Happy class
     *
     * @param date The date the mood was felt
     */
    public Happy(Date date) {
        super(date);
    }

    // Methods

    /**
     * Reports the mood to be "Happy"
     *
     * @return The string "Happy"
     */
    @Override
    public String reportMood() {
        return "Happy";
    }
}
