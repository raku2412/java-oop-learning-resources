public class Location {

    // TODO: Add final variables, constructor and getters as described in the task

    @Override
    public String toString() {
        return "Location{" +
                "ROOM='" + ROOM + '\'' +
                ", STREET='" + STREET + '\'' +
                ", HOUSE_NUMBER='" + HOUSE_NUMBER + '\'' +
                ", CITY='" + CITY + '\'' +
                ", COUNTRY='" + COUNTRY + '\'' +
                '}';
    }

    public Location copy(
            String room,
            String street,
            String houseNumber,
            String city,
            String country
    ) {
        return new Location(
                room != null ? room : this.ROOM,
                street != null ? street : this.STREET,
                houseNumber != null ? houseNumber : this.HOUSE_NUMBER,
                city != null ? city : this.CITY,
                country != null ? country : this.COUNTRY
        );
    }

}