public enum CabinCrew {

    FLIGHTATTENDANT ("Bobby"),
    FIRSTOFFICER ("Janet"),
    CAPTAIN ("Ali");

    private String name;

    CabinCrew (String name) {
        this.name = name;
    }

    public String MessageToPassengers () {
        return "Please fasten seatbelts";
    }
}
