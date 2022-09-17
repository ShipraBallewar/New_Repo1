package access_specifiers;

public class Default_ 
{
    // scope of default method is within the package only
	// No keyword for default
	
	int ab= 5;
	
	long L= 120546986322230002l;
	
	static void m1()
	{
		boolean B= true;
		
		System.out.println("Value of B="+B);
	}
	
	void m2()
	{
		System.out.println("Value of interger ab ="+ this.ab);
	}
	
}
