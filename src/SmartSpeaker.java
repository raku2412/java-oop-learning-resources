public class SmartSpeaker {

    private static final int DEFAULT_VOLUME = 50;
    private static final int MINIMUM_VOLUME = 0;
    private static final int MAXIMUM_VOLUME = 100;

    private final int id;
    private final Location manufacturerLocation;
    private Location installationLocation;
    private String name;
    private int volume;

    public static class SmartHomeIdFactory {

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

    public SmartSpeaker() {
        this.id = SmartHomeIdFactory.getNextId();
        this.name = "Speaker_" + id;
        this.volume = DEFAULT_VOLUME;
        this.manufacturerLocation = null;
        this.installationLocation = null;
    }

    public SmartSpeaker(String name) {
        this.id = SmartHomeIdFactory.getNextId();
        this.name = name;
        this.volume = DEFAULT_VOLUME;
        this.manufacturerLocation = null;
        this.installationLocation = null;
    }

    public SmartSpeaker(int volume) {
        this.id = SmartHomeIdFactory.getNextId();
        this.name = "Speaker_" + id;
        setVolume(volume);
        this.manufacturerLocation = null;
        this.installationLocation = null;
    }

    public SmartSpeaker(Location manufacturerLocation, Location installationLocation) {
        this.id = SmartHomeIdFactory.getNextId();
        this.manufacturerLocation = manufacturerLocation;
        this.installationLocation = installationLocation;
        this.name = "Speaker_" + id;
        this.volume = DEFAULT_VOLUME;
    }

    public SmartSpeaker(String name, int volume, Location manufacturerLocation, Location installationLocation) {
        this.id = SmartHomeIdFactory.getNextId();
        this.name = name;
        this.manufacturerLocation = manufacturerLocation;
        this.installationLocation = installationLocation;
        setVolume(volume);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    @SuppressWarnings("ManualMinMaxCalculation")
    public void setVolume(int volume) {
        if (volume < MINIMUM_VOLUME) {
            this.volume = MINIMUM_VOLUME;
        } else if (volume > MAXIMUM_VOLUME) {
            this.volume = MAXIMUM_VOLUME;
        } else {
            this.volume = volume;
        }
    }

    public void setVolume(float volume) {
        setVolume(Math.round(volume));
    }

    public Location getManufacturerLocation() {
        return manufacturerLocation;
    }

    public Location getInstallationLocation() {
        return installationLocation;
    }

    public void setInstallationLocation(Location installationLocation) {
        this.installationLocation = installationLocation;
    }

    @Override
    public String toString() {
        return "SmartSpeaker [id = " + id + ", name = " + name + ", volume = " + volume +
                ", manufacturerLocation = " + (manufacturerLocation != null ? manufacturerLocation.toString() : "null") +
                ", installationLocation = " + (installationLocation != null ? installationLocation.toString() : "null") + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        SmartSpeaker that = (SmartSpeaker) obj;
        return id == that.id && volume == that.volume && name.equals(that.name);
    }

}