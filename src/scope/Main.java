package scope;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        ScopeCheck scopeCheck = new ScopeCheck();
//        scopeCheck.timesTwo();
//
//        ScopeCheck.InnerClass innerClass = scopeCheck.new InnerClass();
//        innerClass.timesTwo();
//
//        // visibility test
//        scopeCheck.useInner();

        //chellenge
        X x = new X(new Scanner(System.in));
        x.x();
    }
}
