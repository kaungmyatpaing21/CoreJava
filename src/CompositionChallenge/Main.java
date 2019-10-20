package CompositionChallenge;

public class Main {
    public static void main(String[] args) {
        Wall wall1 = new Wall("Blue");
        Wall wall2 = new Wall("Green");
        Wall wall3 = new Wall("Cyan");
        Wall wall4 = new Wall("White");

        Ceiling ceiling = new Ceiling(20, "Rose Gold");
        Bed bed = new Bed("Modern", 4,3,2,1);
        Lamp lamp = new Lamp("Classic", false, 75);
        Bedroom bedRoom = new Bedroom("luffy's bed", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

        bedRoom.makeBed();
        bedRoom.getLamp().turnOn();
    }
}
