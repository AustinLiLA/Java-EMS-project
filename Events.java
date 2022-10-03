import java.io.IOException;
import java.io.Serializable;
abstract class Events implements Serializable{
	private int eventId; 
	private String eventNames;
	private String eventDescription;
    private String eventLocations;
    private String startDate;
    private String endDate; 	
    public abstract String eventDescription();


//Constructor 

public Events (int eventId, String eventNames, String eventLocations, String startDate, String endDate){ 
          this.eventId = eventId;
          this.eventNames = eventNames;
		  this.eventLocations = eventLocations;
		  this.startDate = startDate;
		  this.endDate = endDate;
}
public void seteventId(int eventId){
	
	this.eventId = eventId;
	
}
public void seteventNames(String eventNames){
	
	this.eventNames = eventNames;
	
}
public void seteventLocations(String eventLocations){
	
	this.eventLocations = eventLocations;
	
}
public void setstartDate(String startDate){
	
	this.startDate = startDate;
	
}
public void setendDate(String endDate){
	
	this.endDate = endDate;
	
}
//getter method 

public int geteventId(){
	return eventId; 
}

public String geteventNames(){

    return eventNames;
}

public String geteventLocations(){
	
    return eventLocations; 	
	
	
}


public String getstartDate(){
	
	return startDate;
	
}

public String getendDate(){
	
	return endDate;

}

//To string method 

public String toString(){ 

   return "Event ID is " + this.eventId + ", " + "event name is " + this.eventNames + ", " + "event location is at " + 
   this.eventLocations + ", "  + "startDate is on " + this.startDate + ", " + "endDate is on "  + this.endDate;

}







}