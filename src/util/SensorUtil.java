package util;

import model.Sensor;

public class SensorUtil {
    public static <T> void logSensorValue(Sensor<T> sensor) {
        Console.println("Log: " + sensor);
    }
}
