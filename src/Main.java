import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] words = new String[]{"orange", "apple", "avocado", "banana", "berry", "blackberry", "cherry", "kiwi", "lemon", "mango"};
        int number, tryCount = 0;
        String selectedWord;


        number = random.nextInt(words.length);
        selectedWord = words[number];
        System.out.println("This is a fruit");

        for (int i = 0; i < selectedWord.length(); i++) {
            System.out.print("-");

        }

        while (tryCount < 3) {
            System.out.println("\n");
            System.out.print("Your Answer : ");
            String guessWord = scanner.next();

            if (guessWord.equals(selectedWord)) {
                System.out.println("Succes:) Selected Word : " + selectedWord);
                return;
            } else {
                System.out.println("Try Again :(");
                tryCount++;
            }
        }


    }
}