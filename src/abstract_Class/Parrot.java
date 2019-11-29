package abstract_Class;

public class Parrot extends Bird {

    public Parrot(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println(getName() + " is jumping from branch to branch.");
    }
}
