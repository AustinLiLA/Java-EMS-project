class tradingEvents extends Events{


//constructor 
public tradingEvents(int eventId, String eventNames, String eventLocations, String startDate,String endDate){
	
	super(eventId,eventNames,eventLocations, startDate,endDate);
}


@Override 
public String eventDescription(){
	
	return "This is the trading event that bring together members of a particular industry to display, demonstrate, and discuss their latest products and services" ; 
	
}

@Override 
public String toString(){
	
	return super.toString();
	
}

}