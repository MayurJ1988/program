package program;

import java.util.Scanner;

public class SumOfInteger {

	public static void main(String[] args) {
		int sizeOfNumbers;
		Scanner input = new Scanner(System.in);
		System.out.println("How many numbers do you want to enter:");
		sizeOfNumbers = input.nextInt();
		// The size should be greater than 0 and less than equal to 1000
		if (sizeOfNumbers > 0 && sizeOfNumbers <= 1000) {
			int[] arr = new int[sizeOfNumbers];
			int i;
			System.out.println("Enter " + sizeOfNumbers + " numbers:");
			for (i = 0; i < sizeOfNumbers; i++) {
				int number = input.nextInt();
				if (number > 0 && number <= 100000) {
					arr[i] = number;
				} else {
					System.out.println("Entered number must be greater than 0 and less than 100000");
					break;
				}
			}
			for (int j = 0; j < sizeOfNumbers && i == sizeOfNumbers; j++) {
				System.out.println("Sum of " + arr[j] + " is:" + sum(arr[j]));
			}

		} else {
			System.out.println("Number of integers must be between 1 and 1000");
		}
	}
	
	//Method to calculate sum of a number
	public static int sum(int number) {
		int sum = String.valueOf(number).chars().map(Character :: getNumericValue).sum();
		return sum;
	}

}
