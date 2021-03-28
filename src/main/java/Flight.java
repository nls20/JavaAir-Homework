import java.util.ArrayList;

public class Flight {

    private Plane plane;
    private CabinCrew cabinCrew;
    private ArrayList<Pilot> pilots;
    private ArrayList<Passenger> passengers;
    private String flightNumber;
    private String destination;
    private String destinationAirport;
    private String departureTime;

    public Flight (Plane plane, CabinCrew cabinCrew, String flightNumber, String destination, String destinationAirport, String departureTime) {
        this.passengers = new ArrayList<Passenger>();
        this.pilots = new ArrayList<Pilot>();
        this.plane = plane;
        this.cabinCrew = cabinCrew;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.destinationAirport = destinationAirport;
        this.departureTime = departureTime;
    }

    public ArrayList getPilot() {
        return this.pilots;
    }

    public int passengerListSize() {
        return this.passengers.size();
    }

    public int seatsOnPlane (Plane plane) {
        return plane.getCapacity();
    }

    public void checkInPassenger (Passenger passenger) {
        if (this.passengerListSize() < plane.getCapacity()) {
            this.passengers.add(passenger);
        }
    }



}
