package BasicJava;

public class validatePrime {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 10000; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                count++;
                if (count == 10)
                    break;
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num == 0 || num == 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if ((num % i) == 0)
                return false;
        }
        return true;
    }
}