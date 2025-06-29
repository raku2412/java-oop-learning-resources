package app;

import model.SmartBulb;
import model.SmartHomeRoom;
import model.SmartSpeaker;

public class SmartHomeCollectionApp {

    public static void main(String[] arguments) {
        SmartBulb livingRoomBulb = new SmartBulb("Living Room Bulb", 75);
        SmartBulb kitchenBulb = new SmartBulb("Kitchen Bulb", 60);
        SmartBulb bedroomBulb = new SmartBulb("Bedroom Bulb", 80);

        SmartSpeaker livingRoomSpeaker = new SmartSpeaker("Living Room Speaker", 100);
        SmartSpeaker kitchenSpeaker = new SmartSpeaker("Kitchen Speaker", 50);

        SmartHomeRoom livingRoom = new SmartHomeRoom(livingRoomBulb, livingRoomSpeaker);
        SmartHomeRoom kitchen = new SmartHomeRoom(kitchenBulb, kitchenSpeaker);
        SmartHomeRoom bedroom = new SmartHomeRoom(bedroomBulb, null);

        showIntArrayExample();

        // TODO: Initialize smart home rooms with SmartHomeRoom objects in different ways (see int array example)
        SmartHomeRoom[] rooms = new SmartHomeRoom[3];
        System.out.println("The mean brightness of all SmartBulbs is: " + getMeanBrightness(rooms));
    }

    private static void showIntArrayExample() {
        int[] array1 = new int[5];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = i * 10;
        }
        printArray("array1", array1);

        int[] array2 = {10, 20, 30, 40, 50};
        printArray("array2", array2);

        int[] array3 = createArray(10, 20, 30, 40, 50);
        printArray("array3", array3);
    }

    private static void printArray(String name, int[] array) {
        System.out.println(name + " values:");
        for (int value : array) {
            System.out.println(value);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("Value at index " + i + ": " + array[i]);
        }
    }

    @SuppressWarnings("ManualArrayCopy")
    private static int[] createArray(int... values) {
        int[] array = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            array[i] = values[i];
        }
        return array;
    }

    private static int getMeanBrightness(SmartHomeRoom[] rooms) {
        // TODO: Implement mean brightness calculation
        throw new IllegalStateException("Method not implemented yet");
    }

}
