package PackageAndModifiers.mainPackage;
import PackageAndModifiers.employeePackage.*;
import PackageAndModifiers.studentPackage.*;
import java.util.*;


public class MainProgram 
{
	static Scanner scan = new Scanner(System.in);
	static StudentInfo stu = new StudentInfo();
	static Acadinfo aca = new Acadinfo();
	static EmployeeInfo emp = new EmployeeInfo();
	
	public static String [][] matrix = new String [2][16];
	public static int  ctrl = 1;
	
	public static void main(String[] args) 
	{
		for(int i = 0; i < 2; i++)
		{
			
		System.out.println("SESSION #" + (i+1) + "\n");
			
		System.out.println("STUDENT DETAILS");
		
		System.out.print("Student Name: ");
		matrix[i][0] = scan.next();
		
		System.out.print("Age: ");
		matrix[i][1] = scan.next();

		System.out.print("Student Gender: ");
		matrix[i][2] = scan.next();

		System.out.print("Student Address: ");
		matrix[i][3] = scan.next();
	
		System.out.print("Contact Number: ");
		matrix[i][4] = scan.next();

		System.out.print("Father's Name: ");
		matrix[i][5] = scan.next();
	
		System.out.print("Mother's Name: ");
		matrix[i][6] = scan.next();
		
		System.out.println();

		System.out.println("EMPLOYEE DETAILS");	
		System.out.print("Employee Name: ");
		matrix[i][7] = scan.next();
		
		System.out.print("Designation: ");
		matrix[i][8] = scan.next();
		
		System.out.print("Academic Position: ");
		matrix[i][9] = scan.next();
		
		System.out.println();
		
		System.out.println("STUDENT EDUCATIONAL DETAILS");
		
		System.out.print("Student Number: ");
		matrix[i][10] = scan.next();
		
		System.out.print("Quiz 1: ");
		matrix[i][11] = scan.next();
		
		System.out.print("Quiz 2: ");
		matrix[i][12] = scan.next();
		
		System.out.print("Midterm: ");
		matrix[i][13] = scan.next();
		
		System.out.print("Finals: ");
		matrix[i][14] = scan.next();
		
		System.out.print("Student Attendance(0-100%): ");
		matrix[i][15] = scan.next();
		
		System.out.println();
		}
		
		
		
		while(ctrl <= 2)
		{
			stu.Studentinfo();
			
			stu.display_student();
			System.out.println();
			
			emp.display_Employee();
			System.out.println();
			
			aca.AcadInfo();
			
			aca.displayEducDetails();
			System.out.println();
			
			if(ctrl == 1)
			{
				System.out.println("Next Student");
				System.out.println();
			}
			ctrl++;
		}
		
		

	}



}
