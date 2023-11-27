 /*
	SOFE 2710 Assignment 2

 */



import java.util.ArrayList;
import java.util.*;
import java.text.*;


/**
 *
 * @author Collins Ehirim
 * 22/11/2023
 * Assignment 1
 */



public class AirportTest {



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws ParseException {
        // TODO code application logic here

	   //instantiate objects from Airport class
       Airport pearson = new Airport("Toronto","Canada","YYZ");
	   Airport montreal = new Airport("Montreal","Canada","YUL");
	   Airport ottawa = new Airport("Ottawa","Canada","YOW");

	   //instantiate objects from Pilots class
	   Pilots johnSmith = new Pilots ("John Smith",540,"Captain");
	   Pilots SarahEric = new Pilots ("Sarah Eric",651,"C`oPilot");
	   Pilots monnaKam = new Pilots ("Monna Kam",785,"navigator");



      //instantiate objects from Aircraft class
		ArrayList<Pilots> pilots = new ArrayList<Pilots>();
		pilots.add(johnSmith);
		pilots.add(SarahEric);
		pilots.add(monnaKam);
		ArrayList<Pilots> pilots1 = new ArrayList<Pilots>();
		pilots1.add(johnSmith);
		Aircraft boeing787 = new Aircraft("boeing787", Aircraft.MaintenanceState.Working, Aircraft.FlightState.landed,pilots);
		Aircraft boeing777 = new Aircraft("boeing777", Aircraft.MaintenanceState.UnderRepair, Aircraft.FlightState.airborne,pilots1);
		//System.out.println(boeing787);
		//System.out.println(monnaKam.isPilotForFlight(boeing787));


		//boeing787.joinPilot(johnSmith);
		//boeing787.printPilot();
		//System.out.println(boeing787);


	//instantiate objects from Flight class
	 SimpleDateFormat dateformat = new SimpleDateFormat("MM/dd/yyyy HH:mm");
	 Date departureTime = dateformat.parse("07/17/2018 03:19");
     Date arrivalTime = dateformat.parse("07/20/2018 04:50");
     Flight ac472 = new Flight("AC472",departureTime,arrivalTime,pearson,ottawa,boeing787);

		System.out.println();
		//System.out.println(ac472);

	//instantiate objects from Airline class
    ArrayList<Flight> flights= new ArrayList<Flight>();
	flights.add(ac472);
	ArrayList<Aircraft> aircrafts= new  ArrayList<Aircraft>();
	aircrafts.add(boeing787);
	Airline airCanad = new Airline("Air Canada",flights,aircrafts);
		System.out.println();
		System.out.println(airCanad);
		//airCanad.owns(boeing777);
		//airCanad.printFlightByName();
		//System.out.println(airCanad);
		//System.out.println(airCanad.pilotsWorkingForAirlines(airCanad));
		//System.out.println(airCanad.getDepartureFlightByAirport(ottawa, String.valueOf(departureTime)));
		//System.out.println(ac472);

  }

}
