package oop_part_1;

public class Dog extends Animal{
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int brain, int body, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Dog.chew() method called.");
    }

    public void walk(){
        System.out.println("Dog.walk() method called.");
        super.move();
    }

    public void moveLegs(){
        System.out.println("Dog.moveLegs() method called.");
    }

    //override - creating a version of the same method of parent class but unique for the current class
    @Override
    public void eat() {
        System.out.println("Dog.eat() called.");
        chew();
        super.eat();
    }

    @Override
    public void move(){
        System.out.println("Dog.move() method called.");
    }
}
