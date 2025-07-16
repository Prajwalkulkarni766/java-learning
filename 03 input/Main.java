import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.next();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter price of product: ");
        double price = sc.nextDouble();

        System.out.println("Are you a student (true/false): ");
        boolean isStudent = sc.nextBoolean();

        System.out.println("Details");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Price: " + price);
        System.out.println("Is student: " + isStudent);
        sc.close();
    }    
}
