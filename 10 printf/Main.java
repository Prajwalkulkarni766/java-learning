public class Main {
    public static void main(String[] args) {
        
        String name = "Ram";
        char firstLetter = 'a';
        int age = 22;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Name: %s\n", name);
        System.out.printf("First letter: %c\n", firstLetter);
        System.out.printf("Age: %d\n", age);
        System.out.printf("Height: %f\n", height);
        System.out.printf("Is employed: %b\n", isEmployed);

        System.out.printf("%s is %d year old.", name, age);

        double price1 = -9.99;
        double price2 = 45.99;

        System.out.printf("Price1: %f\n", price1);
        System.out.printf("Price2: %f\n", price2);

        System.out.printf("Price1: %.1f\n", price1);
        System.out.printf("Price2: %.1f\n", price2);

        // to display + sign use + after .
        // to display common use , after .
        
    }
}
