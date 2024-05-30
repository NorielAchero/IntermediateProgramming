package interProg_ObjectMethods_AcheroBSCS2;

public class Main 
{

	public static void main(String[] args) 
	{
		Author author1 = new Author("Noriel", "asdasd", "Transginger");
		author1.print();
			
		Book bk1 = new Book("Java Book", author1, + -99, -1);
		bk1.print();
		
		author1.setEmail("cuscusgmail.com");
		
		author1.print();
		bk1.print();
		
		bk1.getAuthor().setEmail("norielachero@neu.edu.ph");
		bk1.print();
		
		System.out.println();

	}

}
