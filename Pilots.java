import java.util.ArrayList;
/**
 *
 * @author Collins Ehirim
 * 22/11/2023
 * Assignment 1
 */
public class Pilots{

	private String pilotName; 
	private int pilotID; 
	private String  pilotPosition; 

    public Pilots(String pilotName, int pilotID,String  pilotPosition){
		 this.pilotName= pilotName; 
         this.pilotID = pilotID;
		 this.pilotPosition=pilotPosition; 
	}
	public boolean isPilotForFlight(Aircraft aircraft)
	{
		ArrayList<Pilots> pilotsForAir = aircraft.getPilots();
		for(Pilots are: pilotsForAir) {
			if(are.equals(this))
			{
				return true;
			}

		}
		return false;
	}

	@Override
	//to print out the pilot details
	public String toString() {
		return
				"\n" +
				"Pilot Info: " + "\n" +
				"PilotName: " + pilotName + '\n' +
				"PilotID: " + pilotID + '\n' +
				"PilotPosition: " + pilotPosition + '\n' +
				"==============================================";
	}
}

