public class Pilot {

    private String name;
    private String rank;
    private String pilotLicenceNo;

    public Pilot (String name, String rank, String pilotLicenceNo) {
        this.name = name;
        this.rank = rank;
        this.pilotLicenceNo = pilotLicenceNo;
    }

    public String canFlyPlane() {
        return "Ready to Fly";
    }

}
