package access_specifiers;

 public class Private_ 
{
    //scope is within the class only
	
	
	private void m1()
	{
		int abc= 10;
		System.out.println(abc);
	}
	
	private static void  m2()
	{
		String X="Private Method";
				System.out.println(X);
	}

	public static void main(String[] args) 
	{
		Private_ o1=new Private_ ();
		o1.m1();
		
		m2();
	}
	
	
}
