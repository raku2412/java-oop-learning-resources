package app;

import model.*;
import util.Console;
import util.SensorUtil;

public class GenericsApp {

    public static void main(String[] arguments) {
        Sensor<Double> tempSensor = new Sensor<>("temp-01", 22.7);
        DataProcessor<Double> tempProcessor = new TemperatureProcessor();

        Sensor<Boolean> motionSensor = new Sensor<>("motion-01", true);
        DataProcessor<Boolean> motionProcessor = new MotionProcessor();

        SensorUtil.logSensorValue(tempSensor);
        tempProcessor.process(tempSensor.getValue());

        Console.println("");

        SensorUtil.logSensorValue(motionSensor);
        motionProcessor.process(motionSensor.getValue());
    }

}
