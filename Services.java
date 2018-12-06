    
/**
 * class Services - write a description of the class here
 *
 * @author (Rory Ward)
 * @version (12/11/2018)
 */
public abstract class Services      //Abstract class as I don't want other companies to be created but I want methods and variables to be inherited
{
    
    protected int AvailableSeats;
    protected String startingLocation;
    protected String destination;
    protected String dateOfDeparture;
    protected String timeOfDeparture;
    protected String dateOfArrival;
    protected String timeOfArrival;
    protected double price;
    protected String headers ="\t" +"Starting Location" + "\t" + "Destination" + "\t" + "Date Of Departure" + "\t" + "Time Of Departure" + "\t" + "\t" + "Date Of Arrival" + "\t" + "\t" + "Time Of Arrival" + "\t"+"\t" + "Price";
    protected String timetable;
    protected int noOfPassengers;
    protected  double fare;

    public String getStartingLocation() {       //various getter methods that could be required
        return startingLocation;
    }
    public String getDestination() {
        return destination;
    }
    public String getDateOfDeparture() {
        return dateOfDeparture;
    }
    public String getTimeOfDeparture() {
        return timeOfDeparture;
    }
    public String getDateOfArrival() {
        return dateOfArrival;
    }
    public String getTimeOfArrival() {
        return timeOfArrival;
    }
    public double getPrice() {
        return price;
    }
    public String createTimetable(){
        timetable = "\t"+ "\t" +startingLocation + "\t" + "\t"+  destination + "\t"+ "\t" + dateOfDeparture + "\t"+ "\t"+ "\t"  + timeOfDeparture +"\t"+ "\t"+ "\t" + "\t"+ dateOfArrival +"\t"+ "\t"+ "\t" + timeOfArrival +"\t"+ "\t"+ "\t" + price ;
        return timetable;
    }

}