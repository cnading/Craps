import java.util.Scanner;

public class Craps
	{
		static Scanner userInput = new Scanner(System.in);
		static int dice1;
		static int dice2;
		static int diceTotal;
		static int bet;
		static String name;
		static boolean secondRoll;
		static boolean playAgain;
		static int point;

		public static void main(String[] args)
			{
				dice1 = (int) (Math.random() * 6) + 1;
				dice2 = (int) (Math.random() * 6) + 1;
				diceTotal = dice1 + dice2;
				point= diceTotal;
				System.out.println("Welcome to craps baby, what's your name?");
				name = userInput.nextLine();
				System.out.println("Well, " + name + ", Press Enter to roll the dice");
				userInput.nextLine();

				if (diceTotal == 7 || diceTotal == 11)
					{
						System.out.println("Congragulations! You Won, you rolled a " + dice1 + " and a " + dice2
								+ " for a total of " + diceTotal);
						secondRoll = false;
					} else if (diceTotal == 2 || diceTotal == 12)

					{
						System.out.println("Way to go! You Lost immediatley! You rolled a " + dice1 + " and a " + dice2
								+ " for a total of " + diceTotal);
						secondRoll = false;
					} else
					System.out.println("You rolled a " + dice1 + " and a " + dice2 + " for a total of " + diceTotal);
				while (secondRoll)
					{
						System.out.println("Well, " + name + ", Press Enter to roll the dice");
						dice1 = (int) (Math.random() * 6) + 1;
						dice2 = (int) (Math.random() * 6) + 1;
						diceTotal = dice1 + dice2;
						if (point== diceTotal)
							{
								System.out.println("Congragulations! You Won, you rolled a " + dice1 + " and a " + dice2
										+ " for a total of " + diceTotal);
								secondRoll = false;
							}
					}
			}

	}
