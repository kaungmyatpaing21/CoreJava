package _arrays;

import java.util.Arrays;

public class ReverseArrayChallenge {
    public static void main(String[] args) {
        int[] myIntArray = new int[]{1,2,3,4,5};
        System.out.println("original Array: " + Arrays.toString(myIntArray));
        reverse(myIntArray);
        System.out.printf("Reversed Array: " + Arrays.toString(myIntArray));

    }

    public static void reverse(int[] array){
        int halfLength = array.length / 2;
        int maxIndex = array.length - 1;

        for(int i = 0; i < halfLength; i++){
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }
}
