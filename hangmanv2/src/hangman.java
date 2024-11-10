import java.util.Random;
import java.util.Scanner;

public class hangman {
    public static void main(String[] args) {
        final Random random = new Random();
        final String[] words = {"skillmea", "volby", "hovno", "mamrd"};

        final String wordToGuess = selectRandomWord(random, words);
        String hiddenWord = generateHiddenWord(wordToGuess);

        int guessLeft = 6;

        final Scanner scanner = new Scanner(System.in);

        System.out.println("welcome in hangman");
        System.out.println("guess the word: " + hiddenWord);

        while ( guessLeft > 0 && hiddenWord.contains("_")) {
            System.out.println("Enter a letter: ");
            final char guess = scannerLetter(scanner);

            if (wordToGuess.contains(String.valueOf(guess))) {
                hiddenWord = revealLetters(wordToGuess, hiddenWord, guess);
                System.out.println("Correct guess! Updated word: " + hiddenWord);
            } else {
                guessLeft--;
                System.out.println("wrong, you have: " + guessLeft + " guess left");
            }
        }
        if ( hiddenWord.contains("_")) {
            System.out.println("out of guesses, correct answer is: " + wordToGuess);
        } else {
            System.out.println("You win!");
        }
    }

    public static String revealLetters(String word, String hiddenWord, char letter) {
        char[] hiddenwordChar = hiddenWord.toCharArray();

        for (int i = 0; i < word.length(); i++) {
            if ( word.charAt(i) == letter) {
                hiddenwordChar[i] = letter;
            }
        }
        return String.valueOf(hiddenwordChar);
    }

    public static char scannerLetter(Scanner scanner) {
        char guess;

        while (true) {
            try {
                String line = scanner.nextLine();
                if (line.length() != 1) {
                    throw new Exception("zadano vice nez jeden znak");

                }
                guess = line.charAt(0);
                if (!Character.isLetter(guess)) {
                    throw new Exception(("Neni to pismeno"));
                }

                break;
            } catch(Exception e){
                System.out.println("Invalid input: " + e.getMessage());
            }
        }
        return guess;
    }

    public static String generateHiddenWord(String word) {

        return "_".repeat(word.length());
    }

    public static String selectRandomWord(Random random, String[] words) {
        return words[random.nextInt(words.length)]; }
}
