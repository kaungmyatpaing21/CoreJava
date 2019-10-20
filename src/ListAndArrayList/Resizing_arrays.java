package ListAndArrayList;
import java.util.Arrays;
import java.util.Scanner;

//a tricky way to resize arrays without not using list, arrayList
public class Resizing_arrays {
    private static Scanner scanner = new Scanner(System.in);
    private static int[] baseData = new int[10];

    public static void main(String[] args) {
        System.out.println("Enter 10 integers: ");
        getInput();
        printArray(baseData);
        resizeArray();
        baseData[10] = 100;
        baseData[11] = 200;
        printArray(baseData);
    }

    public static void getInput(){
        for(int i = 0; i < baseData.length; i++){
            baseData[i] = scanner.nextInt();
        }
    }

    public static void printArray(int[] array){
        System.out.println(Arrays.toString(array));
    }

    public static void resizeArray(){
        int[] original = baseData;
        baseData = new int[12];

        for(int i = 0; i < original.length; i++){
            baseData[i] = original[i];
        }
    }
}
