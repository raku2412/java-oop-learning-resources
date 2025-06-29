package app;

import model.Location;
import model.SmartBulb;
import model.SmartSpeaker;
import util.Console;

import java.time.LocalDateTime;

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
            int newVolume = Console.readInt("Enter new volume for the SmartSpeaker (0-100)", 0, 100);
            smartSpeaker.setVolume(newVolume);
            Console.print("Updated SmartSpeaker details: " + smartSpeaker.toString());

        } else if (device.equals(livingRoomBulb) || device.equals(kitchenBulb)) {
            SmartBulb smartBulb = createNewSmartBulb(
                    device, device.equals(livingRoomBulb) ? 50 : 100
            );
            Console.print("Current SmartBulb details: " + smartBulb.toString());
            int newBrightness = Console.readInt("Enter new brightness for the SmartBulb (0-100)", 0, 100);
            smartBulb.setBrightness(newBrightness);
            Console.print("Updated SmartBulb details: " + smartBulb.toString());
            // TODO: Replace with the turn off at method; receive the local date time from the user via console input beforehand
            int seconds = Console.readInt("When do you want the speaker to turn off in seconds? (0-120)", 0, 120);
            smartBulb.turnOffTimed(seconds);
            Console.print("Current SmartBulb details: " + smartBulb.toString());
        }

    }

    private static SmartSpeaker createNewSmartSpeaker(String name, int initialVolume) {
        return new SmartSpeaker(
                name,
                initialVolume,
                new Location(null, "Beijing Road", "123", "Shanghai", "China"),
                new Location(
                        name.replace(" Speaker", ""),
                        "Main Street",
                        "123",
                        "Berlin",
                        "Germany"
                )
        );
    }

    private static SmartBulb createNewSmartBulb(String name, int initialBrightness) {
        return new SmartBulb(
                name,
                initialBrightness,
                new Location(null, "Beijing Road", "123", "Shanghai", "China"),
                new Location(
                        name.replace(" Bulb", ""),
                        "Main Street",
                        "123",
                        "Berlin",
                        "Germany"
                )
        );
    }

    private static LocalDateTime readLocalDateTimeFromConsole() {
        int year = Console.readInt("Enter year (YYYY)", 2000, 2100);
        int month = Console.readInt("Enter month (1-12)", 1, 12);
        int day = Console.readInt("Enter day (1-31)", 1, 31);
        int hour = Console.readInt("Enter hour (0-23)", 0, 23);
        int minute = Console.readInt("Enter minute (0-59)", 0, 59);
        return LocalDateTime.of(year, month, day, hour, minute);
    }

}
