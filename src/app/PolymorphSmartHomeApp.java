package app;

import model.SmartBulb;
import model.SmartHomeDevice;
import model.SmartHomeDeviceCategory;
import model.SmartSpeaker;

public class PolymorphSmartHomeApp {

    public static void main(String[] arguments) {

        // TODO: Transform SmartHomeDevice to a abstract class with abstract method getDefaultActionByCategory(). Make sure that this app can be executed.

        SmartHomeDevice device1 = new SmartHomeDevice(SmartHomeDeviceCategory.SECURITY);
        SmartHomeDevice device2 = new SmartBulb();
        SmartHomeDevice device3 = new SmartSpeaker();

        System.out.println("Default action for device1: " + device1.getDefaultActionByCategory());
        System.out.println("Default action for device2: " + device2.getDefaultActionByCategory());
        System.out.println("Default action for device3: " + device3.getDefaultActionByCategory());

    }

}
