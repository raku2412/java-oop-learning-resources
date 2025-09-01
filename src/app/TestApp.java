package app;

import test.JUnitLikeTestRunner;
import test.SmartLightTest;

public class TestApp {

    public static void main(String[] arguments) {
        JUnitLikeTestRunner.runTests(SmartLightTest.class);
    }

}
