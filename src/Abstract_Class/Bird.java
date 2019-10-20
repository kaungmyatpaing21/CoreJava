package Abstract_Class;

public abstract class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println(getName() + " is eating.");
    }

    @Override
    void breathe() {
        System.out.println("The bird is breathing slowly.");
    }

    //some birds cannot fly so abstract fly method is added
    abstract void fly();
}
