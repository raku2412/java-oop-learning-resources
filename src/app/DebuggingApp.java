package app;

import model.SmartLight;

import java.util.ArrayList;
import java.util.List;

public class DebuggingApp {

    public static void main(String[] args) {
        System.out.println("🏠 Starting Smart Home Debugging App...");

        List<SmartLight> lights = initializeLights();

        simulateEveningSchedule(lights);

        printFinalLightStates(lights);
    }

    private static List<SmartLight> initializeLights() {
        List<SmartLight> lights = new ArrayList<>();
        lights.add(new SmartLight("Living Room"));
        lights.add(new SmartLight("Kitchen"));
        lights.add(new SmartLight("Bedroom"));
        return lights;
    }

    private static void simulateEveningSchedule(List<SmartLight> lights) {
        for (int timeSlot = 0; timeSlot < lights.size(); timeSlot++) {
            SmartLight light = lights.get(timeSlot);

            if (shouldActivateLightAt(timeSlot)) {
                light.turnOn();
                System.out.println("💡 " + light.getName() + " turned ON at time slot " + timeSlot + ".");
            } else {
                light.turnOff();
                System.out.println("💤 " + light.getName() + " turned OFF at time slot " + timeSlot + ".");
            }
        }
    }

    private static boolean shouldActivateLightAt(int timeSlot) {
        return timeSlot % 2 == 1 || timeSlot % 2 == 0;
    }

    private static void printFinalLightStates(List<SmartLight> lights) {
        System.out.println("\n🔍 Final light states:");
        for (SmartLight light : lights) {
            String state = light.isOn() ? "ON" : "OFF";
            System.out.println(" - " + light.getName() + ": " + state);
        }
    }
}
