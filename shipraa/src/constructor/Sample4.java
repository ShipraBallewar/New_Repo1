package constructor;

public class Sample4
{
     public static int a;
     public static int b;
     
     Sample4()
     {
    	 a=40000;
    	 b=6400;
    	 
    	 System.out.println("Constructor is running");
     }
     
     Sample4(int x, int y, int z)
     {
    	 System.out.println(x+y-z);
    	 System.out.println("Constructor is running in different class");
     }
     
     
   public static void main(String[] args)
   {
	   
	Sample4 obj=new Sample4();
	
	int c=a+b;
	
	System.out.println(c);
	
	   
}  
     
     
}
