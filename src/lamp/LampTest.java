package lamp;

public class LampTest {

    public void run() {
        Lamp tableLamp = new Lamp();
        Lamp bedLamp = new Lamp();

        tableLamp.pushSwitch();
        bedLamp.pushSwitch();
        tableLamp.pushSwitch();
        bedLamp.pushSwitch();


        System.out.println(tableLamp);
        System.out.println(bedLamp);

    }

    public static void main(String[] args) {
        new LampTest().run();
    }
}
