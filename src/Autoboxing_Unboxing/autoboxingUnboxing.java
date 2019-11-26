package Autoboxing_Unboxing;

import java.util.ArrayList;

class intClass{
    private int myInt;
    public intClass(int myInt){
        this.myInt = myInt;
    }

    public int getMyInt() {
        return myInt;
    }

    public void setMyInt(int myInt) {
        this.myInt = myInt;
    }
}

public class autoboxingUnboxing {
    public static void main(String[] args) {
        ArrayList<String> myStringArrayList = new ArrayList<String>(); //it's OK cuz String is class
//        ArrayList<int> myIntArrayList = new ArrayList<int>(); // it got an error cuz "int" is primitive data type and not class

        //a little bit tricky way to create integer ArrayList
        ArrayList<intClass> myIntArrayList = new ArrayList<intClass>();
        myIntArrayList.add(new intClass(50));

        //efficient way to create integer ArrayList
        ArrayList<Integer> myIntegerArrayList = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            myIntegerArrayList.add(Integer.valueOf(i)); //Integer.valueOf - converting primitive int type into Integer object type(class) - autoboxing
        }

        for(int i = 0; i < 10; i++){
            System.out.println(myIntegerArrayList.get(i).intValue()); //intValue converts Integer object type to primitive integer type - unboxing
        }

        //also the same for double typeprimitive
        ArrayList<Double> myDoubleArrayList = new ArrayList<Double>();
        for(double i = 0.0; i < 10; i += 0.5){
            myDoubleArrayList.add(Double.valueOf(i));
        }

        for(int i = 0; i < 10; i++){
            System.out.println(myDoubleArrayList.get(i).doubleValue());
        }

        //Java automatically invoke__
        Integer myIntValue = 56; // Integer.valueOf(56)
        int myInt = myIntValue; // intValue(myIntValue)

        ///////////////////////////////////////////////////////

        ArrayList<Integer> newIntegerArrayList = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            newIntegerArrayList.add(i); //automatically invoke Integer.valueOf(i)
        }

        for(int i = 0; i < 10; i++){
            System.out.println(newIntegerArrayList.get(i)); // automatically invoke intValue(i)
        }
    }
}
