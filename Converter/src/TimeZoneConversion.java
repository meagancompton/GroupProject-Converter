import java.util.*;
public class TimeZoneConversion
	{
		static Scanner userInput = new Scanner(System.in);
		public static void TimeZones()
			{
				System.out.println("Welcome to the military time zone converter! Please enter your name.");
				Scanner userName = new Scanner(System.in);
				String name = userName.nextLine();
				
				System.out.println();
				System.out.println("Welcome " + name + "." );
				System.out.println("First, please enter the hour of the time where you are.");
				Scanner hour = new Scanner(System.in);
				int userHour = hour.nextInt();
				System.out.println("Next, please enter the minutes of the time where you are.");
				Scanner mins = new Scanner(System.in);
				int userMins = mins.nextInt();
				
				System.out.println();
				System.out.println("Which US time zone are you in?");
				System.out.println("Pacific, Mountain, Central, Eastern, Hawaii, or Alaska?");
				Scanner timeZone = new Scanner(System.in);
				String userZone = timeZone.nextLine();
				
				System.out.println();
				System.out.println("Next, Which time zone would you like to convert to?");
				System.out.println("Pacific, Mountain, Central, Eastern, Hawaii, or Alaska?");
				Scanner zoneTo = new Scanner(System.in);
				String userZoneTo = timeZone.nextLine();
				
				if(userZone.equals("Pacific") && userZoneTo.equals("Mountain"))
					{
						userHour = userHour + 1;
					}
				if(userZone.equals("Pacific") && userZoneTo.equals("Central"))
					{
						userHour = userHour + 2;
					}
				if(userZone.equals("Pacific") && userZoneTo.equals("Eastern"))
					{
						userHour = userHour + 3;
					}
				if(userZone.equals("Pacific") && userZoneTo.equals("Hawaii"))
					{
						userHour = userHour - 2;
					}
				if(userZone.equals("Pacific") && userZoneTo.equals("Alaska"))
					{
						userHour = userHour - 1;
					}
				if(userZone.equals("Mountain") && userZoneTo.equals("Pacific"))
					{
						userHour = userHour - 1;
					}
				if(userZone.equals("Mountain") && userZoneTo.equals("Central"))
					{
						userHour = userHour + 1;
					}
				if(userZone.equals("Mountain") && userZoneTo.equals("Eastern"))
					{
						userHour = userHour + 2;
					}
				if(userZone.equals("Mountain") && userZoneTo.equals("Hawaii"))
					{
						userHour = userHour - 3;
					}
				if(userZone.equals("Mountain") && userZoneTo.equals("Alaska"))
					{
						userHour = userHour - 2;
					}
				if(userZone.equals("Central") && userZoneTo.equals("Pacific"))
					{
						userHour = userHour - 2;
					}
				if(userZone.equals("Central") && userZoneTo.equals("Mountain"))
					{
						userHour = userHour - 2;
					}
				if(userZone.equals("Central") && userZoneTo.equals("Eastern"))
					{
						userHour = userHour + 1;
					}
				if(userZone.equals("Central") && userZoneTo.equals("Hawaii"))
					{
						userHour = userHour - 4;
					}
				if(userZone.equals("Central") && userZoneTo.equals("Alaska"))
					{
						userHour = userHour - 3;
					}
				if(userZone.equals("Eastern") && userZoneTo.equals("Pacific"))
					{
						userHour = userHour - 3;
					}
				if(userZone.equals("Eastern") && userZoneTo.equals("Mountain"))
					{
						userHour = userHour - 2;
					}
				if(userZone.equals("Eastern") && userZoneTo.equals("Central"))
					{
						userHour = userHour - 1;
					}
				if(userZone.equals("Eastern") && userZoneTo.equals("Hawaii"))
					{
						userHour = userHour - 5;
					}
				if(userZone.equals("Eastern") && userZoneTo.equals("Alaska"))
					{
						userHour = userHour - 4;
					}
				if(userZone.equals("Hawaii") && userZoneTo.equals("Pacific"))
					{
						userHour = userHour + 2;
					}
				if(userZone.equals("Hawaii") && userZoneTo.equals("Mountain"))
					{
						userHour = userHour + 3;
					}
				if(userZone.equals("Hawaii") && userZoneTo.equals("Central"))
					{
						userHour = userHour + 4;
					}
				if(userZone.equals("Hawaii") && userZoneTo.equals("Eastern"))
					{
						userHour = userHour + 5;
					}
				if(userZone.equals("Hawaii") && userZoneTo.equals("Alaska"))
					{
						userHour = userHour + 1;
					}
				if(userZone.equals("Alaska") && userZoneTo.equals("Mountain"))
					{
						userHour = userHour + 2;
					}
				if(userZone.equals("Alaska") && userZoneTo.equals("Central"))
					{
						userHour = userHour + 3;
					}
				if(userZone.equals("Alaska") && userZoneTo.equals("Eastern"))
					{
						userHour = userHour + 4;
					}
				if(userZone.equals("Alaska") && userZoneTo.equals("Hawaii"))
					{
						userHour = userHour - 1;
					}
				if(userZone.equals("Alaska") && userZoneTo.equals("Pacific"))
					{
						userHour = userHour + 1;
					}
				
				
				
				System.out.println("The military time in the " + userZoneTo + " time zone is " + userHour + ":" + userMins + ".");
			}

	}
