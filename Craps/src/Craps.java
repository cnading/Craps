import java. util.Scanner;

public class Craps
	{
		static Scanner userInput = new Scanner(System.in);
		static int dice1;
		static int dice2;
		static int diceTotal;
		static int bet;
		static String name;
		static boolean playAgain;
		
		public static void main(String[] args)
			{
				dice1= (int)(Math.random()*6) +1;
				dice2= (int)(Math.random()*6) +1;
				diceTotal= dice1 + dice2;
				System.out.println("Welcome to craps baby, what's your name?");
				name= userInput.nextLine();
				System.out.println("Well, " + name + ", Press Enter to roll the dice");
				userInput.nextLine();
				
			
			}

	}
