package Polymorphism;

public class Overloadingmethod2 extends Overloadingmethod
{
    public static void main(String[] args)
    {
    	Overloadingmethod o1=new Overloadingmethod();
    	o1.m1();
    	o1.m1(21);
    	o1.m1(14, 2);
    	o1.m1(4, 1, 99);
    	o1.m1(4.5f);
    	
    	Overloadingmethod2 o2=new Overloadingmethod2();
         o2.m2();
         }	
    	public void m2()
    	{
    		System.out.println("value of a="+super.a);
    	}
	
}
