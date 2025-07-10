package app;

import model.SmartBulb;
import model.SmartSpeaker;
import util.Console;

public class SmartHomeDeviceCategoryApp {

    public static void main(String[] arguments) {
        SmartSpeaker speaker = new SmartSpeaker("Living Room Speaker", 100);
        SmartBulb bulb = new SmartBulb("Living Room Bulb", 50);

        Console.println(speaker.toString());
        Console.println(bulb.toString());
    }

}
