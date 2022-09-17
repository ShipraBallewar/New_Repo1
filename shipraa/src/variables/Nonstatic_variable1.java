package variables;

public class Nonstatic_variable1 
{

	int abc=10;
	
	public void m1()
	{
		System.out.println(abc);
		System.out.println(this.abc);
	}
	
	
	
	public static void main(String[] args)
	{
		Nonstatic_variable1 o1=new Nonstatic_variable1();
		o1.m1();
		
		Demo1 o2= new Demo1();
		int value = o2.value;
		
		System.out.println(value);
	}
	
	
	
	
}
