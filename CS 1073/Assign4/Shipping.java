/**
@author Matthew Morgan - 3430092
*/
import java.util.Scanner;
import java.text.NumberFormat;
public class Shipping{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		NumberFormat f1 = NumberFormat.getNumberInstance();
		f1.setMinimumFractionDigits(3);
		double function = 0;
		Box b1 = new Box(0,0,0), largebox = b1, smallbox = b1;
		Tube t1 = new Tube(0,0), largetube = t1, smalltube = t1;
		while (function != 3){
			System.out.print("What would you like to do?\n1 - Get info for a box\n2 - Get info for a tube\n3 - Quit\nEnter your choice: ");
			function = sc.nextDouble();
			if (function == 1){
				System.out.print("Length (in cm): ");
				double length = sc.nextDouble();
				System.out.print("Width (in cm): ");
				double width = sc.nextDouble();
				System.out.print("Height (in cm): ");
				double height = sc.nextDouble();
				b1 = new Box(length, width, height);
				System.out.println("The volume is: " + f1.format(b1.getVolume()) + " cubic centimeters." + "\nThe surface area is: " + f1.format(b1.getSurfaceArea()) + " square centimeters.\n");
				largebox = (b1.getVolume() > largebox.getVolume())? b1:largebox;
				smallbox = (smallbox.getSurfaceArea() == 0)? b1:(b1.getSurfaceArea() < smallbox.getSurfaceArea())? b1:smallbox;
			}else if(function == 2){
				System.out.print("Radius (in cm): ");
				double radius = sc.nextDouble();
				System.out.print("Height (in cm): ");
				double height = sc.nextDouble();
				t1 = new Tube(radius, height);
				System.out.println("The volume is: " + f1.format(t1.getVolume()) + " cubic centimeters." + "\nThe surface area is: " + f1.format(t1.getSurfaceArea()) + " square centimeters.\n");
				largetube = (t1.getVolume() > largetube.getVolume())? t1:largetube;
				smalltube = (smalltube.getSurfaceArea() == 0)? t1:(t1.getSurfaceArea() < smalltube.getSurfaceArea())? t1:smalltube;
			}else if(function == 3){
				System.out.print("The container with the largest volume is a ");
				System.out.println((largetube.getVolume() > largebox.getVolume())? ("tube."):("box."));				
				System.out.println("It's volume is: " + f1.format(((largetube.getVolume() > largebox.getVolume())? largetube.getVolume():largebox.getVolume())) + " cubic centimeters.");
				System.out.print("The container with the smallest surface area is a ");
				System.out.println((smalltube.getSurfaceArea() > smallbox.getSurfaceArea())? ("box."):("tube."));				
				System.out.println("It's surface area is: " + f1.format(((smalltube.getSurfaceArea() > smallbox.getSurfaceArea())? smallbox.getSurfaceArea():smalltube.getSurfaceArea())) + " square centimeters.");				
			}
		}
	}
}