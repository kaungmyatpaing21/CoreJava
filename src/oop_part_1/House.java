package oop_part_1;

public class House {
    private String color;

    public House(){
        this("Unknown");
    }

    public House(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }
}
