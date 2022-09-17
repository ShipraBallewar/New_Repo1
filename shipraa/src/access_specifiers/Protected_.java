package access_specifiers;

public class Protected_
{
// scope of protected method remains within the package but it can also be used in other packages/class with the help of inheritance
	
	static int ABC= 22;
	String Z="Helllooooo";
	
	protected static  void m1()
	{
		int F=3;
		System.out.println("Value of F ="+ F);
    }
	
	protected void m2()
	{
	System.out.println("Value of ABC ="+ this.ABC);
	}
	
	protected void m3()
	{
		System.out.println(this.Z);
	}
	  
}
