package oop_part_1;

public class Fish extends Animal{
    private int gills;
    private int fins;
    private int eyes;

    public Fish(int gills, int fins, int eyes){
        super("unkown", 1, 1,0,0);
        this.gills = gills;
        this.fins = fins;
        this.eyes = eyes;
    }

    public Fish(String name, int brain, int body, int size, int weight, int gills, int fins, int eyes) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.fins = fins;
        this.eyes = eyes;
    }

    private void rest(){
        System.out.println("Fish.rest method called.");
    }

    private void moveMuscles(){
        System.out.println("Fish.moveMuscles method called.");
    }

    private void moveBackFin(){
        System.out.println("Fish.moveBackFin method called.");
    }

    private void swin(){
        moveMuscles();
        moveBackFin();
        super.move();
    }

    public int getGills() {
        return gills;
    }

    public int getFins() {
        return fins;
    }

    public int getEyes() {
        return eyes;
    }
}
