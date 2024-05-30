package PackageAndModifiers.employeePackage;
import PackageAndModifiers.mainPackage.*;

public class EmployeeInfo 
{
	static MainProgram main = new MainProgram();
	
	
	public static void display_Employee()
	{
		if(main.ctrl == 1)
		{
			System.out.println("EMPLOYEE DETAILS");	
			System.out.println("Employee Name: " + main.matrix[0][7]);
			System.out.println("Designation: " + main.matrix[0][8]);
			System.out.println("Academic Position: " + main.matrix[0][9]);
		}
		
		else if(main.ctrl == 2)
		{
			System.out.println("EMPLOYEE DETAILS");	
			System.out.println("Employee Name: " + main.matrix[1][7]);
			System.out.println("Designation: " + main.matrix[1][8]);
			System.out.println("Academic Position: " + main.matrix[1][9]);	
		}

	}
	
}

