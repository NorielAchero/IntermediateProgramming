package interProg_ObjectMethods_AcheroBSCS2;

public class Author 
{
	private String AuthorName;
	private String AuthorEmail;
	private String AuthorGender;
	
	Author(String AuthorName, String AuthorEmail, String AuthorGender)
	{
		this.AuthorName = AuthorName;
		this.AuthorEmail = AuthorEmail;
		this.AuthorGender = AuthorGender;
		
	}
	
	public void print()
	{
		genderValidator(this.AuthorGender);
		emailValidator(this.AuthorEmail);
		System.out.println("AUTHOR: " + AuthorName);
		System.out.println("GENDER: " + AuthorGender);
		System.out.println("E-MAIL: " + AuthorEmail);
		System.out.println();
	}
	
	
	public void setEmail(String newEmail)
	{
		if(newEmail.contains("@"))
		{
			this.AuthorEmail = newEmail;
		}

		else
		{
			this.AuthorEmail = "";
			System.out.println("Invalid email! Set to empty string");
		}
	}
	
	public void genderValidator(String gender)
	{
		if(gender == "Unknown" || gender == "Male" || gender == "MALE" || gender == "male" || gender == "Female" || gender == "FEMALE" || gender == "female")
		{
			this.AuthorGender = gender;
		}
		else
		{
			System.out.println("Invalid gender! Set to unknown.");
			this.AuthorGender = "Unknown";
		}
	}
	
	public void emailValidator(String email)
	{
		if(email.contains("@") || email == "")
		{
			this.AuthorEmail = email;
		}
		else
		{
			this.AuthorEmail = "";
			System.out.println("Invalid email! Set to empty string");
		}
	}
	
	
}
