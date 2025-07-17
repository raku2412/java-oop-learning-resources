package app;

import model.SmartBulb;
import model.SmartHomeDevice;
import model.SmartHomeDeviceCategory;
import model.SmartSpeaker;

public class PolymorphSmartHomeApp {

    public static void main(String[] arguments) {

        SmartHomeDevice device1 = new SmartHomeDevice(SmartHomeDeviceCategory.SECURITY);
        SmartHomeDevice device2 = new SmartBulb();
        SmartHomeDevice device3 = new SmartSpeaker();

        System.out.println("Default action for device1: " + device1.getDefaultActionByCategory());
        System.out.println("Default action for device2: " + device2.getDefaultActionByCategory());
        System.out.println("Default action for device3: " + device3.getDefaultActionByCategory());

    }

}
