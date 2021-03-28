import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;
    CabinCrew cabinCrew;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;

    @Before
    public void setUp() {
        flight = new Flight(Plane.BOEING747, CabinCrew.CAPTAIN, "SR578", "Glasgow", "GLA", "16:00");
        plane = Plane.BOEING747;
        cabinCrew = CabinCrew.CAPTAIN;
        passenger1 = new Passenger("John");
        passenger2 = new Passenger("Kelly");
        passenger3 = new Passenger("Bob");
        passenger4 = new Passenger("Alice");
    }

    @Test
    public void checkSeatsOnPlane() {
        assertEquals(3, plane.getCapacity());
    }

    @Test
    public void cabinCrewCanRelayMessage () {
        assertEquals("Please fasten seatbelts", cabinCrew.MessageToPassengers());
    }

    @Test
    public void hasTotalWeight() {
        assertEquals(6, plane.getTotalWeight());
    }


    @Test
    public void canCheckInPassengerIfSeatsRemaining () {
        flight.checkInPassenger(passenger1);
        assertEquals(1, flight.passengerListSize());
    }

    @Test
    public void cantCheckInPassengerIfSeatsNotRemaining () {
        flight.checkInPassenger(passenger1);
        flight.checkInPassenger(passenger2);
        flight.checkInPassenger(passenger3);
        flight.checkInPassenger(passenger4);
        assertEquals(3, flight.passengerListSize());
    }


}
