package oop_part_1;

public class CarMain {
    public static void main(String[] args) {
        Car porsche = new Car();
        porsche.setModel("911");
        System.out.println("Model is " + porsche.getModel());
        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());
    }
}
