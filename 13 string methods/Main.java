import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // String name = new String("Abc");

        // int length = name.length();
        // char letter = name.charAt(0);

        // String lowerCaseName = name.toLowerCase();
        // String upperCaseName = name.toUpperCase();

        // name = name.trim();

        Scanner sc = new Scanner(System.in);

        String email;

        System.out.print("Enter your email address: ");
        email = sc.next();

        String username = email.substring(0, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@") + 1);

        System.out.printf("Username: %s and Domain: %s", username, domain);

        sc.close();    
    }
}
