class codingEvents extends Events{


//constructor 
public codingEvents(int eventId, String eventNames, String eventLocations, String startDate,String endDate){
	
	super(eventId,eventNames,eventLocations,startDate,endDate);
}


@Override 
public String eventDescription(){
	
	return "This is the coding event that welcome people who has high interest into programming language" ; 
	
}

@Override 
public String toString(){
	
	return super.toString();
	
}

}