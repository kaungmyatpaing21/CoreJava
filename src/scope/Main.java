package scope;

public class Main {
    public static void main(String[] args) {
        ScopeCheck scopeCheck = new ScopeCheck();
        scopeCheck.timesTwo();

        ScopeCheck.InnerClass innerClass = scopeCheck.new InnerClass();
        innerClass.timesTwo();
    }
}
