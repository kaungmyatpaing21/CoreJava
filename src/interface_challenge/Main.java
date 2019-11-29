package interface_challenge;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player luffy = new Player("Luffy", 100, 30);
        System.out.println(luffy.toString());
        saveObject(luffy);
//        loadObject(luffy);
//        saveObject(luffy);
        luffy.setWeapon("Gear Second");
        saveObject(luffy);

        System.out.println();

        ISavable wolf = new Monster("Mountain Wolf", 40, 20);
        System.out.println(((Monster)wolf).getStrength());
        saveObject(wolf);
    }

    public static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                    "1, to Enter a String.\n" +
                    "0, to quit.");

        while(!quit){
            System.out.print("Choose a option: ");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    quit = true;
                    break;

                case 1:
                    System.out.print("Enter a String: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISavable objectToSave){
        for(int i = 0; i < objectToSave.write().size(); i++){
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device.");
        }
    }

    public static void loadObject(ISavable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}
