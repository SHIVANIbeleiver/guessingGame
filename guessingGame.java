import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int randomNumber = rand.nextInt(200) + 1;
        System.out.println("Random number is" + randomNumber);
        while (true) {
            System.out.println("Enter your guess (1-200):");
            int player = sc.nextInt();
            if (player == randomNumber) {
                System.out.println("you are winner");
                break;
            } else if (randomNumber > player) {
                System.out.println("you are failed try again ");
                System.out.println("THE GIVEN NUMBER IS HIGH");
            } else {
                System.out.println("NO, THE NUMBER IS LESS THAN THE GIVEN NUMBER");
            }
        }
    }
}
