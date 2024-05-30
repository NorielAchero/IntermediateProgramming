package interProg_ObjectMethods_AcheroBSCS2;

public class Book 
{
	String name;
	String email;
	String gender;
	
	private String bookTitle;
	private Author author = new Author(name, email, gender);
	private double price;
	private int stock = 0;
	
	Book(String bookTitle, Author author, double price, int stock)
	{
		this.bookTitle = bookTitle;
		this.author = author;
		this.price = price;
		this.stock = stock;
	}
	
	public Author getAuthor()
	{
		return author;
	}
	
	public void setAuthor(Author author)
	{
		this.author = author;
	}
	
	public void print()
	{
		priceValidator(this.price);
		stockValidator(this.stock);
		System.out.println("Book Title: " + bookTitle);
		author.print();
		
	}
	
	public String getAuthorName(Author author)
	{
		return name;
	}
	
	public void priceValidator(double price)
	{
		if(price < 0)
		{
			System.out.println("Note: Price should be positive! Set to 0");
			this.price = 0;
		}
	}
	
	public void stockValidator(int stock)
	{
		if(stock < 0)
		{
			System.out.println("Note: Stocks cannot be negative! Set to 0");
			System.out.println();
			this.stock = 0;
		}
	}
	

	
}
