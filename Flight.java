import java.util.Date;
/**
 *
 * @author Collins Ehirim
 * 22/11/2023
 * Assignment 1
 */

    public class Flight {

        private String flightName; //Flight name
        private String departureTime; // Flight departure time
        private String arrivalTime; // Flight arrival time
        protected Airport departureAirport; //  Flight
        protected Airport arrivalAirport;
        private Aircraft aircraftName;

        public Flight(String flightName, Date departureTime,
                      Date arrivalTime, Airport departureAirport, Airport arrivalAirport, Aircraft aircraftName)
        {
            //I made a constructor so that it can be able to input values for flights
            this.flightName = flightName;
            this.departureTime = String.valueOf(departureTime);
            this.arrivalTime = String.valueOf(arrivalTime);
            this.departureAirport = departureAirport;
            this.arrivalAirport = arrivalAirport;
            this.aircraftName  = aircraftName;
        }
//generated getters and setters to help get and set values
    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(Airport departureAirport) {
        this.departureAirport = departureAirport;
    }

    public Airport getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(Airport arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public Aircraft getAircraftName() {
        return aircraftName;
    }

    public void setAircraftName(Aircraft aircraftName) {
        this.aircraftName = aircraftName;
    }

    @Override
    //to print out the Flight details
    public String toString() {

        return "\n=============================================="+ "\n"+
                "Flight Info: " + "\n" +
                "FlightName:  " + flightName + '\n' +
                "DepartureTime:  " + departureTime + '\n' +
                "ArrivalTime: " + arrivalTime + '\n' +
                "DepartureAirport: " + departureAirport + "\n"+
                "ArrivalAirport: " + arrivalAirport + "\n" +
                 aircraftName + "\n"+
                "==============================================";
    }
}

