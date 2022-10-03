class socialEvents extends Events{



//constructor 
public socialEvents(int eventId, String eventNames, String eventLocations,String startDate,String endDate){
	
	super(eventId,eventNames,eventLocations,startDate,endDate);
}


@Override 
public String eventDescription(){
	
	return "This is the corporate social event which will help people to network and build together, we appreciate every paticipants' dedication" ; 
	
}

@Override 
public String toString(){
	
	return super.toString();
	
}











}