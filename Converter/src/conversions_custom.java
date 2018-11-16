import java.util.*;
public class conversions_custom
	{
		static Scanner userInput = new Scanner(System.in);
		
		public static void convertCustom()
			{
double finalNumber = 0;
				
				System.out.println("Welcome to the Customary Measurements Converter. First, please enter your name.");
				Scanner userName = new Scanner(System.in);
				String name = userName.nextLine();
				
				System.out.println();
				System.out.println("Welcome " + name + "." );
				System.out.println("-------------------------------------------------------------------------------------");
				System.out.println("The units of measurement you can use are Inches, Feet, Yards, and Miles");
				System.out.println("-------------------------------------------------------------------------------------");
				System.out.println("First, which unit would you like to convert from?");
				Scanner convertFrom = new Scanner(System.in);
				String from = convertFrom.nextLine();
				
				System.out.println();
				System.out.println("Next, what unit would you like to convert to?");
				Scanner convertTo = new Scanner(System.in);
				String to = convertTo.nextLine();
				
				System.out.println();
				System.out.println("Please enter the number you would like to convert to " + to);
				
				Scanner userNumber = new Scanner(System.in);
				double number = userNumber.nextDouble();
				
				if (from.equals("Inches") && to.equals("Feet"))
					{
						finalNumber = number / 12;
					}
				
				if (from.equals("Inches") && to.equals("Yards"))
					{
						finalNumber = number / 36;
					}
				
				if (from.equals("Inches") && to.equals("Miles"))
					{
						finalNumber = number / 63360;
					}
				
				if (from.equals("Feet") && to.equals("Inches"))
					{
						finalNumber = number * 12;
					}
				
				if (from.equals("Feet") && to.equals("Yards"))
					{
						finalNumber = number / 3;
					}
				
				if (from.equals("Feet") && to.equals("Miles"))
					{
						finalNumber = number / 5280;
					}
				
				if (from.equals("Yards") && to.equals("Inches"))
					{
						finalNumber = number * 36;
					}
				
				if (from.equals("Yards") && to.equals("Feet"))
					{
						finalNumber = number * 3;
					}
				
				if (from.equals("Yards") && to.equals("Miles"))
					{
						finalNumber = number / 1760;
					}
				
				if (from.equals("Miles") && to.equals("Inches"))
					{
						finalNumber = number * 63360;
					}
				
				if (from.equals("Miles") && to.equals("Feet"))
					{
						finalNumber = number * 5280;
					}
				
				if (from.equals("Miles") && to.equals("Yards"))
					{
						finalNumber = number * 1760;
					}
				
				if (from.equals("Inches") && to.equals("Inches"))
					{
						finalNumber = number;
					}
				if (from.equals("Feet") && to.equals("Feet"))
					{
						finalNumber = number;
					}
				if (from.equals("Yards") && to.equals("Yards"))
					{
						finalNumber = number;
					}
				if (from.equals("Miles") && to.equals("Miles"))
					{
						finalNumber = number;
					}
				
				System.out.println();
				System.out.println(number + " " + from + " converted to " + to + " equals " + finalNumber + " " + to + ".");

			}

	}