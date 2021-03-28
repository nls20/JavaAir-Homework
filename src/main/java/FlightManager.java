import java.util.ArrayList;

public class FlightManager {

    private String name;
    private Plane plane;
    private Flight flight;
    private Passenger passenger;
    private Pilot pilot;
    private CabinCrew cabinCrew;

    public FlightManager(String name, Plane plane) {
        this.name = name;
        this.plane = plane;
    }

    public int checkBaggageAllowanceForPassengers(Plane plane) {
        int baggageWeightForPassengers = plane.getTotalWeight() / 2;
        return baggageWeightForPassengers;
    }

    public double checkBaggageAllowancePerPassenger(Plane plane) {
        double passengerBagLimit = plane.getCapacity() / checkBaggageAllowanceForPassengers(plane);
        return passengerBagLimit;
    }

    public int checkIfRoomToBookInBag() {
        int totalBaggageBooked = 0;
        if (checkBaggageAllowancePerPassenger(plane) < checkBaggageAllowanceForPassengers(plane)) {

        }
        return totalBaggageBooked += 1;
    }

    public double checkForBagWeightOnPlane(Plane plane, ArrayList<Passenger> passengers) {
        return flight.passengerListSize() * checkBaggageAllowancePerPassenger(plane);
    }
}

//    public int addBagPerPassenger(Plane plane, ArrayList<Passenger> passengers) {
//        int totalBaggageBooked = 0;
//        if (checkBaggageAllowancePerPassenger(plane) < checkBaggageAllowanceForPassengers(plane)){
//            for (Passenger passenger : passengers) {
//            return totalBaggageBooked += 1;
//    }




