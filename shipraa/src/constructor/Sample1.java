package constructor;

public class Sample1 
{
   Sample1()
   
   {
	   int a=14;
	   int b=20;
	   int c=a+b;
	   
	 System.out.println(c);
   }
   Sample1(String a)
   {
	   System.out.println(a);
   }
  public static void main(String[] args)  
  {
	  Sample1 o1=new Sample1();
	  
	  Sample1 o2=new Sample1("hello");
	  
	  Sample1 o3=new Sample1(424242,505,96);
} 
  Sample1(int a, int b)
  {
	  System.out.println("Division of a & b is"+(a/b));
  } 
  Sample1(int x,int y, int z)
  {
	  System.out.println("Difference of all the variable is=" +(z-x-y));
  }
}
