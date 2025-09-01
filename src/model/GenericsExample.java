package model;

import util.Console;

interface Storage<T> {
    void store(T item);
    T retrieve();
}

class StorageBox<T> implements Storage<T> {
    private T content;

    @Override
    public void store(T item) {
        this.content = item;
    }

    @Override
    public T retrieve() {
        return content;
    }
}

class Light {
    private String location;

    public Light(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Light in " + location;
    }
}

class DoorLock {
    private boolean locked;

    public DoorLock(boolean locked) {
        this.locked = locked;
    }

    @Override
    public String toString() {
        return "Door is " + (locked ? "locked" : "unlocked");
    }
}

class Util {
    public static <T> void printContent(Storage<T> storage) {
        T item = storage.retrieve();
        Console.println("Storage contains " + item);
    }
}

public class GenericsExample {
    public static void show() {
        Storage<Light> lightStorage = new StorageBox<>();
        lightStorage.store(new Light("Living Room"));

        Storage<DoorLock> lockStorage = new StorageBox<>();
        lockStorage.store(new DoorLock(true));

        Util.printContent(lightStorage);
        Util.printContent(lockStorage);
    }
}
