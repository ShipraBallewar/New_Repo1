package controlstatements;

public class Demo4 
{
   public static void main(String[] args)
   {
	//Nested if
	   
	 String username="virt_kohli";
	 String password="Anushkaa";
	 String pin="020197";
	 String DOB="1002205";
	 
	 if(username=="virat_kohli")
	 {
		 System.out.println("Username is correct");
		 
	 if (password=="Anushkaa")	 
	 {
		 System.out.println("Password is correct");
		 
	 if (pin=="020197")	
	 {
		 System.out.println("Pin is correct");
		 
	 if (DOB=="10022005")	
	 {
		 System.out.println("Date of birth is correct");
	 }
	 else
	 {
		 System.out.println("Date of birth is incorrect");
	 }
	 }
	 else
	 {
		 System.out.println("Pin is incorrect");
	 }
	 }
	 else
	 {
		 System.out.println("Password is incorrect");
	 }
	 }
	 else
	 {
		 System.out.println("Username is incorrect");
		 System.out.println("Login unsuccessful");
	 }
	 
	 
}
}
