package test;

public class Assertions {

    public static void assertTrue(boolean condition) {
        if (!condition) {
            throw new AssertionError("Assertion failed: Expected condition to be true, but was false.");
        }
    }

    public static void assertFalse(boolean condition) {
        if (condition) {
            throw new AssertionError("Assertion failed: Expected condition to be false, but was true.");
        }
    }

}

