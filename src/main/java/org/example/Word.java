package org.example;

/**
 * Represents a word as an array of Letter objects.
 */
public class Word {

    private final Letter[] letters;

    public Word(String source) {
        letters = new Letter[source.length()];
        for (int i = 0; i < source.length(); i++) {
            letters[i] = new Letter(source.charAt(i));
        }
    }

    public String getValue() {
        StringBuilder sb = new StringBuilder();
        for (Letter letter : letters) {
            sb.append(letter.getValue());
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return getValue();
    }
}