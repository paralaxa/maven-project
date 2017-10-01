package com.example;

/**
 * This is a class...
 */
public class Greeter {

    /**
     * This is a constructor.
     */
    public Greeter() {

    }

    /**
     * Does the greeting.
     *
     * @param someone - who we want to send greeting to.
     * @return greeting.
     */
    public String greet(final String someone) {
        return String.format("Hello, %s!", someone);
    }
}
