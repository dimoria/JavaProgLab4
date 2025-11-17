package org.example;

/**
 * Represents a sentence as an array of words and ending punctuation mark.
 */
public class Sentence {

    private Word[] words;
    private final PunctuationMark punctuation;

    public Sentence(String source) {
        source = source.trim().replaceAll("[ \t]+", " ");

        char end = source.charAt(source.length() - 1);
        punctuation = new PunctuationMark(end);

        source = source.substring(0, source.length() - 1);

        String[] splitWords = source.split(" ");
        words = new Word[splitWords.length];

        for (int i = 0; i < splitWords.length; i++) {
            words[i] = new Word(splitWords[i]);
        }
    }

    /**
     * Swaps the first and last word of the sentence.
     */
    public void swapFirstAndLastWord() {
        if (words.length > 1) {
            Word temp = words[0];
            words[0] = words[words.length - 1];
            words[words.length - 1] = temp;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Word w : words) {
            sb.append(w.getValue()).append(" ");
        }

        sb.setLength(sb.length() - 1);
        sb.append(punctuation.getSymbol());

        return sb.toString();
    }
}