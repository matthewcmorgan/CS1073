import java.util.Scanner;

/**
  @author Matthew Morgan 3430092
**/

public class MySecondProgram {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("My name is TOM. What is your name?");
		String userInput = sc.nextLine();
		System.out.println("Pleased to meet you, " + userInput);
		System.out.println("In which faculty are you enrolled?");
		String facultyInput = sc.nextLine();
		System.out.println("Very Cool, " + userInput + " of the " + facultyInput + 
			"!  I am stuck inside this computer and can't find my way out.");
   }
}
