package org.example;

/**
 * Run program class
 * In each sentence, swap the first and last word.
 */
public class TextProcessor {

    public static void main(String[] args) {
        try {
            String input = "Привітик усім! Приклад речення, щоб змінити. Давайте почнемо?";

            System.out.println("Початковий текст:");
            System.out.println(input);

            Text text = new Text(input);

            for (Sentence sentence : text.getSentences()) {
                sentence.swapFirstAndLastWord();
            }

            System.out.println("\nЗмінений текст:");
            System.out.println(text);

        } catch (Exception e) {
            System.err.println("Error while processing text: " + e.getMessage());
        }
    }
}
