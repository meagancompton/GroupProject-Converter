import java.util.*;
public class WeightConverter
	{
		static Scanner userInput = new Scanner(System.in);
		public static void kilogramConverter()
			{
				int mg = 0;
				int g =  0;
				System.out.println("If you need help with chemistry this is the converter for you");
				System.out.println("This converter will convert your mass in kilograms to different units");
				System.out.println("For example: kg -> g");
				System.out.println("Please input a mass in Kg");
				int userKilograms = userInput.nextInt();
				g = userKilograms*1000;
				mg = g * 1000;
				System.out.println(userKilograms + " in grams is " + g);
				System.out.println(userKilograms + " in milligrams is " + mg);
			}
		public static void poundsToOunces() 
			{
				
			}
		public static void kilogramsToPounds()
			{
				
			}
		public static void ouncesToLiters()
			{
				
			}
		public static void promptUser()
			{
				System.out.println("What would you like to convert between?");
				System.out.println("1) Basic unit converter for kilograms");
				System.out.println("2) Kilograms to pounds");
				System.out.println("3) Pounds to ounces");
				System.out.println("4) Ounces to liters");
				int userChoice = userInput.nextInt();
				if(userChoice == 1)
					{
						kilogramConverter();
					}
				else if(userChoice ==2 )
					{
						kilogramsToPounds();
					}
				else if (userChoice == 3)
					{
						poundsToOunces();
					}
				else
					{
						ouncesToLiters();
					}
			}
	}
