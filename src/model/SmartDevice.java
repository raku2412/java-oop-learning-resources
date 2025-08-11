package model;

public interface SmartDevice extends Controllable {
    void turnOn();
    void turnOff();
    boolean isOn();

    default void togglePower() {
        if (isOn()) {
            turnOff();
        } else {
            turnOn();
        }
    }
}
