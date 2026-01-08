package com.example.petshop;

import java.util.Date;

/**
 * This class represents a pet Ferret
 * There are functions to 'pet' the Ferret, and to allow the Ferret to 'speak'
 */
public class Ferret extends Pet implements Pettable {
    // Model Class 2
    // Constructors

    /**
     * Creates a Ferret object. Sets the birth date to a default value.
     *
     * @param name The name of the Ferret
     */
    public Ferret(String name) {
        super(name);
    }

    /**
     * Creates a Ferret object
     *
     * @param name The name of the Ferret
     * @param birthDate The Ferret's birthday
     */
    public Ferret(String name, Date birthDate) {
        super(name, birthDate);
    }

    // Methods

    /**
     * Returns the sound the Ferret makes
     *
     * @return A String representing the Ferret's sound
     */
    @Override
    public String speak() {
        return "dook";
    }

    /**
     * Allows you to pet a Ferret
     */
    public void pet() {
        // Do Stuff
}
