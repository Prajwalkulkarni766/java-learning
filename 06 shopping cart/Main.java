import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String item;
        double price;
        int qunatity;
        double total;

        System.out.print("Enter item name: ");
        item = sc.nextLine();

        System.out.print("Enter price of item: ");
        price = sc.nextDouble();

        System.out.print("Enter quantity of item: ");
        qunatity = sc.nextInt();

        total = price * qunatity;

        System.out.println("Total: " + total);

        sc.close();
    }
}
