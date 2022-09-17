package keywords;

public class This    //use to access global variable from same class
{
     int value= 50;
     
     int abc =22;
     
     
     public void m1()
     {
    	 int value= 20;
    	 System.out.println(value);
    	System.out.println(this.value);
     }
     
     public void m2()
     {
    	 
    	 System.out.println(this.abc);
     }
     
     public static void main(String[] args) 
     {
    	
          This o1 = new This();
          o1.m1();
          
          This o2= new This();
          o2.m2();
	}
     
 
}
