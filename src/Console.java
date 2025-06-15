/**
 * Console utility class for reading input and printing output.
 */
public class Console {

    /**
     * Prints a message to the console without a newline.
     *
     * @param message The message to print.
     */
    public static void print(String message) {
        System.out.println(message);
    }

    /**
     * Prints a message to the console with a newline.
     *
     * @param message The message to print.
     */
    public static void println(String message) {
        System.out.println(message);
    }

    /**
     * Reads a string input from the console.
     *
     * @param prompt The prompt message to display before reading input.
     * @return The string input read from the console.
     */
    public static String readString(String prompt) {
        print(prompt + ": ");
        try {
            return new java.util.Scanner(System.in).nextLine();
        } catch (Exception e) {
            println("Error reading input: " + e.getMessage());
            System.exit(1);
            return null;
        }
    }

    /**
     * Reads a choice from the console, ensuring it matches one of the provided options.
     *
     * @param prompt  The prompt message to display before reading input.
     * @param options The array of valid options.
     * @return The valid choice made by the user.
     */
    public static String readChoice(String prompt, String[] options) {
        print(prompt + " (" + String.join(", ", options) + "): ");
        String choice = readString(prompt);
        for (String option : options) {
            if (option.equalsIgnoreCase(choice)) {
                return option;
            }
        }
        println("Invalid choice. Please try again.");
        return readChoice(prompt, options);
    }

    /**
     * Reads an integer input from the console.
     *
     * @param prompt The prompt message to display before reading input.
     * @return The integer input read from the console.
     */
    public static int readInt(String prompt) {
        while (true) {
            String input = readString(prompt);
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                println("Invalid number. Please enter a valid integer.");
            }
        }
    }

    /**
     * Reads an integer input from the console within a specified range.
     *
     * @param prompt The prompt message to display before reading input.
     * @param min    The minimum valid value (inclusive).
     * @param max    The maximum valid value (inclusive).
     * @return The integer input read from the console within the specified range.
     */
    public static int readInt(String prompt, int min, int max) {
        while (true) {
            int value = readInt(prompt);
            if (value < min || value > max) {
                println("Value must be between " + min + " and " + max + ". Please try again.");
            } else {
                return value;
            }
        }
    }

    /**
     * Reads a long input from the console.
     *
     * @param prompt The prompt message to display before reading input.
     * @return The long input read from the console.
     */
    public static long readLong(String prompt) {
        while (true) {
            String input = readString(prompt);
            try {
                return Long.parseLong(input);
            } catch (NumberFormatException e) {
                println("Invalid number. Please enter a valid long integer.");
            }
        }
    }

    /**
     * Reads a float input from the console.
     *
     * @param prompt The prompt message to display before reading input.
     * @return The float input read from the console.
     */
    public static float readFloat(String prompt) {
        while (true) {
            String input = readString(prompt);
            try {
                return Float.parseFloat(input);
            } catch (NumberFormatException e) {
                println("Invalid number. Please enter a valid float.");
            }
        }
    }

    /**
     * Reads a double input from the console.
     *
     * @param prompt The prompt message to display before reading input.
     * @return The double input read from the console.
     */
    public static double readDouble(String prompt) {
        while (true) {
            String input = readString(prompt);
            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                println("Invalid number. Please enter a valid double.");
            }
        }
    }

    /**
     * Reads a short input from the console.
     *
     * @param prompt The prompt message to display before reading input.
     * @return The short input read from the console.
     */
    public static short readShort(String prompt) {
        while (true) {
            String input = readString(prompt);
            try {
                return Short.parseShort(input);
            } catch (NumberFormatException e) {
                println("Invalid number. Please enter a valid short integer.");
            }
        }
    }

    /**
     * Reads a yes or no input from the console.
     *
     * @param prompt The prompt message to display before reading input.
     * @return true if the user inputs "yes" or "y", false if the user inputs "no" or "n".
     */
    public static boolean readYesOrNo(String prompt) {
        String input = readString(prompt + " (yes/no)");
        if (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y")) {
            return true;
        } else if (input.equalsIgnoreCase("no") || input.equalsIgnoreCase("n")) {
            return false;
        } else {
            println("Invalid input. Please enter 'yes'/'y' or 'no'/'n'.");
            return readYesOrNo(prompt);
        }
    }

    /**
     * Reads a boolean input from the console.
     *
     * @param prompt The prompt message to display before reading input.
     * @return true if the user inputs "true", false if the user inputs "false".
     */
    public static boolean readBoolean(String prompt) {
        String input = readString(prompt + " (true/false)");
        if (input.equalsIgnoreCase("true")) {
            return true;
        } else if (input.equalsIgnoreCase("false")) {
            return false;
        } else {
            println("Invalid input. Please enter 'true' or 'false'.");
            return readBoolean(prompt);
        }
    }

}
