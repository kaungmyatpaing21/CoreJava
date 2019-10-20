package oop_part_1;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model){
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore")){
            this.model = validModel;
        }else{
            this.model = "Unknown";
        }
    }

    public String getModel(){
        return this.model;
    }
}
