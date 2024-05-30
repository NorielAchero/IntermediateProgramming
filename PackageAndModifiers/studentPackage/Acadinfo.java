package PackageAndModifiers.studentPackage;
import PackageAndModifiers.mainPackage.*;
import java.text.DecimalFormat;

public class Acadinfo 
{	
	
	static MainProgram main = new MainProgram();
	static DecimalFormat dec = new DecimalFormat("#,###,###.00");
	static double ave1;
	static double ave2;
	static double sum1;
	static double sum2;
	
	public static void AcadInfo()
	{
		
		double quiz1_1 = Double.parseDouble(main.matrix[0][11]);
		double quiz2_1 = Double.parseDouble(main.matrix[0][12]);
		double midterm_1 = Double.parseDouble(main.matrix[0][13]);
		double finals_1 = Double.parseDouble(main.matrix[0][14]);
		
		double quiz1_2 = Double.parseDouble(main.matrix[1][11]);
		double quiz2_2 = Double.parseDouble(main.matrix[1][12]);
		double midterm_2 = Double.parseDouble(main.matrix[1][13]);
		double finals_2 = Double.parseDouble(main.matrix[1][14]);
		
		
		
		sum1 = quiz1_1 + quiz2_1 + midterm_1 + finals_1;
		ave1 = sum1 / 4;
		
		sum2 = quiz1_2 + quiz2_2 + midterm_2 + finals_2;
		ave2 = sum2 / 4;
	
		
	}	
	
	public static void displayEducDetails()
	{
		AcadInfo();
		
		if(main.ctrl == 1)
		{
			System.out.println("STUDENT EDUCATIONAL DETAILS");
			
			System.out.println("Student Number: " + main.matrix[0][10]);
			System.out.println("Student Grade Average: " + dec.format(ave1));
			System.out.println("Student Attendance(0-100%): " + main.matrix[0][15] + "%");
		}
		
		else if(main.ctrl == 2)
		{
			System.out.println("STUDENT EDUCATIONAL DETAILS");
			
			System.out.println("Student Number: " + main.matrix[1][10]);
			System.out.println("Student Grade Average: " + dec.format(ave2));
			System.out.println("Student Attendance(0-100%): " + main.matrix[1][15] + "%");
		}
	}	
}
