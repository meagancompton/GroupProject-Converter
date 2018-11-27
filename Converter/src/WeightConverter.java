import java.util.*;
public class WeightConverter
	{
		static double pounds;
		static double ounces;
		static double liters;
		static double kilograms;
		static Scanner userInput = new Scanner(System.in);
		public static void kilogramConverter()
			{
				double mg = 0;
				double g =  0;
				System.out.println("If you need help with chemistry this is the converter for you");
				System.out.println("This converter will convert your mass in kilograms to different units");
				System.out.println("For example: kg -> g");
				System.out.println("Please input a mass in Kg");
				double userKilograms = userInput.nextDouble();
				g = userKilograms*1000;
				mg = g * 1000;
				System.out.println(userKilograms + " in grams is " + g);
				System.out.println(userKilograms + " in milligrams is " + mg);
			}
		public static void poundsToOunces() 
			{
				System.out.println("What would you like to convert?");
				System.out.println("1) Pounds to ounces?");
				System.out.println("2) Ounces to pounds?");
				int userChoice = userInput.nextInt();
				if(userChoice == 1)
					{
						System.out.println("Please enter the number of pounds you want to be converted");
						pounds = userInput.nextDouble();
						ounces = pounds * 16;
						System.out.println(pounds + " pound(s) in ounces is " + ounces);
					}
				else
					{
						System.out.println("Please enter the number of ounces you want to be converted");
						ounces = userInput.nextDouble();
						pounds = ounces / 16;
						System.out.println(ounces + " ounce(s) in pounds is " + pounds);
					}
			}
		public static void kilogramsToPounds()
			{
				System.out.println("What would you like to convert?");
				System.out.println("1) Kilograms to pounds?");
				System.out.println("2) Pounds to kilograms?");
				int userChoice = userInput.nextInt();
				if(userChoice == 1)
					{
						System.out.println("Please enter the number of pounds you want to be converted");
						kilograms = userInput.nextDouble();
						pounds = kilograms * 2.2;
						System.out.println(kilograms + " kilogram(s) in pounds is " + pounds);
					}
				else
					{
						System.out.println("Please enter the number of ounces you want to be converted");
						pounds = userInput.nextDouble();
						kilograms = pounds / 2.2;
						System.out.println(pounds + " pound(s) in kilograms is " + kilograms);
					}
			}
		public static void ouncesToLiters()
			{
				System.out.println("What would you like to convert?");
				System.out.println("1) Ounces to Liters?");
				System.out.println("2) Liters to Ounces?");
				int userChoice = userInput.nextInt();
				if(userChoice == 1)
					{
						System.out.println("Please enter the number of ounces you want to be converted");
						ounces = userInput.nextDouble();
						liters = ounces * 0.03;
						System.out.println(ounces + " ounce(s) in liters is " + liters);
					}
				else
					{
						System.out.println("Please enter the number of ounces you want to be converted");
						liters = userInput.nextDouble();
						ounces = liters * 33.8;
						System.out.println(liters + " liter(s) in ounces is " + ounces);
					}
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
