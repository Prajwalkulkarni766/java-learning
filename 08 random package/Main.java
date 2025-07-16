import java.util.Random;

public class Main {
    public static void main(String[] args) {
        
        Random rand = new Random();

        int num = rand.nextInt();
        double dou = rand.nextDouble();
        boolean bool = rand.nextBoolean();

        System.out.println(num + " " + dou + " " + bool);
    }
}
