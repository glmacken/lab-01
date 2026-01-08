package com.example.petshop;

import java.util.Date;

/**
 * This class represents a pet Scorpion
 * There is a function to allow the Scorpion to 'speak'
 */
public class Scorpion extends Pet{
    // Constructors

    /**
     * Creates a Scorpion object. Sets the birth date to a default value.
     *
     * @param name The name of the Scorpion
     */
    public Scorpion(String name) {
        super(name);
    }

    /**
     * Creates a Scorpion object
     *
     * @param name The name of the Scorpion
     * @param birthDate The Scorpion's birthday
     */
    public Scorpion(String name, Date birthDate) {
        super(name, birthDate);
    }

    // Methods

    /**
     * Returns the sound the Scorpion makes
     *
     * @return A String representing the Scorpion's sound
     */
    @Override
    public String speak() {
        return "hiss";
    }
}
