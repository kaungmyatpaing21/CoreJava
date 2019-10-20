package oop_part_1;
//the intuition of Instance, Object, reference, and class
//an object or instances can have many references
public class ReferenceInJava {
    public static void main(String[] args) {
        House blueHouse = new House("blue");
        House anotherHouse = blueHouse;
        House yellowHouse = new House("yellow");
        anotherHouse = yellowHouse;

        System.out.println("blueHouse: "+ blueHouse.getColor());
        System.out.println("anotherHouse: "+ anotherHouse.getColor());
        System.out.println("yellowHouse: "+ yellowHouse.getColor());

    }
}
