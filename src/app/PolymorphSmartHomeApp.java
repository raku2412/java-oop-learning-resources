package app;

import model.SmartBulb;
import model.SmartHomeDevice;
import model.SmartSpeaker;
import model.UnsupportedActionException;

public class PolymorphSmartHomeApp {

    public static void main(String[] arguments) {

        SmartHomeDevice device1 = new SmartBulb();
        SmartHomeDevice device2 = new SmartSpeaker();

        System.out.println("Default action for device1: " + device1.getDefaultActionByCategory());
        System.out.println("Default action for device2: " + device2.getDefaultActionByCategory());

        try {
            device1.performAction("turnOn");
            device1.performAction("turnOff");
            device1.performAction("playMusic");
        } catch (UnsupportedActionException e) {
            System.out.println(e.getMessage());
        }

        try {
            device2.performAction("playMusic");
            device2.performAction("pause");
            device2.performAction("turnOff");
        } catch (UnsupportedActionException e) {
            System.out.println(e.getMessage());
        }

    }

}
