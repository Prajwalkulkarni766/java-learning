import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight convertor program");
        System.out.println("1. convert lbs to kgs");
        System.out.println("2. convert kgs to lbs");

        System.out.print("Enter your weight: ");
        weight = sc.nextDouble();

        System.out.print("Choose an option: ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                newWeight = weight * 0.453592;
                System.out.println();
                break;
            case 2:

                break;
            case 3:

                break;

            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
