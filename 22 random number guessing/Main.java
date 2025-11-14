import java.util.Random;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Random rand = new Random();
    Scanner sc = new Scanner(System.in);

    int randomNumber = Math.abs(rand.nextInt(1, 100));
    int attempts = 5;

    System.out.println(randomNumber);

    while (attempts > 0) {
      System.out.print("Enter your guess number between 1 to 100: ");
      int guess = sc.nextInt();
      if (randomNumber == guess) {
        System.out.printf("You guessed correct number i.e. %d", guess);
        break;
      } else {
        System.out.println("Better luck for next guess");
        attempts--;
      }
    }

    sc.close();
  }
}
