package model;

public class SmartBulb extends  SmartHomeDevice {

    private static final int DEFAULT_BRIGHTNESS = 50;
    private static final int MINIMUM_BRIGHTNESS = 0;
    private static final int MAXIMUM_BRIGHTNESS = 100;

    private int brightness;

    public SmartBulb() {
        super(SmartHomeDeviceCategory.LIGHTING);
        this.brightness = DEFAULT_BRIGHTNESS;
    }

    public SmartBulb(String name) {
        super(SmartHomeDeviceCategory.LIGHTING, name);
        this.brightness = DEFAULT_BRIGHTNESS;
    }

    public SmartBulb(int brightness) {
        super(SmartHomeDeviceCategory.LIGHTING);
        setBrightness(brightness);
    }

    public SmartBulb(String name, int brightness) {
        super(SmartHomeDeviceCategory.LIGHTING, name);
        setBrightness(brightness);
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
    public String getDefaultActionByCategory() {
        return "Turn on/off lighting" + " Brightness is " + brightness + "%.";
    }

    @Override
    public String toString() {
        return "model.SmartBulb [id = " + getId() + "category = " + getCategory() + ", name = " + getName() + ", brightness = " + brightness + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        SmartBulb that = (SmartBulb) obj;
        return getId() == that.getId() && brightness == that.brightness && getName().equals(that.getName());
    }

}
