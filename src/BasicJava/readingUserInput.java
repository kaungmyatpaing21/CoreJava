package BasicJava;
import java.util.Scanner;

public class readingUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your year of birth: ");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine(); // handle the Enter key issue

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        int age = 2019 - yearOfBirth;
        System.out.println("Your name is "+ name + ", your age is " + age);
        scanner.close();
    }
}
