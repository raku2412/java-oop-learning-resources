package app;

import model.SmartBulb;
import model.SmartHomeDevice;
import model.SmartSpeaker;
import model.UnsupportedActionException;

public class PolymorphSmartHomeApp {

    @SuppressWarnings({"ConstantValue", "CastCanBeRemovedNarrowingVariableType"})
    public static void main(String[] arguments) {

        SmartHomeDevice device1 = new SmartBulb();
        SmartHomeDevice device2 = new SmartSpeaker();

        System.out.println("Default action for device1: " + device1.getDefaultActionByCategory());
        System.out.println("Default action for device2: " + device2.getDefaultActionByCategory());

        try {
            if (device1 instanceof SmartBulb) {
                ((SmartBulb) device1).performAction("turnOn");
                ((SmartBulb) device1).performAction("turnOff");
                ((SmartBulb) device1).performAction("playMusic");
            }
        } catch (UnsupportedActionException e) {
            System.out.println(e.getMessage());
        }

    }

}
