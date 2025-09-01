package test;

import model.SmartLight;

import static test.Assertions.assertFalse;
import static test.Assertions.assertTrue;

public class SmartLightTest {

    @Test
    public void testTurnOn() {
        SmartLight light = new SmartLight();
        light.turnOn();
        assertTrue(light.isOn());
    }

    @Test
    public void testTurnOff() {
        SmartLight light = new SmartLight();
        light.turnOn();
        light.turnOff();
        assertFalse(light.isOn());
    }

}

