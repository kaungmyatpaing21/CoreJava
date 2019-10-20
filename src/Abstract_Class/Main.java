package Abstract_Class;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Chin Khway");
        dog.eat();
        dog.breathe();

        Parrot parrot = new Parrot("Myanmar Parrot");
        parrot.eat();
        parrot.breathe();
        parrot.fly();

        Penguin penguin = new Penguin("crazy Penguin");
        penguin.eat();
        penguin.breathe();
        penguin.fly();
    }
}
