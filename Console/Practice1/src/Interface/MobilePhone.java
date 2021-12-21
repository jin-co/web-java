package Interface;

public class MobilePhone implements ITelephone{
    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    @Override
    public void powerOn() {
        System.out.println("No action");
    }

    @Override
    public void dial(int phoneNumber) {
        if (isRinging) {
            System.out.println("answer");
            isRinging = false;
        }
    }

    @Override
    public void answer() {
        System.out.println("No action");

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        System.out.println("No action");
        return false;
    }

    @Override
    public boolean isRinging() {
        System.out.println("No action");
        return false;
    }
}
