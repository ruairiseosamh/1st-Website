
/**
 * Write a description of class Test here.
 *
 * @author (Rory Ward)
 * @version (12/11/2018)
 */
public class Test
{ 
    private String timetable;                   //declare variables
    
 public static void main(String[] args)
 {
       
       Test test1 = new Test();                 //main running file creates objects and runs methods
       GoBus order1 = new GoBus();
       BusEireann order2 = new BusEireann();
       CityLink order3 = new CityLink();
       test1.getAllAvailableTrips();
       order1.bookingTrips(1, "", "", "", "", "", "", 1);   //creates bookings 
       order2.bookingTrips(2, "", "", "", "", "", "", 2);   // 
       order3.bookingTrips(3, "", "", "", "", "", "", 3);   //
 }
 
 public void getAllAvailableTrips(){                        // method to display timetables
       GoBus gobusService = new GoBus();                    
       BusEireann busEireannService = new BusEireann();
       CityLink cityLinkService = new CityLink();
       
       gobusService.printHeaders();
       gobusService.getAllAvailableTrips();
       System.out.println("Gobus");
       timetable = gobusService.createTimetable();
       System.out.println(timetable);
       System.out.println("\n");

       busEireannService.getAllAvailableTrips();
       System.out.println("BusEireann");
       timetable = busEireannService.createTimetable();
       System.out.println(timetable);
       System.out.println("\n");
       
       cityLinkService.getAllAvailableTrips();
       System.out.println("Citylink");
       timetable = cityLinkService.createTimetable();
       System.out.println(timetable);
       System.out.println("\n");
       System.out.println("The reason all these values are null and 0.0 is that the data to fill them isn't important according to the assignment.");
       
                  
 }
 
}
