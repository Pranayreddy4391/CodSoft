import java.util.Random;
import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the number between 1 and 100:");
        int guess = scanner.nextInt();
        int attempts = 1;
        while (guess != number && attempts < 5) {
            if (guess < number) {
                System.out.println("Your guess is too low.");
            } else {
                System.out.println("Your guess is too high.");
            }
            guess = scanner.nextInt();
            attempts++;
        }
        if (guess == number) {
            System.out.println("Congratulations You guessed the number in " + attempts + " attempts.");
        } else {
            System.out.println("Sorry, you didn't guess the number in 5 attempts.");
            System.out.println("The correct number is "+number);
        }
        System.out.println("Do you want to play again (yes/no)");
        String answer = scanner.next();
        if (answer.equalsIgnoreCase("yes")) {
            main(args);
        }
    }
}
