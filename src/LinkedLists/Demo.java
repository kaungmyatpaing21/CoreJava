package LinkedLists;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        addInOrder(linkedList, "Yangon");
        addInOrder(linkedList, "Mandalay");
        addInOrder(linkedList, "Bago");
        addInOrder(linkedList, "Magwe");
        addInOrder(linkedList, "Taunggyi");
        printList(linkedList);
        visit(linkedList);
    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("===================================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while(stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison == 0){
                // do not add duplicate
                System.out.println(newCity + " is already in the list.");
                return false;
            }else if(comparison > 0){
                // new city should be in previous
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }else if(comparison < 0){
                // do nothing
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList<String> cities){
        Scanner scanner = new Scanner(System.in);
        boolean goingForward = true;
        boolean quit = false;
        ListIterator<String> stringListIterator = cities.listIterator();

        if(cities.isEmpty()){
            System.out.printf("No cities in the itenerary.");
            return;
        }else{
            System.out.println("Now visiting " + stringListIterator.next());
            printMenu();
        }

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("Holiday (vacation) is over.");
                    quit = true;
                    break;

                case 1:
                    if(!goingForward){
                        if(stringListIterator.hasNext()){
                            stringListIterator.next();
                        }
                        goingForward = true;
                    }
                    if(stringListIterator.hasNext()){
                        System.out.println("Now visiting " + stringListIterator.next());
                    }else{
                        System.out.println("we are at the end of the list.");
                    }
                    break;

                case 2:
                    if(goingForward){
                        if(stringListIterator.hasPrevious()){
                            stringListIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(stringListIterator.hasPrevious()){
                        System.out.println("Now visiting " + stringListIterator.previous());
                    }else{
                        System.out.println("We are at the start of the list.");
                    }
                    break;

                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress ");
        System.out.println("0 - to quit\n" +
                "1 - go to next city\n" +
                "2 - go to previous city\n" +
                "3 - print menu options");
    }
}
