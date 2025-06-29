package model;

import util.SmartHomeIdFactory;

public class SmartBulb {

    private static final int DEFAULT_BRIGHTNESS = 50;
    private static final int MINIMUM_BRIGHTNESS = 0;
    private static final int MAXIMUM_BRIGHTNESS = 100;

    private final int id;
    private String name;
    private int brightness;

    public SmartBulb() {
        this.id = SmartHomeIdFactory.getNextId();
        this.name = "Bulb_" + id;
        this.brightness = DEFAULT_BRIGHTNESS;
    }

    public SmartBulb(String name) {
        this.id = SmartHomeIdFactory.getNextId();
        this.name = name;
        this.brightness = DEFAULT_BRIGHTNESS;
    }

    public SmartBulb(int brightness) {
        this.id = SmartHomeIdFactory.getNextId();
        this.name = "Bulb_" + id;
        setBrightness(brightness);
    }

    public SmartBulb(String name, int brightness) {
        this.id = SmartHomeIdFactory.getNextId();
        this.name = name;
        setBrightness(brightness);
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

    public int getBrightness() {
        return brightness;
    }

    @SuppressWarnings("ManualMinMaxCalculation")
    public void setBrightness(int brightness) {
        if (brightness < MINIMUM_BRIGHTNESS) {
            this.brightness = MINIMUM_BRIGHTNESS;
        } else if (brightness > MAXIMUM_BRIGHTNESS) {
            this.brightness = MAXIMUM_BRIGHTNESS;
        } else {
            this.brightness = brightness;
        }
    }

    public void setBrightness(float brightness) {
        setBrightness(Math.round(brightness));
    }

    @Override
    public String toString() {
        return "model.SmartBulb [id = " + id + ", name = " + name + ", brightness = " + brightness + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        SmartBulb that = (SmartBulb) obj;
        return id == that.id && brightness == that.brightness && name.equals(that.name);
    }

}
