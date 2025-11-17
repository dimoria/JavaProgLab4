package org.example;

/**
 * Represents a single letter of a word.
 */
public class Letter {

    private final char value;

    public Letter(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
