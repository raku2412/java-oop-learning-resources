package model;

public enum SmartHomeDeviceCategory {
    LIGHTING("Devices related to lighting", 1),
    ENTERTAINMENT("Audio and video entertainment devices"),
    SECURITY("Security-related devices", 2),
    CLIMATE_CONTROL("Heating and cooling devices", 3),
    UTILITY("Miscellaneous utility devices");

    private final String description;
    private final Integer priority;

    SmartHomeDeviceCategory(String description, int priority) {
        this.description = description;
        this.priority = priority;
    }

    SmartHomeDeviceCategory(String description) {
        this.description = description;
        this.priority = null;
    }

    public String getDescription() {
        return description;
    }

    public Integer getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return String.format("%s - %s (Priority: %s)", name(), description, priority != null ? priority : "N/A");
    }

}
