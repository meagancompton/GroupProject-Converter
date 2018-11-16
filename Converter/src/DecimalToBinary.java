import java.util.*;
public class DecimalToBinary
	{
		static Scanner userInput = new Scanner(System.in);
		
		public static void covertToBinary()
		{
			ArrayList <Integer> binaryNumber = new ArrayList <Integer>();
			boolean running = true;
			int number;
			System.out.println("What would you like to covert your decimal number into?");
			System.out.println("(1) Binary");
			System.out.println("(2) Hexadecimal");
			int userChoice = userInput.nextInt();
			if(userChoice == 1)
				{
					System.out.println("Please enter a number");
					int userNumber = userInput.nextInt();
					number = userNumber;
					do
						{
							if(userNumber != 0)
								{
									binaryNumber.add(userNumber % 2);
									userNumber = userNumber/2;
								}
							else
								{
									running = false;
								}
						}while(running);
					Collections.reverse(binaryNumber);
					System.out.print(number + " in binary is ");
					for(int i : binaryNumber)
						{
							System.out.print(i);
						}
					
				}
			else if(userChoice == 2)
				{
					System.out.println("Please enter a number");
					int hexNumber = userInput.nextInt();
					String str = Integer.toHexString(hexNumber);
					System.out.println(hexNumber + " in hexadecimal is " + str);
				}
			}
	}
