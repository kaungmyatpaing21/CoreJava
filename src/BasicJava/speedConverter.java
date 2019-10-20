package BasicJava;

import javax.crypto.spec.PSource;
import java.lang.reflect.Field;

public class speedConverter {
    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour < 0)
           return -1;
        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour){
        long var = toMilesPerHour(kilometersPerHour);
        if (var == -1){
            System.out.println("Invalid Value");
        }else{
            System.out.println(kilometersPerHour + "km/h = " + var + " mi/h");
        }
    }

}
