package Inner_Class;

public class DriverClass {
    public static void main(String[] args) {
        // accessing the inner static class
        OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();
        nestedObject.display();
    }
}
