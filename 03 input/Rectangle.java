import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of rectangle: ");
        float length = sc.nextFloat();

        System.out.println("Enter breadth of rectangle: ");
        float breadth = sc.nextFloat();

        float area = length * breadth;

        System.out.println("Area of rectangle: " + area + "cm^2");
        sc.close();
    }    
}
