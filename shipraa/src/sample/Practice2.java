package sample;

public class Practice2 
{
	public static void main(String[] args)
	{
		int a=52;
		int b=65;
		int c=a+b;
		  System.out.println("Sum of a&b is="+c);
		
		  S1("Java is very tough ");
		  Q2(10,25);
	     
	 Practice2 obj=new Practice2();
	   obj.S2(80, 50, 13);
	   
	 Practice2 obj2=new Practice2();
	 
	 
	 
	}
	
	public static void S1(String h)
	{
		System.out.println(h);
	}
	public static void Q2(int x, int y)
	{
		int z=x*y;
	     System.out.println(z);
	}
		
	public void S2(int s, int d, int g)
	{
		int w=s-g+d;
		System.out.println("sum of all the variables is="+w);
	} 
	
	Practice2()
	{
		int a=77;
		int s=50;
		int c=a+s;
		
		System.out.println(c);
	}
}


