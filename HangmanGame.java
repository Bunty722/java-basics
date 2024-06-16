import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HangmanGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the secret word: ");
        String secretWord = scanner.nextLine().toLowerCase(); // Convert to lowercase for case insensitivity
        char[] guessedLetters = new char[secretWord.length()];
        int remainingChances = countUniqueLetters(secretWord);

        initializeGuessedLetters(guessedLetters);

        while (remainingChances > 0 && !isWordGuessed(guessedLetters)) {
            System.out.println("Word to guess: " + getMaskedWord(secretWord, guessedLetters));
            System.out.println("Remaining chances: " + remainingChances);
            System.out.print("Guess a letter: ");
            char guess = scanner.next().toLowerCase().charAt(0); // Convert to lowercase for case insensitivity

            if (isLetterAlreadyGuessed(guess, guessedLetters)) {
                System.out.println("You've already guessed that letter. Try again.");
            } else if (isLetterInWord(guess, secretWord)) {
                updateGuessedLetters(guess, secretWord, guessedLetters);
                System.out.println("Good guess!");
            } else {
                System.out.println("Wrong guess!");
                remainingChances--;
            }
        }

        if (isWordGuessed(guessedLetters)) {
            System.out.println("Congratulations! You guessed the word: " + secretWord);
        } else {
            System.out.println("Out of chances! The word was: " + secretWord);
        }

        scanner.close();
    }

    private static void initializeGuessedLetters(char[] guessedLetters) {
        for (int i = 0; i < guessedLetters.length; i++) {
            guessedLetters[i] = '_';
        }
    }

    private static boolean isWordGuessed(char[] guessedLetters) {
        for (char letter : guessedLetters) {
            if (letter == '_') {
                return false;
            }
        }
        return true;
    }

    private static String getMaskedWord(String secretWord, char[] guessedLetters) {
        StringBuilder maskedWord = new StringBuilder();
        for (int i = 0; i < secretWord.length(); i++) {
            char currentChar = secretWord.charAt(i);
            if (isLetterInArray(currentChar, guessedLetters)) {
                maskedWord.append(currentChar);
            } else {
                maskedWord.append('_');
            }
            maskedWord.append(' ');
        }
        return maskedWord.toString();
    }

    private static boolean isLetterInArray(char letter, char[] array) {
        for (char element : array) {
            if (element == letter) {
                return true;
            }
        }
        return false;
    }

    private static boolean isLetterAlreadyGuessed(char letter, char[] guessedLetters) {
        return isLetterInArray(letter, guessedLetters);
    }

    private static boolean isLetterInWord(char letter, String word) {
        return word.indexOf(letter) != -1;
    }

    private static void updateGuessedLetters(char letter, String word, char[] guessedLetters) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                guessedLetters[i] = letter;
            }
        }
    }

    private static int countUniqueLetters(String word) {
        Set<Character> uniqueLetters = new HashSet<>();
        for (char c : word.toCharArray()) {
            uniqueLetters.add(c);
        }
        return uniqueLetters.size();
    }
}
