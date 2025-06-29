package model;

import util.SmartHomeIdFactory;

public class SmartSpeaker {

    private static final int DEFAULT_VOLUME = 50;
    private static final int MINIMUM_VOLUME = 0;
    private static final int MAXIMUM_VOLUME = 100;

    private final int id;
    private String name;
    private int volume;

    public SmartSpeaker() {
        this.id = SmartHomeIdFactory.getNextId();
        this.name = "Speaker_" + id;
        this.volume = DEFAULT_VOLUME;
    }

    public SmartSpeaker(String name) {
        this.id = SmartHomeIdFactory.getNextId();
        this.name = name;
        this.volume = DEFAULT_VOLUME;
    }

    public SmartSpeaker(int volume) {
        this.id = SmartHomeIdFactory.getNextId();
        this.name = "Speaker_" + id;
        setVolume(volume);
    }

    public SmartSpeaker(String name, int volume) {
        this.id = SmartHomeIdFactory.getNextId();
        this.name = name;
        setVolume(volume);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    @SuppressWarnings("ManualMinMaxCalculation")
    public void setVolume(int volume) {
        if (volume < MINIMUM_VOLUME) {
            this.volume = MINIMUM_VOLUME;
        } else if (volume > MAXIMUM_VOLUME) {
            this.volume = MAXIMUM_VOLUME;
        } else {
            this.volume = volume;
        }
    }

    public void setVolume(float volume) {
        setVolume(Math.round(volume));
    }

    @Override
    public String toString() {
        return "model.SmartSpeaker [id = " + id + ", name = " + name + ", volume = " + volume + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        SmartSpeaker that = (SmartSpeaker) obj;
        return id == that.id && volume == that.volume && name.equals(that.name);
    }

}