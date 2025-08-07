package app;

import model.ExampleProgram;
import model.Programmable;
import util.Console;

public class InterfaceApp {

    public static void main(String[] arguments) {

        // TODO: Remove after testing the example.
        showExample();

        // TODO: Implement according to the readme.

    }

    private static void showExample() {
        Programmable exampleProgram = new ExampleProgram();
        exampleProgram.setProgram("Morning Routine", "Wake up, brush teeth, have breakfast");

        if (exampleProgram.hasProgram("Morning Routine")) {
            Console.println("Program found: " + exampleProgram.getProgram("Morning Routine"));
        } else {
            Console.println("No such program.");
        }

        exampleProgram.removeProgram("Morning Routine");

        if (!exampleProgram.hasProgram("Morning Routine")) {
            Console.println("Program removed successfully.");
        }
    }

}
