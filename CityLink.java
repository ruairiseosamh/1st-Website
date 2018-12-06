
/**
 * Write a description of class CityLink here.
 *
 * @author (Rory Ward)
 * @version (12/11/2018)
 */
public class CityLink extends Services implements Order     //inherits from services and implements the interface
{


    /**
     * Constructor for objects of class CityLink
     */
    public CityLink()
    {
        super();        //calls the services' constructor
    }

    @Override       //overriding the interface method to pass the buseireann details to the test class
    public void getAllAvailableTrips()
    {  

    }
    @Override       //overriding the interface method to take in the order details
    public void bookingTrips(int noOfPassengers, String startingLocation, String destination, String dateOfDeparture, String timeOfDeparture, String dateOfArrival, String timeOfArrival, double fare)
    {
        this.noOfPassengers = noOfPassengers;
        this.startingLocation = startingLocation;
        this.destination = destination;
        this.dateOfDeparture = dateOfDeparture;
        this.timeOfDeparture = timeOfDeparture;
        this.dateOfArrival = dateOfArrival;
        this.timeOfArrival = timeOfArrival;
        this.fare = fare;
    }
}

