package oop_part_1;

public class BadConstructor {
    private int x;
    private int y;
    private int width;
    private int height;

    public BadConstructor(){
        this.x = 0;
        this.y = 0;
        this.width = 0;
        this.height = 0;
    }

    public BadConstructor(int width, int height){
        this.x = 0;
        this.y = 0;
        this.width = width;
        this.height = height;
    }

    public BadConstructor(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
