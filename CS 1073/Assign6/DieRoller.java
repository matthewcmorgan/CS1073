/**
	@author Matthew C. Morgan - 3430092
*/
import java.util.Scanner;
public class DieRoller{
	public static void main(String[] args){
		System.out.print("How many sides on the die? ");
		Scanner sc = new Scanner(System.in);
		int sides = sc.nextInt();
		int[] results = new int[sides];
		System.out.print("\nHow many rolls? ");
		int iterations = sc.nextInt();
		for(int i = 0; i < iterations; i++){
			int rollResult = (int)(Math.random() * sides); //generate array
			results[rollResult]++;
		}
		for(int i = 0; i < results.length; i++){			//generate horizontal histogram
			if(i < 9){
				System.out.print(" ");
			}
			System.out.print((i+1) + ") ");
			for(int j = 1; j <= results[i]; j++){
				if(j % 5 == 0){
					System.out.print("+");
				} else {
					System.out.print("-");
				}
			}
			System.out.println();
		}
		int lines = 0;	//find lines needed for vertical histogram
		for(int i = 0; i < results.length; i++){
			lines = (results[i] > lines)? results[i]:lines;
		}
		for(int i = lines; i > 0; i--){
			System.out.println();		//start next line of vertical histogram
			for(int j = 0; j < results.length; j++){
				if(results[j] < i){
					System.out.print(" ");
				} else if(i % 5 == 0){
					System.out.print("+");
				}	else {
					System.out.print("|");
				}
			}
		}
		System.out.println();  //start the line of seperators
		for(int i = 0; i < results.length; i++){
			System.out.print("-");
		}
		System.out.println();		//start the first line of digits
		for(int i = 1; i <= results.length; i++){
			if(i > 9){
				System.out.print(i/10);
			} else {
				System.out.print("0");
			}
		}
		System.out.println();		//start the second line of digits
		for(int i = 1; i <= results.length; i++){
			System.out.print(i%10);
		}
	} //main
} //class