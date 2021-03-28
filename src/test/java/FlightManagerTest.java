import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    Flight flight;
    Plane plane;
    Plane plane2;
    Passenger passenger;
    Passenger passenger1;
    Passenger passenger2;
    FlightManager flightManager;

    @Before
    public void setUp() {
        plane = Plane.BOEING747;
        plane2 = Plane.AIRBUS320;
        passenger1 = new Passenger("John");
        passenger2 = new Passenger("Kelly");
        flight = new Flight(Plane.AIRBUS320, CabinCrew.FIRSTOFFICER, "HGD54", "Montreal", "MON", "16:00");
        flightManager = new FlightManager("bob", Plane.CONCORDE20);
    }

    @Test
    public void canCheckAllowanceForPassengersBags() {
        assertEquals(100, flightManager.checkBaggageAllowanceForPassengers(plane2));
    }

    @Test
    public void canCheckAllowancePerPassenger() {
        assertEquals(1, flightManager.checkBaggageAllowancePerPassenger(plane), 0.0);
    }

//    @Test
//    public void canCheckWeightOfBags() {
//        ArrayList<Passenger> passengers = new ArrayList<>();
//        flight.checkInPassenger(passenger1);
//        flight.checkInPassenger(passenger2);
//        System.out.println(flight.passengerListSize());
//        flightManager.checkBaggageAllowancePerPassenger(plane);
//        System.out.println(flightManager.checkBaggageAllowancePerPassenger(plane));
//        assertEquals(2, flightManager.checkForBagWeightOnPlane(plane, passengers), 0.0);
//
//    }

//    @Test
//    public void canCheckIfBaggageAdded() {
//        ArrayList<Passenger> passengers =  new ArrayList<>();
//        assertEquals(1, flightManager.addBagPerPassenger(passengers, plane));
//    }


//    @Test
//    public void canPassengerCheckInBagIfRoom () {
//        flightManager.checkBaggageAllowanceForPassengers(plane);
//        flightManager.checkBaggageAllowancePerPassenger(plane);
//        assertEquals(1, flightManager.checkIfRoomToBookInBag());
//    }
}
