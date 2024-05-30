package PackageAndModifiers.studentPackage;
import PackageAndModifiers.mainPackage.*;

public class StudentInfo 
{
	static MainProgram main = new MainProgram();
	
	static String [][] stuInfo = new String [2][7];
	
	public static void Studentinfo()
	{
		for(int i = 0; i <= 1; i++)
		{
			for(int j = 0; j <= 6; j++)
			{
				stuInfo [i][j] = main.matrix[i][j];
			}
		}
	}
	
	public static void display_student()
	{
		if(main.ctrl == 1)
		{
			System.out.println("STUDENT DETAILS");
			
			System.out.println("Student Name: " + stuInfo[0][0]);
			System.out.println("Student Age: " + stuInfo[0][1]);
			System.out.println("Student Gender: " + stuInfo[0][2]);
			System.out.println("Student Address: " + stuInfo[0][3]);
			System.out.println("Contact Number: " + stuInfo[0][4]);
			System.out.println("Father's Name: " + stuInfo[0][5]);
			System.out.println("Mother's Name: " + stuInfo[0][6]);
		}
		
		else if(main.ctrl == 2)
		{
			System.out.println("STUDENT DETAILS");
			
			System.out.println("Student Name: " + stuInfo[1][0]);
			System.out.println("Student Age: " + stuInfo[1][1]);
			System.out.println("Student Gender: " + stuInfo[1][2]);
			System.out.println("Student Address: " + stuInfo[1][3]);
			System.out.println("Contact Number: " + stuInfo[1][4]);
			System.out.println("Father's Name: " + stuInfo[1][5]);
			System.out.println("Mother's Name: " + stuInfo[1][6]);
		}
	}
	
	
}
