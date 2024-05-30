package car_lab;

public class Car 
{
	public static String ownerName;
	public static int yearModel;
	public static int amountBudget;
	public static boolean AC = false;
	public static boolean leatherSeats = false;
	public static boolean backWipers = false;
	public static boolean fogLights = false;
	
	public static void owner()
	{
		ownerName = "";
		yearModel = 0;
	}
	
	public static int upgradeAccesories(int ab)
	{
		AC = false;
		leatherSeats = false;
		backWipers = false;
		fogLights = false;
		

		if(ab >= 45450)
		{
			ab = ab - 45450;
			AC = true;
			leatherSeats = true;
			backWipers = true;
			fogLights = true;
		}
		
		else if(ab >= 42150)
		{
			ab = ab - 42150;
			AC = true;
			leatherSeats = true;
			backWipers = true;
		}
		
		else if(ab >= 35900)
		{
			ab = ab - 35900;
			AC = true;
			leatherSeats = true;
		}
		
		else if(ab >= 21500)
		{
			ab = ab - 21500;
			AC = true;
		}
		
		
		return ab;
	}
	
}

