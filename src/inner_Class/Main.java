package inner_Class;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Button printBtn = new Button("Print");

    public static void main(String[] args) {

        //Inner Class Demo Test
//        Inner_Gearbox mclaren = new Inner_Gearbox(6);
//        //creating the instance of inner-class
//        //Inner_Gearbox.Gear gearFirst = mclaren.new Gear(1,12.3);
//
//        mclaren.operateClutch(true);
//        mclaren.changeGear(2);
//        mclaren.operateClutch(false);
//        System.out.println(mclaren.wheelSpeed(1000));
//        mclaren.operateClutch(true);
//        mclaren.changeGear(1);
//        System.out.println(mclaren.wheelSpeed(1000));
//        mclaren.operateClutch(false);
//        mclaren.changeGear(3);
//        System.out.println(mclaren.wheelSpeed(1200));

//         Local Class Demo Test
//         this class is needed for only buttons and won't be used in any other places

//        class ClickListener implements Button.OnClickListener{
//            public ClickListener(){
//                System.out.println("I've been attached.");
//            }
//
//            @Override
//            public void onClick(String title){
//                System.out.println(title + " was clicked.");
//            }
//        }

//        printBtn.setOnClickListener(new ClickListener());

        //Anonymous class demo and test
        printBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked.");
            }
        });

        listen();
    }

    public static void listen(){
        boolean quit = false;
        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    quit = true;
                    break;

                case 1:
                    printBtn.onClick();
                    break;
            }
        }
    }
}
