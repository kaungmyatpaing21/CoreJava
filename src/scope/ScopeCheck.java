package scope;

public class ScopeCheck {
    private int privateVar = 0;
    private int publicVar = 1;

    public int getPrivateVar() {
        return privateVar;
    }

    public void timesTwo(){
        int privateVar = 2;
        for(int i = 0;i < 10; i++){
            System.out.println(i + " times two is " + i * privateVar);
        }
    }

    public class InnerClass{
//        private int privateVar = 3;

        public void timesTwo(){
//            int privateVar = 4;
            for(int i = 0;i < 10; i++){
                System.out.println(i + " times two is " + i * ScopeCheck.this.privateVar);
            }
        }
    }
}
