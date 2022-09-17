package access_specifiers;

public class Public_ 
{
	int Z=23;
	float F=222.22f;
	static int W=6;
	
	
	
    public  void m2() 
    {
    	System.out.println(Z);
    }
    
    public void m1() 
    {
    	System.out.println(F);
    }
    
    public static void m3()
    {
    	System.out.println(W);
    	
    	System.out.println("This method is running in different package");
    }
}
