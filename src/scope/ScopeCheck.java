package scope;

public class ScopeCheck {
    private int varOne = 0;
    private int publicVar = 1;

    public int getVarOne() {
        return varOne;
    }

    public void timesTwo(){
        int varTwo = 2;
        for(int i = 0;i < 10; i++){
            System.out.println(i + " times two is " + i * varTwo);
        }
    }

    public void useInner(){
        InnerClass innerClass = new InnerClass();
        System.out.println("varThree calling from outer class " + innerClass.varThree);
    }

    public class InnerClass{
        private int varThree = 3;

        public void timesTwo(){
//            int privateVar = 4;
            for(int i = 0;i < 10; i++){
                System.out.println(i + " times two is " + i * ScopeCheck.this.varOne);
            }
        }
    }
}
