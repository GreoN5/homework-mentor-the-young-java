package homework4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // ---------------------------------------------------------
        // task - 3: Реализирайте играта “Бесеница” – за тайна дума, потребителят трябва да въвежда буква,
        //    след което да се отпечатва думата, в която са показани отгатнатите букви, а на мястото на неотгатнатите има _.
        //    Също така потребителят трябва да знае колко опита му остават. Макс брой опити - 10.
        // ---------------------------------------------------------
        String wordToGuess = "football";
        StringBuilder revealLettersWord = new StringBuilder(wordToGuess.replaceAll("[a-zA-Z]", "_"));

        Scanner scanner = new Scanner(System.in);

        int maxTries = 10;
        while (maxTries > 0) {
            if (revealLettersWord.toString().equals(wordToGuess)) {
                break;
            }

            System.out.println("Enter a letter: ");
            char letter = scanner.next().charAt(0);

            int indexOfGuessedLetter = wordToGuess.indexOf(letter);
            if (indexOfGuessedLetter == -1) {
                maxTries--;
                System.out.println("Remaining tries to guess: " + maxTries);
                continue;
            }

            while (indexOfGuessedLetter >= 0) {
                revealLettersWord.setCharAt(indexOfGuessedLetter, letter);
                indexOfGuessedLetter = wordToGuess.indexOf(letter, indexOfGuessedLetter + 1);
            }

            System.out.println(revealLettersWord);
        }

        if (maxTries == 0) {
            System.out.println("Game over!");
        } else {
            System.out.println("You guessed the word!");
        }

        System.out.println("The word is: " + wordToGuess);
    }
}
