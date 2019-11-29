package basicJava;

//Method-overloading --> same method name with different parameters
public class methodOverloading {
    public static void main(String[] args){
        //double result1 = calcFeetAndInchesToCentimeters(6, 0);
        double result2 = calcFeetAndInchesToCentimeters(157);
        if (result2 < 0)
            System.out.println("Invalid result");
        else
            System.out.println(result2);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet >= 0) || (inches >= 0 && inches <= 12)){
            return ((feet * 12) + inches) * 2.54;
        }
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches >= 0){
            int resultingFeet = (int)inches / 12;
            int remainingInches = (int)inches % 12;
            return calcFeetAndInchesToCentimeters(resultingFeet, remainingInches);
        }
        return -1;
    }

}
