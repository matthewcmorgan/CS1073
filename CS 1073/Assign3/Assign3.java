/**
@author Matthew C. Morgan - 3430092
*/
import java.util.Scanner;
public class Assign3{
	public static void main(String[] args){
		System.out.println("Please input the first integer for comparison:");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.println("Please input the second integer for comparison:");
		int num2 = sc.nextInt();
		System.out.println("Please input the third integer for comparison:");
		int num3 = sc.nextInt();
		System.out.println("Please input the fourth integer for comparison:");
		int num4 = sc.nextInt();
		boolean isAlternating = false;	
		if(num1 == num2 || num2 == num3 || num3 == num4){
			isAlternating = false;
		} else if((num2 < num1 && num3 > num2 && num4 < num3) || (num2 > num1 && num3 < num2 && num4 > num3)){
			isAlternating = true;
		}
		if(isAlternating){
			System.out.println("Alternating");
		}else{
			System.out.println("Not Alternating");
		}
	}
}