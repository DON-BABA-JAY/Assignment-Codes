
/*
	SOFE 2710 Assignment 2 

 */



/**
 *
 * @author Collins Ehirim
 * 22/11/2023
 * Assignment 1
 */
import java.util.ArrayList;
public class Airport {
    private String city;    //airport city
    private String country; //airport country
    private String id;      //airport id
    
    public Airport(String city,String country, String id){        
        this.city = city;
        this.country = country;
        this.id = id;        
    }
    
    public String getAirportCity(){
        return city;
    }
    public String getAirportCountry(){
        return country;
    }    
    public String getAirportId(){
        return id;
    }

    @Override
    //to print out the airport details
    public String toString() {
        return  "\n" +
                "City: " + city + '\n' +
                "Country: " + country + '\n' +
                "Id: " + id + '\n' +
                "==============================================";
    }
}
