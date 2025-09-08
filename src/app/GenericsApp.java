package app;

import model.*;
import util.Console;
import util.SensorUtil;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenericsApp {
    public static void main(String[] args) {
        Set<String> sensorIds = new HashSet<>();
        List<Sensor<?>> sensorList = new ArrayList<>();

        Sensor<Double> tempSensor1 = new Sensor<>("temp-01", 22.5);
        Sensor<Boolean> motionSensor1 = new Sensor<>("motion-01", true);
        Sensor<Double> tempSensor2 = new Sensor<>("temp-02", 19.3);
        Sensor<Boolean> motionSensorDuplicate = new Sensor<>("motion-01", false);

        addSensorIfUnique(tempSensor1, sensorList, sensorIds);
        addSensorIfUnique(motionSensor1, sensorList, sensorIds);
        addSensorIfUnique(tempSensor2, sensorList, sensorIds);
        addSensorIfUnique(motionSensorDuplicate, sensorList, sensorIds);

        DataProcessor<Double> tempProcessor = new TemperatureProcessor();
        DataProcessor<Boolean> motionProcessor = new MotionProcessor();

        for (Sensor<?> sensor : sensorList) {
            SensorUtil.logSensorValue(sensor);

            if (sensor.getValue() instanceof Double) {
                tempProcessor.process((Double) sensor.getValue());
            } else if (sensor.getValue() instanceof Boolean) {
                motionProcessor.process((Boolean) sensor.getValue());
            }

            Console.println("");
        }
    }

    private static <T> void addSensorIfUnique(Sensor<T> sensor, List<Sensor<?>> list, Set<String> ids) {
        if (ids.contains(sensor.getId())) {
            Console.println("⚠️ Duplicate sensor ID detected: " + sensor.getId() + " – Skipping.");
        } else {
            list.add(sensor);
            ids.add(sensor.getId());
            System.out.println("✅ Added sensor: " + sensor.getId());
        }
    }
}
