package oop_part_1;

public class SuperCall {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(1,2,3,4);
    }
}

class Shape{
    private int x;
    private int y;

    public Shape(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class Rectangle extends Shape{
    private int width;
    private int height;

    //1st constructor
    public Rectangle(int x, int y){
        this(x, y, 0, 0); //calling the 2nd constructor
    }

    //2nd constructor
    public Rectangle(int x, int y, int width, int height){
        super(x, y); // calling the constructor from parent(Shape)
        this.width = width;
        this.height = height;
    }
}
