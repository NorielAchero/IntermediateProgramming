package interProg_fileHandling_AcheroBSCS2;
import java.io.File;


public class Attributes// Noriel Achero | 1 BSCS 2
{

	public static void main(String[] args) 
	{
		File file = new File("src/Attributes.java"); // Initializes the file
		System.out.println("exist: " + file.exists());// Prints "exist: false" false because the file doesn't exists
		System.out.println("path: " + file.getPath());// Prints "path: src\Attributes.java" which returns the value of the Path of the given file 
		System.out.println("length: " + file.length()); // Prints 0 since the file does not exist at all. Length specifies the file size using bytes.
		System.out.println("Directory: " + file.isDirectory());// Prints "length: false," which returned false because the input is not a directory (Also it does not exists)
		System.out.println("isFile: " + file.isFile()); // Prints "isFile: false," which returned false because the input is not a file (Also it does not exists)
		System.out.println("canRead: " + file.canRead()); // Prints "canRead: false," which returned false because the input cannot be read by the application (Also it does not exists)
		
		System.out.println("\n");

		// The reason why most of the methods returned false because it was pointed to a directory where the file does not exists.
		// So here is another try of the same methods but the file is pointed to the directory with a file that exists.
		
		
		File file2 = new File("src/interProg_fileHandling_AcheroBSCS2/Attributes.java"); // Initializes the file
		System.out.println("exist: " + file2.exists());// Prints "exist: true" true because the file now exists.
		System.out.println("path: " + file2.getPath());// Prints "path: src/interProg_fileHandling_AcheroBSCS2/Attributes.java" which returns the value of the Path of the given file 
		System.out.println("length: " + file2.length()); // Prints 2239 since the file exist at all. Length specifies the file size using bytes.
		System.out.println("Directory: " + file2.isDirectory()); // Prints "length: false," which returned false because the input is not a directory.
		System.out.println("isFile: " + file2.isFile()); // Prints "isFile: true," which returned true because the input is a file (Attributes.java)
		System.out.println("canRead: " + file2.canRead()); // Prints "canRead: true," which returned true because the file is readable by the application. 
	}

}
