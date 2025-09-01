package model;

import util.Console;

public class TemperatureProcessor implements DataProcessor<Double> {
    @Override
    public void process(Double value) {
        Console.println("Processing temperature: " + value + "°C");
    }
}
