package model;

import util.Console;

public class SmartSpeaker implements SmartDevice {
    private boolean isOn = false;

    @Override
    public void turnOn() {
        isOn = true;
        Console.println("SmartSpeaker turned on.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        Console.println("SmartSpeaker turned off.");
    }

    @Override
    public boolean isOn() {
        return isOn;
    }

    public void playMusic(String song) {
        if (isOn) {
            Console.println("Playing music: " + song);
        } else {
            Console.println("Cannot play music. Speaker is off.");
        }
    }
}

