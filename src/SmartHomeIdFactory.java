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
        if (currentId == INITIAL_ID) {
            return LAST_ID - FIRST_ID + 1;
        } else {
            return LAST_ID - currentId;
        }
    }

    public static synchronized int getNumberOfAssignedIds() {
        if (currentId == INITIAL_ID) {
            return 0;
        } else {
            return currentId;
        }
    }

    public static synchronized int getNextId() {
        if (currentId > LAST_ID) {
            throw new IllegalStateException("No more IDs available");
        }
        if (currentId == INITIAL_ID) {
            currentId = FIRST_ID;
        } else {
            currentId++;
        }
        return currentId;
    }

}