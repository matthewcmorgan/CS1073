/**
This is a class to track a running total for Activities and a resort.
This class will be called ActivityTab.
@author Matthew Morgan - 3430092
*/

public class ActivityTab{
	/**
	The name of the guest.
	*/	
	private String name;
	/**
	The room number assigned to the guest.
	*/
	private int roomNumber;
	/**
	The inital amount owing for a new guest is 0.00.
	*/
	private double amountOwing = 0.00;
	
	/**
	The constructor for our ActivityTab class.  
	@param nameIn The name of the guest.
	@param roomNumberIn The room number assigned to the guest.
	*/
	public ActivityTab(String nameIn, int roomNumberIn){
		name = nameIn;
		roomNumber = roomNumberIn;
	}
	/**
	This method returns the name of the guest.
	@return The name of the guest.
	*/
	public String getName(){
		return name;
	}
	/**
	This method will return the assigned room number of the guest.
	@return The room number of the guest.
	*/
	public int getRoomNumber(){
		return roomNumber;
	}
	/**
	This method returns the current amount owed by the guest.
	@return The amount owed by the guest.
	*/
	public double getTotal(){
		return amountOwing;
	}
	/**
	This mutator method will calculate the new amount owed based on an input price.
	@param priceIn The cost of an activity.
	*/
	public void addPrice(double priceIn){
		amountOwing = amountOwing + priceIn;
	}
	/**
	This mutator method will calculate the amount of a tip based on the input tip percentage.
	@param tipPercent The input amount to tip in percentage.  (as a whole number)	
	@return The amount of the tip based on current amount owed and tip percentage input.
	*/
	public double tip(double tipPercent){
		return  (amountOwing * (tipPercent/100));
	}
}

