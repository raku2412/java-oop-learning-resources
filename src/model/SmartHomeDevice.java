package model;

import util.SmartHomeIdFactory;

public class SmartHomeDevice {

    private final int id;
    private final SmartHomeDeviceCategory category;
    private String name;

    public SmartHomeDevice(SmartHomeDeviceCategory category, String name) {
        this.id = SmartHomeIdFactory.getNextId();
        this.category = category;
        this.name = name != null ? name : "Device_" + id;
    }

    public SmartHomeDevice(SmartHomeDeviceCategory category) {
        this(category, null);
    }

    public int getId() {
        return id;
    }

    public SmartHomeDeviceCategory getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @SuppressWarnings("EnhancedSwitchMigration")
    public String getDefaultActionByCategory() {
        switch (category) {
            case LIGHTING:
                return "Turn on/off lighting";
            case ENTERTAINMENT:
                return "Play/pause music or video";
            case SECURITY:
                return "Arm/disarm security system";
            case CLIMATE_CONTROL:
                return "Adjust temperature settings";
            case UTILITY:
                return "Manage utility settings";
        }
        return "No default action defined for this category";
    }

}
