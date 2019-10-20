package oop_part1_challence;

public class Vehicle {
    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size){
        this.name = name;
        this.size = size;
        this.currentDirection = 0;
        this.currentVelocity = 0;
    }

    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at "+ currentDirection + " degrees.");
    }

    public void move(int direction, int velocity){
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle moving at " + currentVelocity + " in direction " + currentDirection);
    }

    public void stop(){
        this.currentVelocity = 0;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}
