import java.util.Random;
import java.util.Scanner;

public class NumberGussingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber = random.nextInt(100) + 1;
        System.out.println(randomNumber);

        while (true) {
            System.out.println("Enter your guess from 1 to 100:");
            int gussedNumber = scanner.nextInt();
            if (gussedNumber == randomNumber) {
                System.out.println("Correct! Good Job!");
                break;
            }
            else
                System.out.println(((gussedNumber > randomNumber)? "Nope! the number is Lower than " + gussedNumber:"Nope! the number is Higher than " + gussedNumber) + "\n");
        }
    }
}
