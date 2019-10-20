package CompositionChallenge;

public class Bedroom {
    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    public Bedroom(String name, Wall wall1, Wall wall11, Wall wall12, Wall wall13, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall1 = wall11;
        this.wall1 = wall12;
        this.wall1 = wall13;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public void makeBed(){
        System.out.println("Bedroom --> Making Bed.");
        bed.make();
    }

    public Lamp getLamp() {
        return this.lamp;
    }
}
