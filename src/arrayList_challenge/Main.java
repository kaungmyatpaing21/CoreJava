package arrayList_challenge;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("12345");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        while(!quit){
            System.out.println("Enter action: ");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action){
                case 0:
                    System.out.println("Your phone is shutting down...");
                    quit = true;
                    break;
                case 1:
                    printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }

    }

    public static void startPhone(){
        System.out.println("Your phone is starting...");
    }

    private static void printContacts(){
        mobilePhone.printContacts();
    }

    private static void addNewContact(){
        System.out.println("Enter Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Phone Number: ");
        String phoneNumber = scanner.nextLine();
        Contact contact = Contact.createContact(name, phoneNumber);

        if(mobilePhone.addNewContact(contact)){
            System.out.println("Name: " + contact.getName() + ",Phone: " + contact.getPhoneNumber() + " has been added.");
        }else{
            System.out.println("Error adding contact.");
        }
    }

    private static void updateContact(){
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if(existingContact == null){
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Enter new name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new Phone Number: ");
        String newPhoneNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newPhoneNumber);
        if(mobilePhone.updateContact(existingContact, newContact)){
            System.out.println(existingContact.getName() + " was replaced with " + newContact.getName());
        }else{
            System.out.println("Error updating Contact.");
        }
    }

    private static void removeContact(){
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if(existingContact == null){
            System.out.println("Contact not found");
            return;
        }
        mobilePhone.removeContact(existingContact);
    }

    private static void queryContact(){
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if(existingContact == null){
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Name: " + existingContact.getName() + ", Phone Number: " + existingContact.getPhoneNumber());
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0  - to shutdown\n" +
                "1  - to print contacts\n" +
                "2  - to add a new contact\n" +
                "3  - to update an existing contact\n" +
                "4  - to remove an existing contact\n" +
                "5  - query if an existing contact exists\n" +
                "6  - to print a list of available actions.");
        System.out.println("Choose your action: ");
    }

}
