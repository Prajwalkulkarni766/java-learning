import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws InterruptedException {

    // print 0 to 9
    // for (int i = 0; i < 10; i++) {
    // System.out.println(i);
    // }

    // print 10 to 1
    // for (int i = 10; i > 0; i--) {
    // System.out.println(i);
    // }

    Scanner sc = new Scanner(System.in);

    // counter app
    // System.out.println("Enter how many times you want to run your loop: ");
    // int num = sc.nextInt();

    // for (int i = 1; i <= num; i++) {
    // System.out.println("Loop running for " + i + "th time");
    // }

    // count-down app
    System.out.print("Enter countdown start time: ");
    int start = sc.nextInt();
    for (int i = start; i > 0; i--) {
      System.out.println(i);
      Thread.sleep(1000);
    }

    sc.close();
  }

}
