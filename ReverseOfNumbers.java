package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseOfNumbers {

	public static void main(String[] args) {
		List<Integer> numberList = new ArrayList<Integer>();
		int size;
		Scanner input = new Scanner(System.in);
		System.out.println("How many values do you want to enter:");
		size = input.nextInt();
		if (size > 0 && size <= 100000) {
			System.out.println("Enter "+size+" values:");
			for(int i=0; i < size; i++) {
				numberList.add(input.nextInt());
			}
			System.out.println("Entered numbers in reverse order:");
			for (Integer num : numberList) {
				//Skip for reverse if length of number is less than or equal to 1
				if (String.valueOf(num).length() > 1) {
					reverseNumber(Integer.toString(num));
				}
			}
		} else {
			System.out.println("The size must be greater than 0 and less than equal to 100000");
		}
	}

	//Method to calculate reverse of numbers
	public static void reverseNumber(String number) {
		number = number.chars().mapToObj(c -> (char) c)
				.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
				.reverse().toString();
		System.out.println(number);
	}

}
