/**
	@author Matthew C. Morgan - 3430092
*/

import java.util.Scanner;
import java.text.NumberFormat;
public class Sales2D{
	public static void main(String[] args){
		NumberFormat f1 = NumberFormat.getCurrencyInstance();
		f1.setMinimumFractionDigits(2);
		System.out.print("How many weeks of sales data are desired? ");
		Scanner sc = new Scanner(System.in);
		int weeks = sc.nextInt();
		int[][] sales = new int[7][weeks]; //7 is number of days in week
		int[] sumOfSales = new int[weeks];
		for(int i = 0; i < weeks; i++){
			for(int j = 0; j < 7; j++){
				int random = 100000 + (int)(Math.random() * 400000);
				sales[j][i] = random;
				sumOfSales[i] += sales[j][i];
			}
		}
		String[] days = {"Monday: ", "Tuesday: ", "Wednesday: ", "Thursday: ", "Friday:  ", "Saturday: ", "Sunday:  "};
		System.out.print('\t');
		for(int i = 0; i < days.length; i++){
			System.out.print(days[i] + '\t');
		}
		for(int i = 0; i < weeks; i++){
			System.out.println();
			System.out.print("Week");
			if(i < 9){
				System.out.print("0");
			}
			System.out.print((i+1) + ":");
			for(int j = 0; j < sales.length; j++){
				System.out.print('\t' + f1.format(sales[j][i]*.01));
			}
		}
		System.out.println();
		int highest = 0;
		int topWeek = 0;
		for(int i = 0; i < sumOfSales.length; i++){
			sumOfSales[i] = (sumOfSales[i] / 7);
			highest = (sumOfSales[i] > highest)? sumOfSales[i]:highest;
			topWeek = (highest == sumOfSales[i])? i:topWeek;
		}
		System.out.println("The week with the highest sales was at index " + topWeek + ".");
		System.out.println("The average sales for week " + (topWeek +1) +  " was " + f1.format(highest *.01) + ".");
	}
}
