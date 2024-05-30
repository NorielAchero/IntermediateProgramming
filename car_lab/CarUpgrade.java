package car_lab;
import java.util.*;

public class CarUpgrade 
{

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		
		boolean ctrl = true;
		
		while(ctrl)
		{
			
			prln("Car Upgrade System by Noriel Achero\n");
			
			pr("Input Owner Name: ");
			Car.ownerName = scan.next();
			
			pr("Input Year Model: ");
			Car.yearModel = scan.nextInt();
			
			pr("Input Available Amount/Budget: ");
			Car.amountBudget = scan.nextInt();
			
			int rem = Car.upgradeAccesories(Car.amountBudget);
			
			prln("\nOwner: " + Car.ownerName);
			prln("Year Model: " + Car.yearModel);
			prln("Available Amount Before Upgrade: $" + Car.amountBudget);
			prln("Installed AC: " + Car.AC);
			prln("Installed Leather Seats: " + Car.leatherSeats);
			prln("Installed Back Wipers: " + Car.backWipers);
			prln("Installed Fog Lights: " + Car.fogLights);
			prln("Amount Remaining After Upgrade: $" + rem);
			
			
			pr("\n\nDo you want to upgrade again? [Y/N] ");
			char restart = scan.next().charAt(0);
			
			if(restart == 'Y' || restart == 'y')
			{
				ctrl = true;
			}
			else if(restart == 'N' || restart == 'n')
			{
				ctrl = false;
			}
			
			prln("");
		}
		
		
	}
	
	
	static void pr(String print)
	{
		System.out.print(print);
	}
	
	static void prln(String print)
	{
		System.out.println(print);
	}

}
