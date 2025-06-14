public class SmartHomeIdFactory {

    private static final int INITIAL_ID = -1;
    private static final int FIRST_ID = 1;
    private static final int LAST_ID = 10_000;

    private static int currentId = INITIAL_ID;

    /* Hint: The synchronized keyword is used to ensure that the method is thread-safe.
             This means that if multiple threads try to access this method at the same time,
             they will be synchronized, and only one thread can execute it at a time.
    */

    public static synchronized int getNumberOfAvailableIds() {
        // TODO: Implement this method
        throw new IllegalStateException("Not implemented yet");
    }

    public static synchronized int getNumberOfAssignedIds() {
        // TODO: Implement this method
        throw new IllegalStateException("Not implemented yet");
    }

    public static synchronized int getNextId() {
        // TODO: Implement this method
        throw new IllegalStateException("Not implemented yet");
    }

}