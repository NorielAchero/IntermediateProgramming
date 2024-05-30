package objectLabActivity;
import java.text.DecimalFormat;
import java.util.*;

public class Account 
{
	public static DecimalFormat dec = new DecimalFormat("#,###,###.00");
	public static Scanner scan = new Scanner (System.in);
	public static double acc1 = 150.00;
	public static double acc2 = 500.53;
	
	public static void debit()
	{
		prln("account1 balance: $" + dec.format(acc1));
		prln("account2 balance: $" + dec.format(acc2));
		
		prln("");
		
		pr("Enter withdrawal amount for account1: ");
		double with1 = scan.nextDouble();
		
		prln("\nSubtracting " + dec.format(with1) + " account1 balance");
		
		if(with1 > acc1)
		{
			prln("Debit Amount exceed account balance.");
		}
		else
		{
			acc1 = acc1-with1;
		}
		
		prln("account1 balance: $" + dec.format(acc1));
		prln("account2 balance: $" + dec.format(acc2));
		
		
		pr("\nEnter withdrawal amount for account2: ");
		double with2 = scan.nextDouble();
		
		prln("\nSubtracting " + dec.format(with2) + " account2 balance");
		
		if(with2 > acc2)
		{
			prln("Debit Amount exceed account balance.");
		}
		else
		{
			acc2 = acc2-with2;
		}
		
		prln("account1 balance: $" + dec.format(acc1));
		prln("account2 balance: $" + dec.format(acc2));
	}
	
	
	public static void pr(String print)
	{
		System.out.print(print);
	}
	
	public static void prln(String print)
	{
		System.out.println(print);
	}
	
	
	
	

}
