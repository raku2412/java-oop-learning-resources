package app;

import model.SmartBulb;
import model.SmartSpeaker;
import util.Console;

public class SmartHomeApp {

    @SuppressWarnings("UnnecessaryToStringCall")
    public static void main(String[] arguments) {

        String livingRoomSpeaker = "Living Room Speaker";
        String kitchenSpeaker = "Kitchen Speaker";
        String livingRoomBulb = "Living Room Bulb";
        String kitchenBulb = "Kitchen Bulb";
        String device = Console.readChoice(
                "Which device do you want to control?",
                new String[]{livingRoomSpeaker, kitchenSpeaker, livingRoomBulb, kitchenBulb}
        );

        if (device.equals(livingRoomSpeaker) || device.equals(kitchenSpeaker)) {
            SmartSpeaker smartSpeaker = createNewSmartSpeaker(
                    device, device.equals(livingRoomSpeaker) ? 100 : 50
            );
            Console.print("Current SmartSpeaker details: " + smartSpeaker.toString());
            Console.print(smartSpeaker.getDefaultActionByCategory());
            int newVolume = Console.readInt("Enter new volume for the SmartSpeaker (0-100)", 0, 100);
            smartSpeaker.setVolume(newVolume);
            Console.print("Updated SmartSpeaker details: " + smartSpeaker.toString());

        } else if (device.equals(livingRoomBulb) || device.equals(kitchenBulb)) {
            SmartBulb smartBulb = createNewSmartBulb(
                    device, device.equals(livingRoomBulb) ? 50 : 100
            );
            Console.print("Current SmartBulb details: " + smartBulb.toString());
            Console.print(smartBulb.getDefaultActionByCategory());
            int newBrightness = Console.readInt("Enter new brightness for the SmartBulb (0-100)", 0, 100);
            smartBulb.setBrightness(newBrightness);
            Console.print("Updated SmartBulb details: " + smartBulb.toString());
        }

    }

    private static SmartSpeaker createNewSmartSpeaker(String name, int initialVolume) {
        return new SmartSpeaker(name, initialVolume);
    }

    private static SmartBulb createNewSmartBulb(String name, int initialBrightness) {
        return new SmartBulb(name, initialBrightness);
    }

}
