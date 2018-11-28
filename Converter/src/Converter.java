import java.util.Scanner;
public class Converter
	{
		static boolean run = true;
		public static void main(String[] args)
			{
				int userChoice;
				Scanner userInput = new Scanner(System.in);
				System.out.println("Welcome to Blake, Liam, Meagan and Taylor's Universal Converter");
				do
					{
						System.out.println("What would you like to do?");
						System.out.println("1) Base Converter");
						System.out.println("2) Weight Converter");
						System.out.println("3) Time Zone Converter");
						System.out.println("4) US Standard Converter");
						System.out.println("5) Currency Converter");
						System.out.println("6) Tempurature Converter");
						userChoice = userInput.nextInt();
						switch(userChoice)
						{
							case 1:
								DecimalToBinary.covertToBinary();
								break;
							case 2:
								WeightConverter.promptUser();
								break;
							case 3:
								TimeZoneConversion.TimeZones();
								break;
							case 4:
								conversions_custom.convertCustom();
								break;
							case 5:
								Currency.convertCurrency();
								break;
						}
						System.out.println("Would you like to convert again?");
						System.out.println("1) yes");
						System.out.println("2) no");
						userChoice = userInput.nextInt();
						if(userChoice != 1)
							{
								run = false;
							}
					} while(run);
				System.out.println("Thank you for using our Universal Converter!");
				
			}
	}
