package app;

import model.SmartBulb;
import model.SmartHomeDevice;
import model.SmartSpeaker;

public class PolymorphSmartHomeApp {

    public static void main(String[] arguments) {

        // TODO: Add method usage according to README and add exception handling

        SmartHomeDevice device1 = new SmartBulb();
        SmartHomeDevice device2 = new SmartSpeaker();

        System.out.println("Default action for device1: " + device1.getDefaultActionByCategory());
        System.out.println("Default action for device2: " + device2.getDefaultActionByCategory());

    }

}
