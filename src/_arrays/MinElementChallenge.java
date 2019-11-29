package _arrays;

import java.util.Scanner;

public class MinElementChallenge {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count: \r");
        int count = scanner.nextInt();
        int[] myIntArray = readIntegers(count);
        int min = findMin(myIntArray);

        System.out.println("The minimum number in the array is " + min);
    }

    public static int[] readIntegers(int count){
        int[] myIntArray = new int[count];
        System.out.println("Enter " + count + " numbers: \r");
        for(int i = 0; i < myIntArray.length; i++){
            myIntArray[i] = scanner.nextInt();
        }
        return myIntArray;
    }

    public static int findMin(int[] myIntArray){
        int min = Integer.MAX_VALUE;
        for(int i = 1; i < myIntArray.length; i++){
            if(myIntArray[i] < min) {
                min = myIntArray[i];
            }
        }
        return min;
    }
}
