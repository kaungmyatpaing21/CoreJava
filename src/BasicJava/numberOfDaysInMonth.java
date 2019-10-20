package BasicJava;

public class numberOfDaysInMonth {
    public static boolean isleapYear(int year){
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            return true;
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year){
        if ((month < 0 || month > 12) || (year < 0 || year > 9999)){
            return -1;
        }
        boolean leapYear = isleapYear(year);
        int numOfDays = 0;

        switch(month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                numOfDays = 31;
                break;
            case 4: case 6: case 9: case 11:
                numOfDays = 30;
                break;
            case 2:
                if (leapYear)
                    numOfDays = 29;
                else
                    numOfDays = 28;
            default:
                break;
        }
        return numOfDays;
    }

    public static void main(String[] args) {
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2200));
        System.out.println(getDaysInMonth(11, 2019));
    }
}
