package abstract_class;

public class Demo2 extends Demo1
{
   public void m1()
   {
	   System.out.println("Method m1 is running");
   }
   public void m3()
   {
	   System.out.println("Method m3 is running");
   }
   
   public static void main(String[] args)
   {
	Demo2 o1= new Demo2();
	o1.m1();
	Demo1.m2();
	o1.m3();
}
}
