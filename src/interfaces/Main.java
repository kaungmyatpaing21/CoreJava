package interfaces;

public class Main {
    public static void main(String[] args) {
        ITelephone myPhone;
        myPhone = new GearBox(123456);
        myPhone.powerOn();
        myPhone.callPhone(123456);
        myPhone.answer();

        myPhone = new MobilePhone(23456);
        myPhone.powerOn();
        myPhone.callPhone(23456);
        myPhone.answer();

    }
}
