package program;

import java.util.Scanner;

public class ATMTransaction {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount to be withdrawn:");
		int withdrawalAmount = input.nextInt();
		System.out.println("Enter the initial balance:");
		double initialBalance = input.nextDouble();
		//check if withdrawal amount is multiple of 5 and if there is enough balance
		if ((withdrawalAmount % 5 == 0) && (withdrawalAmount + 0.50) <= initialBalance) {
			double newBalance = initialBalance - (withdrawalAmount + 0.50);
			System.out.printf("%.2f", newBalance);
		} else {
			System.out.printf("%.2f\n", initialBalance);
		}
		input.close();
	}

}
