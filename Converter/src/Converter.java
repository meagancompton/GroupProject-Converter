import java.util.Scanner;
public class Converter
	{
		static Scanner userInput = new Scanner(System.in);
		public static void main(String[] args)
			{
				// TODO Auto-generated method stub
				//main method
				// practice pull requests 
			}
		public static void promptUser()
			{
				System.out.println("What would you like to covert?");
				int userChoice = userInput.nextInt();
			}
		public static void convertBases()
			{
				System.out.println("What would you like to covert your decimal number into?");
				System.out.println("(1) Binary");
				System.out.println("(2) Hexadecimal");
				int userChoice = userInput.nextInt();
				if(userChoice == 1)
					{
						System.out.println("Please enter a number less than or equal to 128");
						userChoice = userInput.nextInt();
					}
				else if(userChoice == 2)
					{
						
					}
			}

	}
