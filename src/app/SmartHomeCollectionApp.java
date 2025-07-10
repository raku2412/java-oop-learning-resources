package app;

import model.SmartBulb;
import model.SmartHome;

public class SmartHomeCollectionApp {

    public static void main(String[] arguments) {
        SmartBulb livingRoomBulb = new SmartBulb("Living Room Bulb", 75);
        SmartBulb kitchenBulb = new SmartBulb("Kitchen Bulb", 60);
        SmartBulb bedroomBulb = new SmartBulb("Bedroom Bulb", 80);

        showIntArrayExample();
        showIntIdValuePairCollectionExample();

        SmartHome smartHome = new SmartHome(3);
        smartHome.addSmartBulb(livingRoomBulb);
        smartHome.addSmartBulb(kitchenBulb);
        smartHome.addSmartBulb(bedroomBulb);

        System.out.println("Mean Brightness: " + smartHome.getMeanBrightness());
        System.out.println("Minimum Brightness: " + smartHome.getMinimumBrightness());
        System.out.println("Maximum Brightness: " + smartHome.getMaximumBrightness());
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

    @SuppressWarnings("UnnecessaryToStringCall")
    private static void showIntIdValuePairCollectionExample() {
        IntArrayCollection collection = new IntArrayCollection(5);
        IntIdValuePair entry1 = new IntIdValuePair(1, 10);
        IntIdValuePair entry2 = new IntIdValuePair(2, 20);
        IntIdValuePair entry3 = new IntIdValuePair(3, 30);
        IntIdValuePair entry4 = new IntIdValuePair(4, 40);
        IntIdValuePair entry5 = new IntIdValuePair(5, 50);
        collection.add(entry1);
        collection.add(entry2);
        collection.add(entry3);
        collection.add(entry4);
        collection.add(entry5);
        System.out.println("Current " + collection.toString());
        collection.remove(entry3);
        System.out.println("After removing entry3: " + collection.toString());
    }

    @SuppressWarnings("ClassCanBeRecord")
    static class IntIdValuePair {

        private final int id;
        private final int value;

        public IntIdValuePair(int id, int value) {
            this.id = id;
            this.value = value;
        }

        public int getId() {
            return id;
        }

        public int getValue() {
            return value;
        }

    }

    static class IntArrayCollection {

        private final int[] collection;

        public IntArrayCollection(int size) {
            this.collection = new int[size];
        }

        public void add(IntIdValuePair entry) {
            collection[entry.id - 1] = entry.value;
        }

        public void remove(IntIdValuePair entry) {
            collection[entry.id] = 0;
        }

        public int get(int id) {
            return collection[id - 1];
        }

        public int[] getAll() {
            return collection.clone();
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("IntArrayCollection: ");
            for (int i = 0; i < collection.length; i++) {
                stringBuilder.append("[").append(i + 1).append(": ").append(collection[i]).append("] ");
            }
            return stringBuilder.toString();
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

}
