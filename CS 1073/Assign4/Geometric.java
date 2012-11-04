/**
@author Matthew Morgan - 3430092
*/
import java.util.Scanner;
public class Geometric{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number to test the series, between -1 and 1");
		double r = sc.nextDouble();
		double count = 0;
		double oldEstimate = 0;
		while (r <= -1 || r >= 1 || (1-Math.pow(r,(count+1))==0)){
			System.out.println("Number out of range or would divide by zero.  Please enter a value greater than -1 and less than 1.");
			r = sc.nextDouble();
		}
		System.out.println("The value of r is: \t" + r);
		double newEstimate = (1/(1-(Math.pow(r,(count+1)))));
		while(Math.abs(newEstimate - oldEstimate) >= .00000001){
			count++;
			oldEstimate = newEstimate;
			newEstimate = (1/(1-(Math.pow(r,(count+1)))));
		}
		System.out.println("The number of iterations was: \t" + count);
		System.out.println("The value of the formula was: \t" + newEstimate);
		System.out.println("The difference between last iteration and current was:\t" + (Math.abs(newEstimate - oldEstimate)));
	}
}