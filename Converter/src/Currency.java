import java.util.Scanner;
import java.text.DecimalFormat; 

public class Currency
	{
		static Scanner userInput = new Scanner(System.in);
		
		public static void main(String[] args)
			{
				System.out.println("Which currency would you like to convert your US dollar into?");
				System.out.println("1) Euro");
				System.out.println("2) Mexican Peso");
				System.out.println("3) Indian Rupee");
				System.out.println("4) Australian Dollar");
				System.out.println("5) Yen");
				int chosenCurrency = userInput.nextInt();
				System.out.println("What is the amount of US Dollars you would like to convert?");
				double initialValue = userInput.nextDouble();
				double currencyValue = 0;
				if(chosenCurrency == 1)
					{
						currencyValue = initialValue*.88; 
						DecimalFormat df = new DecimalFormat(".00");
						System.out.println(df.format(initialValue) + " US Dollars is equal to " + df.format(currencyValue) + " Euros.");
					}
				else if(chosenCurrency == 2)
					{
						currencyValue = initialValue*20.49;
						DecimalFormat df = new DecimalFormat(".00");
						System.out.println(df.format(initialValue) + " US Dollars is equal to " + df.format(currencyValue) + " Mexican Pesos.");
					}
				else if(chosenCurrency == 3)
					{
						currencyValue = initialValue*70.78;
						DecimalFormat df = new DecimalFormat(".00");
						System.out.println(df.format(initialValue) + " US Dollars is equal to " + df.format(currencyValue) + " Indian Rupees.");
					}
				else if(chosenCurrency == 4)
					{
						currencyValue = initialValue*1.38;
						DecimalFormat df = new DecimalFormat(".00");
						System.out.println(df.format(initialValue) + " US Dollars is equal to " + df.format(currencyValue) + " Australian Dollars.");
					}
				else
					{
						currencyValue = initialValue*113.59;
						DecimalFormat df = new DecimalFormat(".00");
						System.out.println(df.format(initialValue) + " US Dollars is equal to " + df.format(currencyValue) + " Japanese Yen.");
					}
			}

	}
