package program;

import java.util.Scanner;

public class GameOfBilliards {

	public static void main(String[] args) {
		int winner = 0, lead = 0;
		int score1, score2;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of rounds:");
		int rounds = input.nextInt();
		//Rounds should be less than or equal to 10000
		if (rounds <= 10000) {
			System.out.println("Enter scores of both players for "+rounds);
			//Check for score decide winner of each round
			for (int i = 0; i < rounds; i++) {
				score1 = input.nextInt();
				score2 = input.nextInt();
				if (score1 > score2 && (score1 - score2) > lead) {
					winner = 1;
					lead = score1 - score2;
				} else if (score2 > score1 && (score2 - score1) > lead) {
					winner = 2;
					lead = score2 - score1;
				}
			}
			System.out.println(winner + " " + lead);
			input.close();
		} else {
			System.out.println("Rounds must be less than 10000");
		}
	}

}
