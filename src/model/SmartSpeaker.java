package model;

public class SmartSpeaker extends SmartHomeDevice {

    private static final int DEFAULT_VOLUME = 50;
    private static final int MINIMUM_VOLUME = 0;
    private static final int MAXIMUM_VOLUME = 100;

    private int volume;

    public SmartSpeaker() {
        super(SmartHomeDeviceCategory.ENTERTAINMENT);
        this.volume = DEFAULT_VOLUME;
    }

    public SmartSpeaker(String name) {
        super(SmartHomeDeviceCategory.ENTERTAINMENT, name);
        this.volume = DEFAULT_VOLUME;
    }

    public SmartSpeaker(int volume) {
        super(SmartHomeDeviceCategory.ENTERTAINMENT);
        setVolume(volume);
    }

    public SmartSpeaker(String name, int volume) {
        super(SmartHomeDeviceCategory.ENTERTAINMENT, name);
        setVolume(volume);
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
    public String getDefaultActionByCategory() {
        return "Play/pause music or video" + " Current volume is " + volume + ".";
    }

    @Override
    public String toString() {
        return "model.SmartSpeaker [id = " + getId() + "category = " + getCategory() + ", name = " + getName() + ", volume = " + volume + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        SmartSpeaker that = (SmartSpeaker) obj;
        return getId() == that.getId() && volume == that.volume && getName().equals(that.getName());
    }

}