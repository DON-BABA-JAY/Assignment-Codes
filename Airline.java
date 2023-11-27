import java.util.ArrayList;
import java.util.Date;





/**
 *
 * @author Collins Ehirim
 * 22/11/2023
 * Assignment 1
 */

public class Airline {
    private String id;              // airline id
    ArrayList<Flight> flights;      // list of fligths for this airline
    ArrayList<Aircraft> aircraft;   // list of aircraft for this airline

    public Airline(String id, ArrayList<Flight> flights, ArrayList<Aircraft> aircraft) {
        this.id = id;
        this.flights = flights;
        this.aircraft = aircraft;
    }

    public String getId() {
        return id;
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }

    public ArrayList<Aircraft> getAircraft() {
        return aircraft;
    }

    // add  an aircraft to an airline
    // If the aircraft is already owned by the airline then the method does nothing.

    public void owns(Aircraft aircraft){
       if (!this.aircraft.contains(aircraft))
       {
           this.aircraft.add(aircraft);
           System.out.println("You now own this aircraft: " + aircraft);
       }

    }
    //	Write a method in the Airline class called printFlightByName() that displays a list of all flights who are own by the current airline.
    //This method should show all flights information
   public void printFlightByName(){
	   for (Flight f: flights){
		   System.out.println(f);
	   }
   }


   //returns an ArrayList containing all pilots who are working in the with the given code.
     public ArrayList<Pilots> pilotsWorkingForAirlines(Airline airline){
        ArrayList<Pilots> pilotInAirline =  new ArrayList<>();

        for(Aircraft fleet: aircraft)
        {
            ArrayList<Pilots> workingPilots;
            workingPilots = fleet.getPilots();
            pilotInAirline.addAll(workingPilots);
        }
        return pilotInAirline;

     }

     public ArrayList<Flight> getDepartureFlightByAirport(Airport airport, String departTime){
	       ArrayList<Flight> list = new ArrayList<Flight>();
         for (Flight flight : flights) {
             if (flight.getDepartureAirport().equals(airport) && flight.getDepartureTime().equals(departTime)) {
                 list.add(flight);
             }
         }

           return list;

     }

     public ArrayList<Flight> getArrivalFlightByAirport(Airport airport, String arrivalTime){
	       ArrayList<Flight> list = new ArrayList<Flight>();
  	   for (int i=0; i<flights.size();i++){
	    	  if (flights.get(i).arrivalAirport.equals(airport) && (flights.get(i).getArrivalTime().equals(arrivalTime)))
	    		   list.add(flights.get(i));
	       }

         return list;

   }

    @Override
    //to print out the airline details
    public String toString() {
        return "\n=============================================="+ "\n"+
                "Airline Info: " + "\n"+
                "Id: " + id + '\n' +
                aircraft ;
    }
}
