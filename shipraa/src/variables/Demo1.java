package variables;

public class Demo1 
{
     static int xyz=200;
     static int abc=50;
     int value =55;
     public static void m1()
     {
		
    	 System.out.println("The value of xyz="+xyz);
    	 System.out.println("=================");
     }
     
     
     public void m2()
     {
    	 System.out.println("Value of abc="+abc);
    	
     }
     
     public static void main(String[] args)
     {
		  System.out.println("Hellloooo");
		
		  m1();
		  
		  Demo1 v1= new Demo1();
		     v1.m2();
		  
		   int XYZ = Demo2.ABC;
		   System.out.println(XYZ);
		
	}
}