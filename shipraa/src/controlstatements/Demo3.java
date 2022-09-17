package controlstatements;

public class Demo3 
{
    // else_if
	public static void main(String[] args) 
	{
		int Age=16;
		
		  if(Age<=5)
		  {
			  System.out.println("Toddler");
		  }
		  else if(Age<=8)
		  {
			  System.out.println("Early childhood");
		  }
		  else if(Age<=11)
		  {
			  System.out.println("Childhood");
		  }
		  else if(Age<=18)
		  {
			  System.out.println("Teenager");	 
		  }
		  else if(Age<=50)
		  {
			  System.out.println("Adulthood");
		  }
		  else if(Age>50)
		  {
			  System.out.println("Oldage");
		  }
	}
}

	
