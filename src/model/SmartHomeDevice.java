package model;

import util.SmartHomeIdFactory;

public abstract class SmartHomeDevice {

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

    public abstract String getDefaultActionByCategory();

}
