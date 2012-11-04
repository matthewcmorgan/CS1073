/** 
  This is an example of a driver program; its purpose is 
  to "try out" the CSOlympicsEvent class.
  @author Andrew McAllister
*/

public class CSOlympicsEventTest 
{
   public static void main (String[] args) 
   {  
      // Create a couple of CSOlympicsEvent objects:
      CSOlympicsEvent andrewsEvent = new CSOlympicsEvent("Coin curling",
                                                         "CSA Lounge",
                                                          100, "Andrew");
      
      CSOlympicsEvent TrishsEvent  = new CSOlympicsEvent("Mini golf",
                                                         "Sunken Lounge",
                                                         3, "Trish");
      CSOlympicsEvent matthewsEvent = new CSOlympicsEvent("Dodgeball",
							 "SUB Ballroom", 
							250, "Matthew");
      CSOlympicsEvent braydensEvent = new CSOlympicsEvent("Ball drop",
							  "ITC Courtyard",
							  150, "Brayden"); 
      andrewsEvent.setMaxPoints(50);
      TrishsEvent.setMaxPoints(10);
      // Now print out information about the CSOlympicsEvent objects,  
      // just to confirm they were created properly:
      System.out.println("Andrew's event: " + andrewsEvent.toString());
      System.out.println("Trish's event:  "  + TrishsEvent.toString());
      System.out.println("Matthew's event: " + matthewsEvent.toString());
      System.out.println("Brayden's event: " + braydensEvent.toString());

   } // end main method
   
} // end CSOlympicsEventTest class
