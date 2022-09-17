package constructor;

public class Sample2 
{
  Sample2()
  {
	  System.out.println("First constructor is running");
  }
  Sample2(int x, int y, int z)
  {
	  int w=x+y+z;
	System.out.println("Second constructor is running"+w);
  }
  Sample2(int o, int k, int t,int d)
  {
	  int A=t-o+k-d;
	  
	 System.out.println("Sum of the all variables is ="+A);
	  
  }
   Sample2(String a, String b, String c)
   {
	  System.out.println(a+b+c); 
   }
}
