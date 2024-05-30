package interProg_fileHandling_AcheroBSCS2;
import java.io.*;
import java.util.Scanner;

public class FileHandlingTheJourney 
{

	public static void main(String[] args) 
	{
		try
		{
			File fileKo = new File ("src/SampleText.txt");
			Scanner reader = new Scanner (fileKo);
			
			while (reader.hasNextLine())
			{
				String data = reader.nextLine();
				System.out.println(data);
			}
			reader.close();
		}
		catch (FileNotFoundException e)
		{
			System.out.println("An error occured");
		}
	}

}




//String fileName = "SampleText";
//
//try
//{
//	File fileKo = new File(fileName);
//	if(fileKo.createNewFile())
//	{
//		FileWriter printer = new FileWriter(fileName);	
//		
//		System.out.println("The journey of a thousand miles begins with a single step");
//		printer.write("The journey of a thousand miles begins with a single step");
//		
//		printer.close();
//	}
//}
//catch(IOException e)
//{
//	System.out.println("Error in Handling Files. Please restart the program.");
//	e.printStackTrace();
//	System.exit(0);
//}