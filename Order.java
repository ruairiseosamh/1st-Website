
/**
 * Write a description of interface Order here.
 *
 * @author (Rory Ward)
 * @version (12/11/2018)
 */
public interface Order  //interface with the two main methods signatures in it
{
    void getAllAvailableTrips();
    
    void bookingTrips(int noOfPassengers, String startingLocation, String destination, String dateOfDeparture, String timeOfDeparture, String dateOfArrival, String timeOfArrival, double fare);
}


