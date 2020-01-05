package fafisum;

public class Series {
    public int nSum(int n){
        int sum = 0;
        for(int i = 0; i <= n; i++){
            sum += i;
        }
        return sum;
    }

    public int factorial(int n){
        if(n == 0){
            return 1;
        }

        int product = 1;
        for(int i = n; i >= 1; i--){
            product *= i;
        }
        return product;
    }

    public int fibonacci(int n){
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }

        int n1 = 0; int n2 = 1;
        int fib = 0;
        for(int i = 2; i <= n; i++){
            fib = n1 + n2;
            n1 = n2; n2 = fib;
        }
        return fib;
    }
}
