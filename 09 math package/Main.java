import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // System.out.println(Math.PI);

        double result;
        Scanner sc = new Scanner(System.in);

        // result = Math.pow(2, 3);
        // result = Math.abs(-5);

        // triangle
        // calculate hypotenuse
        // double side1 = 10;
        // double side2 = 14;
        // result = Math.sqrt((Math.pow(side1, 2) + Math.pow(side2, 2)));

        // circle

        double radius = 5;
        double circumferance;
        double area;
        double volume;

        // System.out.print("Enter radius of circle: ");
        // radius = sc.nextDouble();

        circumferance = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.println("Circumferance: " + circumferance);
        System.out.println("Area: " + area);
        System.out.printf("Volume: %.1f", volume);

        System.out.println();
    }
}
