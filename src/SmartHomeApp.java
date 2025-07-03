public class SmartHomeApp {

    @SuppressWarnings("UnnecessaryToStringCall")
    public static void main(String[] arguments) {
        Location manufacturerLocation = new Location(null, "Beijing Road", "123", "Shanghai", "China");
        Location installationLocation = new Location(null, "Main Street", "123", "Berlin", "Germany");
        printIdCount();
        SmartSpeaker smartSpeaker1 = new SmartSpeaker(
                "Living Room Speaker",
                100,
                manufacturerLocation,
                installationLocation.copy(
                        "Living Room",
                        null,
                        null,
                        null,
                        null
                )
        );
        System.out.println(smartSpeaker1.toString());
        printIdCount();
        SmartSpeaker smartSpeaker2 = new SmartSpeaker(
                "Kitchen Speaker",
                75,
                manufacturerLocation,
                installationLocation.copy(
                        "Kitchen",
                        null,
                        null,
                        null,
                        null
                )
        );
        System.out.println(smartSpeaker2.toString());
        printIdCount();
    }

    private static void printIdCount() {
        System.out.println("The current count of available smart home ids is: " + SmartSpeaker.SmartHomeIdFactory.getNumberOfAvailableIds());
        System.out.println("The current count of assigned smart home ids is: " + SmartSpeaker.SmartHomeIdFactory.getNumberOfAssignedIds());
    }

}
