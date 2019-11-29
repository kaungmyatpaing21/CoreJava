package composition;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(50,50,50);
        Case theCase = new Case("220B", "Asus", "240", dimensions);

        Monitor monitor = new Monitor("strixG", "Dell", 27, new Resolution(1920, 1080));
        Motherboard motherboard = new Motherboard("BJ200", "Asus", 4,6,"v2.44");

        PC thePC = new PC(theCase, monitor, motherboard);

        thePC.getMonitor().drawPixelAt(2,3,"yello");
        thePC.getMotherboard().loadProgram("Photoshop");
        thePC.getTheCase().pressPowerButton();
    }
}
