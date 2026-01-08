package com.example.petshop;

import java.util.Date;

/**
 * This class represents a pet BetaFish
 * There a function to allow the BetaFish to 'speak'
 */
public class BetaFish extends Pet {
    // Model Class 3
    // Constructors

    /**
     * Creates a BetaFish object. Sets the birth date to a default value.
     *
     * @param name The name of the BetaFish
     */
    public BetaFish(String name) {
        super(name);
    }

    /**
     * Creates a BetaFish object
     *
     * @param name The name of the BetaFish
     * @param birthDate The BetaFish's birthday
     */
    public BetaFish(String name, Date birthDate) {
        super(name, birthDate);
    }

    // Methods

    /**
     * Returns the sound the BetaFish makes
     *
     * @return A String representing the BetaFish's sound
     */
    @Override
    public String speak() {
        return "...";
    }
}
