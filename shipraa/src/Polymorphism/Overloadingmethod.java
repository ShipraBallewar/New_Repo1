package Polymorphism;

public class Overloadingmethod
{
	// same method name with different arguments
	int a= 11;
    public void  m1()
    {
    	System.out.println( "Method m1 is running without parameters");
    }
    public void m1(int x)
    {
    	System.out.println( "Method m1 is running with one parameters");
    	System.out.println(x);
    }
    public void m1(int x, int y)
    {
    	System.out.println( "Method m1 is running with two parameters");
    	System.out.println(x+y);
    }
    public void  m1(int x ,int y, int z)
    {
    	System.out.println( "Method m1 is running with three parameters");
    	System.out.println(x+y-z);
    }
    public void m1(float w)
    
    {
    	System.out.println(w);
    }
}

