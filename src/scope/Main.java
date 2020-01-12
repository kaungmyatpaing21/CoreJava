package scope;

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

        // visibility chellenge
//        X x = new X(new Scanner(System.in));
//        x.x();

        //SIB Test
        System.out.println("Main method called.");
        SIBTest sibTest = new SIBTest();
        sibTest.someMethod();
        System.out.println("Owner is " + sibTest.owner);
    }
}
