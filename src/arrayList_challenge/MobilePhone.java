package arrayList_challenge;

import java.util.ArrayList;

public class MobilePhone {
    private String myPhoneNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myPhoneNumber){
        this.myPhoneNumber = myPhoneNumber;
        myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact){
        int position = findContact(contact.getName());
        if(position >= 0){
            System.out.println("Contact already on file.");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        int position = findContact(oldContact);
        if(position < 0){
            System.out.println(oldContact.getName() + "was not found.");
            return false;
        }else if(findContact(newContact.getName()) != -1){
            System.out.println(newContact.getName() + " already on file.");
            return false;
        }
        myContacts.set(position, newContact);
        return true;
    }

    public void removeContact(Contact contact){
        int position = findContact(contact);
        if(position >= 0){
            myContacts.remove(position);
            System.out.println("Successful remove " + contact.getName());
        }else {
            System.out.println("Error deleting contact.");
        }
    }

    public Contact queryContact(String name){
        int position = findContact(name);
        if(position >= 0){
            return this.myContacts.get(position);
        }
        return null;
    }

    public int findContact(Contact contact){
        return myContacts.indexOf(contact);
    }

    public int findContact(String newName){
        for(int i = 0; i < myContacts.size(); i++){
            Contact contact = myContacts.get(i);
            if(contact.getName().equals(newName)){
                return i;
            }
        }
        return -1;
    }

    public void printContacts(){
        System.out.println("Contact List:");
        for(int i = 0; i < this.myContacts.size(); i++){
            System.out.println((i+1) + " -> " + "Name: " + myContacts.get(i).getName() +
                    ",Phone Number: " + myContacts.get(i).getPhoneNumber());
        }
    }
}
