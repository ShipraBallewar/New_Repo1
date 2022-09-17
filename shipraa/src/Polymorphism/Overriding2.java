package Polymorphism;

public class Overriding2 extends Overriding
{

	@Override
	void m2() {
		// TODO Auto-generated method stub
		System.out.println("Method m2 is running");
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("Method m3 is running");
	}

	public static void main(String[] args) 
	{
		Overriding2 o1=new Overriding2();
		o1.m1();
		o1.m2();
		o1.m3();
	}
}
