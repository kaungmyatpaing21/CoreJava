package Inner_Class;

import java.util.ArrayList;

//inner class Demo
public class Inner_Gearbox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0;
    private boolean clutchIsIn;


    public Inner_Gearbox(int maxGears) {
        this.maxGears = maxGears;
        gears = new ArrayList<Gear>();
        Gear neutral = new Gear(0, 0.0);
        gears.add(neutral);

        for(int i = 0; i < maxGears; i++){
            addGear(i, i * 5.3);
        }
    }

    public void operateClutch(boolean in){
        this.clutchIsIn = in;
    }

    public void addGear(int number, double ratio){
        if(number > 0 && number < this.maxGears){
            gears.add(new Gear(number, ratio));
        }
    }

    public void changeGear(int newGear){
        if(newGear >= 0 && newGear < this.gears.size() && clutchIsIn){
            this.currentGear = newGear;
            System.out.println("Gear " + newGear + " selected.");
        }else{
            System.out.println("Grind!!");
            this.currentGear = 0;
        }
    }

    public double wheelSpeed(int revs){
        if(clutchIsIn){
            System.out.println("Scream!!");
            return 0.0;
        }
        return revs * this.gears.get(currentGear).getRatio()    ;
    }

    public class Gear{
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double driveSpeed(int revs){
            return revs * (this.ratio);
        }

        public double getRatio() {
            return ratio;
        }
    }
}
