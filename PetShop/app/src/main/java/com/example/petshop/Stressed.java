package com.example.petshop;

import java.util.Date;

/**
 * A class representing a Stressed mood
 * Includes a function to report the mood
 */
public class Stressed extends Mood {
    // Constructors

    /**
     * Default Stressed class constructor
     */
    public Stressed() {
        super();
    }

    /**
     * Creates an instance of the Stressed class
     *
     * @param date The date the mood was felt
     */
    public Stressed(Date date) {
        super(date);
    }

    // Methods

    /**
     * Reports the mood to be "Stressed"
     *
     * @return The string "Stressed"
     */
    @Override
    public String reportMood() {
        return "Stressed";
    }
}
