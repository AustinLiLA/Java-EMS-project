import java.io.File;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.ObjectOutputStream
import java.io.Serializable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
class Assessment1{ 

     public static void main(String [] args) {
		   socialEvents se1 = new socialEvents (1, "Albanybeck first social", "Patch", "21/07/22","21/07/22");
		   socialEvents se2 = new socialEvents (2, "Albanybeck second social", "oxford street", "22/09/22","23/09/22");
		   tradingEvents te1 = new tradingEvents (3, "trading meeting 01", "Caron Green", "04/06/22","04/07/22");
		   tradingEvents te2 = new tradingEvents (4, "trading meeting 02", "Caron Green", "04/08/22","04/09/22");
		   weddingEvents we1 = new weddingEvents (5, "wedding event 01", "The Shard", "04/09/22","04/09/22");
	       weddingEvents we2 = new weddingEvents (6, "wedding event 02", "HammerSmith", "04/09/22","04/09/22");
		   clubEvents ce1 = new clubEvents (7, "Club event 01", "The Shard", "04/08/22","10/08/22");
		   clubEvents ce2 = new clubEvents (8, "Club event 02", "WestMinister", "04/08/22","10/08/22");
		   codingEvents cde1 = new codingEvents (9, "Coding event 01", "Lancaster Square", "04/10/22","12/10/22");
		   codingEvents cde2 = new codingEvents (10, "Coding event 02", "Nottinghill Gate", "04/11/22","12/11/22");
		   Attendees ad1 =new Attendees (1, "Mike", 20, "Albanybeck first social");
		   Attendees ad2 =new Attendees (2, "Alex", 23, "Albanybeck second social");
		   Attendees ad3 =new Attendees (3, "Austin",26, "trading meeting 01");
		   Attendees ad4 =new Attendees (4, "Luke",27, "trading meeting 02");
		   Attendees ad5 =new Attendees (5, "Abby",30, "wedding event 01");
		   Attendees ad6 =new Attendees (6, "Michael",28, "wedding event 02");
		   Attendees ad7 =new Attendees (7, "Bob",35, "Club event 01");
		   Attendees ad8 =new Attendees (8, "Frank",49, "Club event 02");
		   Attendees ad9 =new Attendees (9, "Magan",24, "Coding event 01");
		   Attendees ad10 =new Attendees(10, "Charlie",29, "Coding event 02");
		   
	       ArrayList<socialEvents> a1 = new ArrayList<socialEvents>();
	       ArrayList<tradingEvents> a2 = new ArrayList<tradingEvents>();
		   ArrayList<weddingEvents> a3 = new ArrayList<weddingEvents>();
		   ArrayList<clubEvents> a4 = new ArrayList<clubEvents>();
		   ArrayList<codingEvents> a5 = new ArrayList<codingEvents>();
		   List<Attendees> a6 = new ArrayList<Attendees>();
		   a1.add(se1);
		   a1.add(se2);
		   a2.add(te1);
		   a2.add(te2);
		   a3.add(we1);
		   a3.add(we2);
		   a4.add(ce1);
		   a4.add(ce2);
		   a5.add(cde1);
		   a5.add(cde2);		
		   a6.add(ad1);
		   a6.add(ad2);
		   a6.add(ad3);
		   a6.add(ad4);
		   a6.add(ad5);
		   a6.add(ad6);
		   a6.add(ad7);
		   a6.add(ad8);
		   a6.add(ad9);
		   a6.add(ad10);
		    int choice = -1;
			int choice2 = -1;
			int choice3 = -1;
			int choice4 = -1;
		    Scanner s = new Scanner(System.in);
		    Scanner s1 = new Scanner(System.in);
			File file = new File("Events.txt");
			 
		    
			/* try{
							   FileOutputStream os = new FileOutputStream("event_object.dat");
							   ObjectOutputStream oos = new ObjectOutputStream(os);
							   oos.writeObject(a1);
							   oos.writeObject(a2);
							   oos.writeObject(a3);
							   oos.writeObject(a4);
							   oos.writeObject(a5);
						   }
                           catch(FileNotFoundException e){
		   
		                  System.out.println(e); 
	                      }
	                      catch(IOException e){
		   
		                    System.out.println(e); 
	                      } */
			
	 while(choice!=0){
		            System.out.println("1. List All Events");
		            System.out.println("2. List an individual event");
		            System.out.println("3. Edit an event");
		            System.out.println("4. Delete an event");
		            System.out.println("5. List the attendees attending an event");
	                System.out.println("6. Add an attendee to an event");
	                System.out.println("7. Delete an attendee from an event");
	                System.out.println("0. Exit"); 
	                System.out.print("Enter Your Choice : ");
	                choice = s.nextInt();
					
	               switch(choice){
					 
					 case 1:
					 //List  All Events;
					       for(socialEvents se: a1){

	                         System.out.println(se);
                            }
  
                           for(tradingEvents te: a2){

	                        System.out.println(te);
                                        }
  
                           for(weddingEvents we: a3){

	                          System.out.println(we);
                           } 
						   for(clubEvents ce: a4){

	                          System.out.println(ce);
                           } 
						   for(codingEvents cde: a5){

	                          System.out.println(cde);
												
                           } 
						   
						   break;
					case 2: //List an individual event;		
                       while(choice2 != 0){					
				          
					    System.out.println("Enter event id: "); 	  
	                    choice2 = s.nextInt();
				        
						switch(choice2){
						
						case 1: 
						
						  System.out.println(se1);
							break;
						case 2:	
							
						  System.out.println(se2);
						   break;
						case 3:
						
						  System.out.println(te1);
						  break;
						case 4:
						
						  System.out.println(te2);
						  break;
						case 5: 
						
						  System.out.println(we1);
						  break;
						case 6:
						
						  System.out.println(we2);
						  break;
						case 7:
						
						  System.out.println(ce1);
						  break;
						case 8:
						
						  System.out.println(ce2);
						  break;
						case 9:
						
						   System.out.println(cde1);
						   break;
						case 10:
						
						  System.out.println(cde2);
						  break;
						default:
                         System.out.println("There is no record of this event");
						 
						}
				        break;
				  }
				   
		      case 3:
				  
				 /* HashMap<Integer,socialEvents> h1 = new HashMap<>();
				   h1.put(1,se1);
				   h1.put(2,se2);
				   System.out.println(h1);
				  socialEvents retrivedsocialEvents = h1.get(2);
				   System.out.println("**** "+retrivedsocialEvents);
				   retrivedsocialEvents.seteventNames("New name");
				   h1.replace(retrivedsocialEvents.geteventNames(),retrivedsocialEvents);
				   System.out.println(h1);
				   */
				   break;
			

              
             case 4: 

			  while(choice3 != 0){					
				        System.out.println(se1);
						System.out.println(se2);
						System.out.println(te1);
						System.out.println(te2);
						System.out.println(we1);
						System.out.println(we2);
						System.out.println(ce1);
						System.out.println(ce2);
						System.out.println(cde1);
						System.out.println(cde2);
					    System.out.println("Enter event id which you want it to be deleted: "); 	  
	                    choice3 = s.nextInt();
				        
						switch(choice3){
						
						case 1: 
						
						  a1.remove(0);
							break;
						case 2:	
							
						 a1.remove(1);
						   break;
						case 3:
						
						  a2.remove(0);
						  break;
						case 4:
						
						a2.remove(1);
						 
						  break;
						case 5: 
						
						  a3.remove(0);
						  break;
						case 6:
						
						  a3.remove(1);
						  break;
						case 7:
						
						  a4.remove(0);
						  break;
						case 8:
						
						  a4.remove(1);
						  break;
						case 9:
						
						   a5.remove(0);
						   break;
						case 10:
						
						  a5.remove(1);
						  break;
						default:
                         System.out.println("This is invalid option");
						 
						}
				        break;
			  }
			 case 5:
				
				  for (Attendees i: a6){
					  
					  System.out.println(i);
					  
				  }
				 break;
				 
			case 6: 
                 System.out.println("Enter Attendee ID : ");
				 int id = s.nextInt();
				 System.out.println("Enter Attendee Name: ");
				 String name = s.next();
				 System.out.println("Enter Attendee Age: ");
				 int age = s.nextInt();
				 System.out.println("Enter Attendee Eventattend: ");
				 String Eventattend = s.next();
				 
				 a6.add(new Attendees(id,name,age,Eventattend));
				
				break;
				 
				   
				   
			case 7: 	   
				boolean found = false;
                 System.out.println("Enter Attendee ID to Delete :");
                 id = s.nextInt();
                 System.out.println("-----------------------");
              Iterator<Attendees> i = a6.iterator();
                  while(i.hasNext()){
                   Attendees ad = i.next();
                  if(ad.getattendeesId() == id){
                       i.remove();
                       found = true;
				  }				  
				   
				  }   
				  if(!found){
                      System.out.println("Record Not Found");
				  }
                 System.out.println("------------------------------");
                break;				 
				   
	

            				
				   
				   
				   
				   
				   
				   
	 
	 
	 
	 
	
	 
	 
	 }
	 
	 
	 
 }


}

}