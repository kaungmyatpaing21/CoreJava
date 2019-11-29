package listAndArrayList;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String itemName){
        groceryList.add(itemName);
    }

    public void printGroceryItems(){
        System.out.println("Your grocery list has " + groceryList.size() + " items.");
        for(int i = 0; i < groceryList.size(); i++){
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String item){
        groceryList.set(position, item);
        System.out.println("Grocery item " + (position + 1) + " has been modified.");
    }

    public void removeGroceryItem(int position){
        groceryList.remove(position);
        System.out.println("Grocery item " + (position + 1) + " has been removed.");
    }

    public String findItem(String item){
        int position = groceryList.indexOf(item);
        if(position >= 0){
            return groceryList.get(position);
        }else{
            return null;
        }
    }

    public ArrayList<String> getGroceryList(){
        return this.groceryList;
    }
}
