public class Main {
    public static void main(String[] args) {

        boolean isStudent = true;
        boolean isSenior = true;
        double price = 9.99;

        if (isStudent) {
            if (isSenior) {
                System.out.println("You will get a discount because you are a senior and student");
                price *= 0.7;
            } else {
                System.out.println("You will get a discount because you are a student");
                price *= 0.9;
            }
        } else {
            if (isSenior) {
                System.out.println("You will get a discount because you are a senior");
                price *= 0.9;
            }
            else {
                System.out.println("You will not get a discount");
                price *= 1;
            }
        }

        System.out.printf("Ticket price: %.2f", price);
    }
}
