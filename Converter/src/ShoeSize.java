import java.util.Scanner;

public class ShoeSize
	{
		public static void shoeSizeConverter()
			{
				System.out.println("select 1 for women's shoe sizes and 2 for men's shoe sizes.");
				Scanner userSelection = new Scanner (System.in);
				int userGender = userSelection.nextInt();
				System.out.println("now please select what size you want to convert from (US = 1, UK = 2, and Euro = 3).");
				Scanner userSelection2 = new Scanner (System.in);
				int userHas = userSelection2.nextInt();
				System.out.println("next, enter in the size you wish to be converted (for example: 9, 6.5 or 40).");
				Scanner userInput = new Scanner (System.in);
				double userInitialSize = userInput.nextDouble();
				System.out.println("Lastly, what measurement do want you shoe size to be represented in?(US = 1, UK = 2, and Euro = 3)");
				Scanner userSelection3 = new Scanner (System.in);
				int userWants = userSelection3.nextInt();
				
				//Women's variables 
				
				double USToUKWomen = userInitialSize - 2;
				double USToEuroWomen = userInitialSize + 31;
				double UKToUSWomen = userInitialSize + 2;
				double UKToEuroWomen = userInitialSize + 33;
				double EuroToUSWomen = userInitialSize - 31;
				double EuroToUKWomen = userInitialSize - 33;
				
				//Women US to UK
				if (userGender == 1 && userHas == 1 && userWants == 2)
					{
						System.out.println("Your new measurement is " + USToUKWomen);
					}
				
				//Women US to Euro
				if (userGender == 1 && userHas == 1 && userWants == 3)
					{
						System.out.println("Your new measurement is " + USToEuroWomen);
					}
				
				//Women UK to US
				if (userGender == 1 && userHas == 2 && userWants == 1)
					{
						System.out.println("Your new measurement is " + UKToUSWomen);
					}
				
				//Women UK to Euro
				if (userGender == 1 && userHas == 2 && userWants == 3)
					{
						System.out.println("Your new measurement is " + UKToEuroWomen);
					}
				
				//Women Euro to US
				if (userGender == 1 && userHas == 3 && userWants == 1)
					{
						System.out.println("Your new measurement is " + EuroToUSWomen);
					}
				
				//Women Euro to UK
				if (userGender == 1 && userHas == 3 && userWants == 2)
					{
						System.out.println("Your new measurement is " + EuroToUKWomen);
					}
				
		/////////////////////////////////////////////////////////////////////////////////////////////////			
				
				double USToUKMen = userInitialSize - 0.5;
				double USToEuroMen = userInitialSize + 33;
				double UKToUSMen = userInitialSize + 0.5;
				double UKToEuroMen = userInitialSize + 33;
				double EuroToUSMen = userInitialSize - 33;
				double EuroToUKMen = userInitialSize - 33;
				
				//Men US to UK
				if (userGender == 2 && userHas == 1 && userWants == 2)
					{
						System.out.println("Your new measurement is " + USToUKMen);
					}
				
				//Men US to Euro
				if (userGender == 2 && userHas == 1 && userWants == 3)
					{
						System.out.println("Your new measurement is " + USToEuroMen);
					}
				
				//Men UK to US
				if (userGender == 2 && userHas == 2 && userWants == 1)
					{
						System.out.println("Your new measurement is " + UKToUSMen);
					}
				
				//Men UK to Euro
				if (userGender == 2 && userHas == 2 && userWants == 3)
					{
						System.out.println("Your new measurement is " + UKToEuroMen);
					}
				
				//Men Euro to US
				if (userGender == 2 && userHas == 3 && userWants == 1)
					{
						System.out.println("Your new measurement is " + EuroToUSMen);
					}
				
				//Men Euro to UK
				if (userGender == 2 && userHas == 3 && userWants == 2)
					{
						System.out.println("Your new measurement is " + EuroToUKMen);
					}// hello
			}
	}
