package interfaces;

public class GearBox implements ITelephone {
    private int myNumber;
    private boolean isRinging;

    public GearBox(int phoneNumber){
        this.myNumber = phoneNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("No action taken, desk phone does not have no power button.");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + " on desk phone.");
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering the desk phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber){
            isRinging = true;
            System.out.println("Ring Ring");
        }else{
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
