package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class IntroArrays {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] intArray = getIntegers(5);
        for(int i = 0; i < intArray.length; i++){
            System.out.println("Element " + i + " typed value is " + intArray[i]);
        }

        //calculate average
        double avg = getAverage(intArray);
        System.out.println("The average value is " + avg);

        //sorting array
        int[] sortedArray = sortArray(intArray);
        for(int i = 0; i < sortedArray.length; i++){
            System.out.println("Sorted Element " + i + " typed value is " + sortedArray[i]);
        }
    }

    public static int[] getIntegers(int count){
        System.out.println("Enter "+ count + " Integer values.\r");
        int[] values = new int[count];
        for(int i = 0; i < values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] myIntArray){
        double sum = 0;
        for(int i = 0; i < myIntArray.length; i++){
            sum += myIntArray[i];
        }
        return (double) sum / (double) myIntArray.length;
    }

    public static int[] sortArray(int[] array){
        int[] sortedArray = Arrays.copyOf(array, array.length); //copy array to sortedArray with equal length

        boolean flag = true;
        while(flag){
            flag = false;
            for(int i = 0; i < sortedArray.length - 1; i++){
                if(sortedArray[i] < sortedArray[i + 1]){
                    int tmp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = tmp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
