import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String adj1;
        String noun;
        String adj2;
        String verb;
        String adj3;

        System.out.print("Enter an adjective: ");
        adj1 = sc.next();
        System.out.print("Enter a noun: ");
        noun = sc.next();
        System.out.print("Enter a adjective: ");
        adj2 = sc.next();
        System.out.print("Enter a verb:");
        verb = sc.next();
        System.out.print("Enter an adjective: ");
        adj3 = sc.next();

        System.out.println("Today I went to a " + adj1 + " zoo.");
        System.out.println("In an exhibit, I saw a " + noun + "!");
        System.out.println(noun + " was " + adj2 + " and " + verb + "!");
        System.out.println("I was " + adj3 + "!");

        sc.close();
    }
}
