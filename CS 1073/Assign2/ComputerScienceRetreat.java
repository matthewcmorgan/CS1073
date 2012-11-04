/**
This is the Computer Science Retreat program to test the ActivityTab class.
@author Matthew Morgan - 3430092 
*/

public class ComputerScienceRetreat{
	public static void main(String[] args){
		ActivityTab andrewsTab = new ActivityTab("Andrew McAllister", 42);

		andrewsTab.addPrice(8.50);

		ActivityTab alisTab = new ActivityTab("Ali Ghorbani", 112);

		alisTab.addPrice(7.75);

		ActivityTab nataliesTab = new ActivityTab("Natalie Webber", 214);

		nataliesTab.addPrice(4.00);

		ActivityTab ericsTab = new ActivityTab("Eric Aubanel", 78);

		ericsTab.addPrice(6.00);
		ericsTab.addPrice(3.25);

		nataliesTab.addPrice(5.50);
		
		andrewsTab.addPrice(11.75);
		alisTab.addPrice(11.75);

		ericsTab.addPrice(2.50);

		System.out.println("Current Guest Summary:" + '\n' +
				"Guest Name" + "\t\t:\t" + "Room Number" + "\t:\t" + "Amount Owing" + '\n' +
	andrewsTab.getName() + "\t:\t" + andrewsTab.getRoomNumber() + "\t\t:\t" + andrewsTab.getTotal() + '\n'+	 
	alisTab.getName() + "\t\t:\t" + alisTab.getRoomNumber() + "\t\t:\t" + alisTab.getTotal() + '\n' +
	nataliesTab.getName() + "\t\t:\t" + nataliesTab.getRoomNumber() + "\t\t:\t" + nataliesTab.getTotal() + '\n' +
	ericsTab.getName() + "\t\t:\t" + ericsTab.getRoomNumber() + "\t\t:\t" + ericsTab.getTotal() + '\n');

		System.out.println("Guest Tip Amounts:" + '\n' + "Guest Name" + "\t\t:\t" + "Tip Amount" + '\n' +
		andrewsTab.getName() +  "\t:\t" + andrewsTab.tip(16) + '\n' +
		alisTab.getName() +  "\t\t:\t" + alisTab.tip(16) + '\n' +
		nataliesTab.getName() +  "\t\t:\t" + nataliesTab.tip(14) + '\n' +
		ericsTab.getName() +  "\t\t:\t" + ericsTab.tip(20) + '\n');
	}
}
