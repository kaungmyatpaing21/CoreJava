package Abstract_Class;

public class Penguin extends Bird {

    public Penguin(String name) {
        super(name);
    }

    @Override
    void fly() {
        System.out.println("Sad, I can't fly guys x'))");
    }
}
