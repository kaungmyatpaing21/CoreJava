package oop_part_1;

public class DogMain {
    public static void main(String[] args) {
        Dog dog = new Dog("AungNet", 1, 1, 25, 25, 2,4,1,22,"long silky");
        dog.eat();
        dog.walk();

        Fish fish = new Fish("Nemo", 1,1,10,10,2,2,2);
        System.out.println("Name of Fish is " + fish.getName());
    }
}
