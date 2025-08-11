package model;

import util.Console;

public class SmartLamp implements SmartDevice {
    private boolean isOn = false;
    private int brightness = 0;

    @Override
    public void turnOn() {
        isOn = true;
        Console.println("SmartLamp turned on.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        Console.println("SmartLamp turned off.");
    }

    @Override
    public boolean isOn() {
        return isOn;
    }

    public void setBrightness(int level) {
        brightness = level;
        Console.println("Brightness set to " + level + "%.");
    }
}

