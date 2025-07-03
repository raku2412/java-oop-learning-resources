public class Location {

    private final String ROOM;
    private final String STREET;
    private final String HOUSE_NUMBER;
    private final String CITY;
    private final String COUNTRY;

    public Location(
            String room,
            String street,
            String houseNumber,
            String city,
            String country
    ) {
        this.ROOM = room;
        this.STREET = street;
        this.HOUSE_NUMBER = houseNumber;
        this.CITY = city;
        this.COUNTRY = country;
    }

    public String getRoom() {
        return ROOM;
    }

    public String getStreet() {
        return STREET;
    }

    public String getHouseNumber() {
        return HOUSE_NUMBER;
    }

    public String getCity() {
        return CITY;
    }

    public String getCountry() {
        return COUNTRY;
    }

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