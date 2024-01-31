package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("What is the Start Amount? ");
		int startAmount = in.nextInt();
		System.out.print("What is the Win Chance? ");
		double winChance = in.nextDouble();
		System.out.print("What is the Win Limit? ");
		int  winLimit = in.nextInt();

		int count = startAmount; 

		while (count < winLimit) {

			double roll = Math.random(); 
			System.out.print(roll);
			
			if (roll<winChance) { 
				count++; 
			}
			
			else {
				count--; 
			}
			
			System.out.println(startAmount);
			count++;
		
		}

	}

}
