package interProg_fileHandling_AcheroBSCS2;
import java.io.*;

public class OutputFile 
{
	   public static void main(String args[])
	   {
		  
		   try
		   {
			  append(); 
			         
		      File originalFile = new File("../interProg_fileHandling_AcheroBSCS2/src/interProg_fileHandling_AcheroBSCS2/SampleText.txt");
		      File outputFile = new File("../interProg_fileHandling_AcheroBSCS2/src/interProg_fileHandling_AcheroBSCS2/OutputFile.txt");
		      FileWriter filePrinter = new FileWriter(outputFile);	
		      
		      FileInputStream input = new FileInputStream(originalFile);
		      
		      byte[]bArr = new byte[(int)originalFile.length()];
		      input.read(bArr);
		      
		      String s = new String(bArr);
		      
		      String[]words = s.split(" ");
		      
		      for(int i = 0; i < words.length; i++)
		      {
		    	  System.out.println(words[i] + " " + (i+1));
		      }
		      
		      System.out.println("Length is " + originalFile.length() + " bytes");
		      System.out.println("The path of file is " + originalFile.getPath());
		      System.out.println("Word count is " + words.length);
		      
		      filePrinter.write("Length is " + originalFile.length() + " bytes");
		      filePrinter.write("\nThe path of file is " + originalFile.getPath());
		      filePrinter.write("\nWord count is " + words.length);
		      
		      filePrinter.close();
		   }
		   catch(Exception e)
		   {
			   System.out.println("Error, please restart the program. ");
		   }
	   }
	   
	   public static void append()
	   {
		   String textToAppend = "This little light of mine, I’m gonna let it shine";


		   try(FileWriter fileWriter = new FileWriter("../interProg_fileHandling_AcheroBSCS2/src/interProg_fileHandling_AcheroBSCS2/SampleText.txt", true);
		   PrintWriter printWriter = new PrintWriter(fileWriter);) 
		   {
		     
		     printWriter.println("\n" + textToAppend);
		   }
		   catch(Exception e)
		   {
			   System.out.println("Error, please restart the program. ");
		   }
	   }
	   
}
