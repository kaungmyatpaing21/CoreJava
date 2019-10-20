package BasicJava;
import java.util.Scanner;

public class validateReadingUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth: ");
        boolean hasInt = scanner.hasNextInt(); //return false if input is not number

        if (hasInt){
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();

            int age = 2019 - yearOfBirth;
            if (age > 0 && age < 120){
                System.out.println("Your name: "+ name + " ,Your age: "+ age);
            }
        }else{
            System.out.println("Invalid year of Birth!");
        }
        scanner.close();
    }
}
