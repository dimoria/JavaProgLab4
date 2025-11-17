package org.example;

/**
 * Represents a text as an array of Sentence objects.
 */
public class Text {

    private final Sentence[] sentences;

    public Text(String source) {
        source = source.replaceAll("[ \t]+", " ");

        String[] rawSentences = source.split("(?<=[.!?])");
        sentences = new Sentence[rawSentences.length];

        for (int i = 0; i < rawSentences.length; i++) {
            sentences[i] = new Sentence(rawSentences[i].trim());
        }
    }

    public Sentence[] getSentences() {
        return sentences;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Sentence s : sentences) {
            sb.append(s.toString()).append(" ");
        }
        return sb.toString().trim();
    }
}