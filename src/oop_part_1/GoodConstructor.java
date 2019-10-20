package oop_part_1;

//The understanding of Constructor Chaining.
public class GoodConstructor {
    private int x;
    private int y;
    private int width;
    private int height;

    //1st constructor
    public GoodConstructor(){
        this(0,0); // calling the 2nd constructor
    }

    //2nd constructor
    public GoodConstructor(int width, int height){
        this(0,0,width, height);    //calling the 3rd constructor
    }

    //3rd constructor
    public GoodConstructor(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
