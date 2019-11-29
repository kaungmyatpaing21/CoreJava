package basicJava;
import java.util.Scanner;

public class readingUserInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int counter = 1;
        while (counter <= 10){
            System.out.println("Enter number " + counter + " : ");
            boolean isValidNumber = scanner.hasNextInt();
            if (isValidNumber){
                double number = scanner.nextDouble();
                sum += number;
                counter++;
            }else{
                System.out.println("Invalid Number.");
            }
            scanner.nextLine(); //handle end of line (Enter Key)
        }
        System.out.println("Total Number : " + sum);
        scanner.close();
    }
}
