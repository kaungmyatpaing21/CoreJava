package abstract_Class;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void eat();
    abstract void breathe();

    public String getName() {
        return name;
    }
}
