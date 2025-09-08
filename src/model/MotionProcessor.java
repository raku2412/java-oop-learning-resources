package model;

import util.Console;

public class MotionProcessor implements DataProcessor<Boolean> {
    @Override
    public void process(Boolean value) {
        if (value) {
            Console.println("Motion detected!");
        } else {
            Console.println("No motion detected.");
        }
    }
}
