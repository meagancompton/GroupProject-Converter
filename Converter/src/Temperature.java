import java.util.Scanner;

public class Temperature
	{
		public static void temperatureConverter()
			{
				System.out.println("first enter in the temperature option you have (example: k = 1, c = 2 or f = 3).");
				Scanner userHas = new Scanner(System.in);
				int userMeasure = userHas.nextInt();
				System.out.println("next, enter in the number you would like to convert (example: -2 or 300).");
				Scanner userHas2 = new Scanner(System.in);
				double userNumber = userHas2.nextDouble();
				System.out.println("last, enter in the temperature option you want (example: k = 1, c = 2 or f = 3).");
				Scanner userWants = new Scanner(System.in);
				int userMeasureNew = userHas.nextInt();
				
				double KToF = (9.0/5.0) * (userNumber - 273.15) + 32.0;
				double KToC = userNumber - 273.15;
				double FToC = (userNumber - 32.0) * (5.0/9.0); 
				double FToK = (userNumber - 32.0) * (5.0/9.0) + 273.15;
				double CToF = (userNumber * (9.0/5.0)) + 32;
				double CToK = userNumber + 273.15;
				
				//kelvin to fahrenheit
				if (userMeasure == 1 && userMeasureNew == 3)
					{
						System.out.println("the new value is " + KToF + " degrees kelvin");
					}
				
				//kelvin to celcius
				if (userMeasure == 1 && userMeasureNew == 2)
					{
						System.out.println("the new value is " + KToC + " degrees fahrenheit");
					}
				
				//fahrenheit to celcius
				if (userMeasure == 3 && userMeasureNew == 2)
					{
						System.out.println("the new value is " + FToC + " degrees fahrenheit");
					}
				
				//fahrenheit to kelvin
				if (userMeasure == 3 && userMeasureNew == 1)
					{
						System.out.println("the new value is " + FToK + " degrees fahrenheit");
					}
				
				//celcius to fahrenheit
				if (userMeasure == 2 && userMeasureNew == 3)
					{
						System.out.println("the new value is " + CToF + " degrees fahrenheit");
					}
				
				//celcius to kelvin
				if (userMeasure == 2 && userMeasureNew == 1)
					{
						System.out.println("the new value is " + CToK + " degrees fahrenheit");
					}
				//helloooo
			}

	}
