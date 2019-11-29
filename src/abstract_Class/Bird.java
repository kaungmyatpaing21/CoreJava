package abstract_Class;

public abstract class Bird extends Animal implements CanFly {

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

    @Override
    public void fly(){
        System.out.println(getName() + " is flapping its wings.");
    }

//    abstract void canFly();
}
