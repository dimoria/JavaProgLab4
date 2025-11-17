package org.example;

/**
 * Represents a punctuation mark that ends a sentence.
 */
public class PunctuationMark {

    private final char symbol;

    public PunctuationMark(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return String.valueOf(symbol);
    }
}