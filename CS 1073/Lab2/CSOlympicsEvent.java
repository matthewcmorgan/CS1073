/** 
   This class represents data about an event held as part of the
   Computer Science Olympics during Orientation Week.
   @author Andrew McAllister
*/

public class CSOlympicsEvent 
{
   // Instance variables:

   // The name of the event. Examples might include
   // "Coin curling" or "Mini golf".
   private String eventName;
   private String eventOrganizer;
   
   // The room or other location where the event is held.
   private String location;

   // The maximum number of points a team can earn for this
   // event.
   private int maxPoints;

   // The constructor creates a new CSOlympicsEvent object
   // and initializes the instance variables.
   public CSOlympicsEvent(String eventNameIn,
                          String locationIn,
                          int    maxPointsIn,
			  String eventOrganizerIn) 
   {  eventName = eventNameIn;
      location  = locationIn;
      maxPoints = maxPointsIn;
      eventOrganizer = eventOrganizerIn;
   }
   public void setMaxPoints(int maxPointsVal) {
	maxPoints = maxPointsVal;
	}

   // This method creates and returns a String containing
   // all the information about a particular CSOlympicsEvent
   // object.
   public String toString()
   {  return ("CSOlympicsEvent[eventName=" + eventName
              + ", location="              + location
              + ", maxPoints="             + maxPoints
	      + ", organizer="		   + eventOrganizer +"]");
   }

} // end of CSOlympicsEvent class definition
