class Attendees implements AttendeeManagement{
    
	private int id;
	private String name;
	private int age;
	private String Eventattend; 
	
    

public String Attendedevents(){
	
	return Eventattend;
}

//Constructor 

public Attendees(int id, String name, int age, String Eventattend){

      this.id = id;
      this.name = name; 
	  this.age = age; 
	  this.Eventattend = Eventattend; 
}	  


/*Setter method 
public void SetAttendeesid(int id){
	
	this.id = id;
	
}

public void SetAttendeesname(String name){
	
	this.name = name;
	
public void SetAttendeesid(int age){
	
	this.age = age;
}	
public void SetAttendeesEventattend(int Eventattend){
	
	this.Eventattend = Eventattend;
}	


}	*/ 
	
 //getter method 
public int getattendeesId(){
	return id; 
}
public String getattendeesName(){
     
	 return name;
}	
public 	int getattendeesAge(){
	
	return age;
}

public 	String getEventattend(){
	
	return Eventattend;
}

public String toString(){
	
	return "Attendee id is " + this.id + ", " + "Attendee name is " + this.name  + "," + "Attendee age is " + this.age + ", " + "Attendee's attended event is " + this.Eventattend; 
}
	
}