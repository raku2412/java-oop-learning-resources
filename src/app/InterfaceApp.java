package app;

import model.SmartDevice;
import model.SmartLamp;
import model.SmartSpeaker;

public class InterfaceApp {

    public static void activateAll(SmartDevice[] devices) {
        for (SmartDevice device : devices) {
            device.turnOn();
        }
    }

    public static void main(String[] arguments) {
        SmartDevice lamp = new SmartLamp();
        SmartDevice speaker = new SmartSpeaker();

        SmartDevice[] devices = { lamp, speaker };

        activateAll(devices);

        for (SmartDevice device : devices) {

            if (device instanceof SmartLamp lampDevice) {
                lampDevice.setBrightness(80);
            }

            if (device instanceof SmartSpeaker speakerDevice) {
                speakerDevice.playMusic("Ludwig van Beethoven – Ode to Joy");
            }

        }
    }
}