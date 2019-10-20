package oop_part_1;

public class CovariantReturnType {
    public static void main(String[] args) {

    }
}

class Burgar{
    //fields
}

class HealthyBurgar extends Burgar{
    //fields
}

class BurgarFactory{
    public Burgar createBurgar(){
        return new Burgar();
    }
}

class HealthyBurgarFactory extends BurgarFactory{

    @Override
    public HealthyBurgar createBurgar(){
        return new HealthyBurgar();
    }
}
