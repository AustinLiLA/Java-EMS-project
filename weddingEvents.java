class weddingEvents extends Events{


//constructor 
public weddingEvents(int eventId, String eventNames,String eventLocations,String startDate,String endDate){
	
	super(eventId,eventNames,eventLocations,startDate,endDate);
}


@Override 
public String eventDescription(){
	
	return "This is the wedding event that encourage people to join" ; 
	
}

@Override 
public String toString(){
	
	return super.toString();
	
}

}