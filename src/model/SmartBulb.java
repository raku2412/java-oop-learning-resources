package model;

import util.SmartHomeIdFactory;

import java.time.LocalDateTime;

public class SmartBulb {

    private static final int DEFAULT_BRIGHTNESS = 50;
    private static final int MINIMUM_BRIGHTNESS = 0;
    private static final int MAXIMUM_BRIGHTNESS = 100;

    private final int id;
    private final Location manufacturerLocation;
    private Location installationLocation;
    private String name;
    private int brightness;

    public SmartBulb() {
        this.id = SmartHomeIdFactory.getNextId();
        this.name = "Bulb_" + id;
        this.brightness = DEFAULT_BRIGHTNESS;
        this.manufacturerLocation = null;
        this.installationLocation = null;
    }

    public SmartBulb(String name) {
        this.id = SmartHomeIdFactory.getNextId();
        this.name = name;
        this.brightness = DEFAULT_BRIGHTNESS;
        this.manufacturerLocation = null;
        this.installationLocation = null;
    }

    public SmartBulb(int brightness) {
        this.id = SmartHomeIdFactory.getNextId();
        this.name = "Bulb_" + id;
        setBrightness(brightness);
        this.manufacturerLocation = null;
        this.installationLocation = null;
    }

    public SmartBulb(Location manufacturerLocation, Location installationLocation) {
        this.id = SmartHomeIdFactory.getNextId();
        this.manufacturerLocation = manufacturerLocation;
        this.installationLocation = installationLocation;
        this.name = "Bulb_" + id;
        this.brightness = DEFAULT_BRIGHTNESS;
    }

    public SmartBulb(String name, int brightness, Location manufacturerLocation, Location installationLocation) {
        this.id = SmartHomeIdFactory.getNextId();
        this.name = name;
        this.manufacturerLocation = manufacturerLocation;
        this.installationLocation = installationLocation;
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

    public Location getManufacturerLocation() {
        return manufacturerLocation;
    }

    public Location getInstallationLocation() {
        return installationLocation;
    }

    public void setInstallationLocation(Location installationLocation) {
        this.installationLocation = installationLocation;
    }

    public void turnOffTimed(int seconds) {
        System.out.println(name + " will turn off in " + seconds + " seconds.");
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Sleep interrupted, turning off immediately.");
        }
        setBrightness(0);
        System.out.println(name + " turned off timed.");
    }

    public void turnOffAt(LocalDateTime dateTime) {
        LocalDateTime now = LocalDateTime.now();
        long secondsUntilOff = java.time.Duration.between(now, dateTime).getSeconds();
        if (secondsUntilOff > 0) {
            System.out.println(name + " will turn off at " + dateTime + ".");
            try {
                Thread.sleep(secondsUntilOff * 1000L);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Sleep interrupted, turning off immediately.");
            }
            setBrightness(0);
            System.out.println(name + " turned off at " + dateTime + ".");
        } else {
            System.out.println("The specified time is in the past. Cannot turn off.");
        }
    }

    @Override
    public String toString() {
        return "model.SmartBulb [id = " + id + ", name = " + name + ", brightness = " + brightness +
                ", manufacturerLocation = " + (manufacturerLocation != null ? manufacturerLocation.toString() : "null") +
                ", installationLocation = " + (installationLocation != null ? installationLocation.toString() : "null") + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        SmartBulb that = (SmartBulb) obj;
        return id == that.id && brightness == that.brightness && name.equals(that.name);
    }

}
