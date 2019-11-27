package Inner_Class;

// Static Nested Class Demo
public class OuterClass {

    // static member
    static int outer_x = 10;

    // instance(non-static) member
    int outer_y = 20;

    // private member
    private static int outer_private = 30;

    static class StaticNestedClass{

        void display(){

            // accessing the outer private member
            System.out.println("outer_x: " + outer_x);
            System.out.println("outer_private: " + outer_private);
        }
    }
}
