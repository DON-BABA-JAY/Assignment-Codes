  /*
	SOFE 2710 Assignment 2

 */



import java.util.ArrayList;

/**
 *
 * @author Collins Ehirim
 * 22/11/2023
 * Assignment 1
 */
public class Aircraft  {
    enum FlightState{landed, airborne};
    enum MaintenanceState{Working, UnderRepair};
    private String name;            // Aircraft name
    private MaintenanceState state;           //Aircraft state : working/under repair
    private FlightState flightState;     //landed/Airborme
   private ArrayList<Pilots> pilots;      //list of all pilots for the aircraft

  public Aircraft(String name, MaintenanceState state, FlightState flightState, ArrayList<Pilots> pilots) {

      this.name = name;
        this.state = state;
        this.flightState = flightState;
        this.pilots = pilots;
    }

    public String getName() {
        return name;
    }

    public MaintenanceState getState() {
        return state;
    }

    public FlightState getFlightState() {
        return flightState;
    }

    public ArrayList<Pilots> getPilots() {
        return pilots;
    }

    public void joinPilot(Pilots pilot)
    {
        // to add a pilot to an aircraft
        pilots.add(pilot);
    }
    public void printPilot()
    {
        //to print displays list of pilots
        System.out.println("List of pilots: ");
        System.out.println("===============================================");
        for(Pilots list: pilots)
        {
            // variable list to hold pilots Arraylist and for loop to read it
            System.out.println(list);
        }
    }

    @Override
    //to print out the aircraft details
    public String toString() {
        return
                 "\n" +
                 "Aircraft Info: " + " \n" +
                "Name: "  + name + '\n' +
                "State: " + state + '\n' +
                "FlightState: " + flightState + '\n'
                + "==============================================";
    }
}
