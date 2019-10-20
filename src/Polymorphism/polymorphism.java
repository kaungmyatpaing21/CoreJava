package Polymorphism;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import javax.xml.transform.Transformer;
//Polymorphism - assigning the different functionalities depending on the type of objects that we've created
class Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "No plot Here.";
    }

    public String getName(){
        return this.name;
    }
}

class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }

    public String plot(){
        return "A shark eats many people.";
    }
}

class IndependenceDay extends Movie{
    public IndependenceDay(){
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens try to take over planet earth.";
    }
}

class MazeRunner extends Movie{
    public MazeRunner(){
        super("Maze Runer");
    }

    @Override
    public String plot(){
        return "kids try to escape a maze.";
    }
}

class Avengers extends Movie{
    public Avengers(){
        super("Avengers");
    }

    @Override
    public String plot(){
        return "Super Heroes try to save the world.";
    }
}

class OnePiece extends Movie{
    public OnePiece(){
        super("One Piece");
    }

    //no plot here
}
public class polymorphism {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++){
            Movie movie = randomMovie();
            System.out.println("Movie #" + movie.getName() + "\n" +
                                "Plot: " + movie.plot());
        }
    }

    public static Movie randomMovie(){
        int randomNumber = (int)(Math.random() * 5) + 1;
        switch(randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new Avengers();
            case 5:
                return new OnePiece();
            default:
                return null;
        }
    }
}
