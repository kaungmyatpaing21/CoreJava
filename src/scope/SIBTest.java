package scope;
/**
 * Static Initialization Block Test
 */
public class SIBTest {
    public static final String owner;

    static {
        owner = "luffy";
        System.out.println("SIBTest initialization block called.");
    }

    public SIBTest(){
        System.out.println("constructor called."); //  creating the constructor before SIB is not a good practice
    }

    static{
        System.out.println("2nd initialization block called.");
    }

    public void someMethod(){
        System.out.println("some method called.");
    }
}
