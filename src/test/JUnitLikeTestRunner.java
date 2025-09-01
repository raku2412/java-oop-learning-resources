package test;

import util.Console;

import java.lang.reflect.Method;

public class JUnitLikeTestRunner {

    public static void runTests(Class<?> testClass) {
        Object testInstance;
        try {
            testInstance = testClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            Console.println("Cannot instantiate test class: " + e);
            return;
        }

        Method[] methods = testClass.getDeclaredMethods();
        int passed = 0;
        int failed = 0;

        for (Method method : methods) {
            if (method.isAnnotationPresent(Test.class)) {
                try {
                    method.invoke(testInstance);
                    Console.println(method.getName() + " ... PASSED");
                    passed++;
                } catch (Exception e) {
                    Console.println(method.getName() + " ... FAILED");
                    Console.println("  Reason: " + e.getCause());
                    failed++;
                }
            }
        }

        Console.println("");
        Console.println("Tests completed: " + (passed + failed) + ", Passed: " + passed + ", Failed: " + failed);
    }
}

