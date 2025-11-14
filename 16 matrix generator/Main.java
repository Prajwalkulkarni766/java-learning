import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows;
        int columns;
        char character;

        System.out.print("Enter the # of rows: ");
        rows = sc.nextInt();

        System.out.print("Enter the # of columns: ");
        columns = sc.nextInt();

        System.out.print("Enter the symbol to use: ");
        character = sc.next().charAt(0);

        while (rows > 0) {

            for (int i = 0; i < columns; i++) {
                System.out.print(character);
            }
            System.out.println();
            rows--;
        }

        sc.close();
    }

}
