package com.example.petshop;

import java.util.Date;

/**
 * This class represents a pet Cat
 * There are functions to 'pet' the Cat, and to allow the Cat to 'speak'
 */
public class Cat extends Pet implements Pettable {
    // Constructors

    /**
     * Creates a Cat object. Sets the birth date to a default value.
     *
     * @param name The name of the Cat
     */
    public Cat(String name) {
        super(name);
    }

    /**
     * Creates a Cat object
     *
     * @param name The name of the Cat
     * @param birthDate The Cat's birthday
     */
    public Cat(String name, Date birthDate) {
        super(name, birthDate);
    }

    // Methods

    /**
     * Returns the sound the Cat makes
     *
     * @return A String representing the Cat's sound
     */
    @Override
    public String speak() {
        return "meow";
    }

    /**
     * Allows you to pet a Cat
     */
    public void pet() {
        // Do Stuff
    }

}
