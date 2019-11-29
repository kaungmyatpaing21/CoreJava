package listAndArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice;
        printInstructions();
        while(!quit){
            System.out.print("Enter the choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryItems();
                    break;
                case 2:
                    addItem();break;
                case 3:
                    modifyItem();break;
                case 4:
                    removeItem();break;
                case 5:
                    searchItem();break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addItem(){
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.print("Enter the position number: ");
        int position = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the item name: ");
        String item = scanner.nextLine();
        groceryList.modifyGroceryItem(position -1 , item);
    }

    public static void removeItem(){
        System.out.print("Enter the number: ");
        int position = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryItem(position -1 );
    }

    public static void searchItem(){
        System.out.print("Enter the item name: ");
        String searchItem = scanner.nextLine();
        if(groceryList.findItem(searchItem) != null){
            System.out.println("Found " + searchItem + " in our grocery list.");
        }else{
            System.out.println("Not Found " + searchItem + " in our grocery list.");
        }
    }

    public static void processArrayList(){
        //copying ArrayList

        //method 1
        ArrayList<String> newArray = new ArrayList<>();
        newArray.addAll(groceryList.getGroceryList());

        //method 2
        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

        //converting ArrayList to normal array
        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);

    }
}
