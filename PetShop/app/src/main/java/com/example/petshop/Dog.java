package com.example.petshop;

import java.util.Date;

/**
 * This class represents a pet Dog
 * There are functions to 'pet' the Dog, and to allow the Dog to 'speak'
 */
public class Dog extends Pet implements Pettable {
    // Constructors

    /**
     * Creates a Dog object. Sets the birth date to a default value.
     *
     * @param name The name of the Dog
     */
    public Dog(String name) {
        super(name);
    }

    /**
     * Creates a Dog object
     *
     * @param name The name of the Dog
     * @param birthDate The Dog's birthday
     */
    public Dog(String name, Date birthDate) {
        super(name, birthDate);
    }

    // Methods

    /**
     * Returns the sound the Dog makes
     *
     * @return A String representing the Dog's sound
     */
    @Override
    public String speak() {
        return "bark";
    }

    /**
     * Allows you to pet a Dog
     */
    public void pet() {
        // Do Stuff
    }
}
