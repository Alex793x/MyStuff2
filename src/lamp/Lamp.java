package lamp;

public class Lamp {
    private boolean isOn;
    public static int lampCounter = 1;
    private int uniqueLampNo;
    //Setter ---------------
    public void setIsOn(boolean isOn){
        this.isOn = isOn;
    }

    public void setUniqueLampNo(int uniqueLampNo) {
        this.uniqueLampNo = uniqueLampNo;
    }

    // Getter --------------
    public boolean isOn() {
        return isOn;
    }

    // Constructor
    public Lamp() {
        setUniqueLampNo(lampCounter++);

    }

    public void pushSwitch() {
        if(isOn() == false) {
            setIsOn(true);
        } else if (isOn() == true) {
            setIsOn(false);
        }
    }

    @Override
    public String toString() {
        return "Lamp is " + isOn() + "\n" + "and its production-number is " + uniqueLampNo;
    }
}
