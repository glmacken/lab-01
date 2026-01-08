package com.example.petshop;

import java.util.Date;

/**
 * This class represents a pet Turtle
 * There are functions to 'pet' the Turtle, and to allow the Turtle to 'speak'
 */
public class Turtle extends Pet implements Pettable{
    // Model Class 1
    // Constructors

    /**
     * Creates a Turtle object. Sets the birth date to a default value.
     *
     * @param name The name of the Turtle
     */
    public Turtle(String name) {
        super(name);
    }

    /**
     * Creates a Turtle object
     *
     * @param name The name of the Turtle
     * @param birthDate The Turtle's birthday
     */
    public Turtle(String name, Date birthDate) {
        super(name, birthDate);
    }

    // Methods

    /**
     * Returns the sound the Turtle makes
     *
     * @return A String representing the Turtle's sound
     */
    @Override
    public String speak() {
        return "...";
    }

    /**
     * Allows you to pet a Turtle
     */
    public void pet() {
        // Do Stuff
    }
}
