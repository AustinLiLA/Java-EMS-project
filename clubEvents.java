class clubEvents extends Events{


//constructor 
public clubEvents(int eventId, String eventNames, String eventLocations,String startDate,String endDate){
	
	super(eventId,eventNames,eventLocations,startDate,endDate);
}


@Override 
public String eventDescription(){
	
	return "This is the club event that welcome anyone to enjoy the party" ; 
	
}

@Override 
public String toString(){
	
	return super.toString();
	
}

}