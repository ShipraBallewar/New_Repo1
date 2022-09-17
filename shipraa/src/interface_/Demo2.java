package interface_;

public class Demo2 implements Demo1
{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("Method m1 is running");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("Method m2 is running");
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("Method m4 id running");
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		System.out.println("Method m4 is running");
	}
  
	public static void main(String[] args) 
	{
		Demo2 o1 = new Demo2();
		o1.m1();
		o1.m2();
		o1.m3();
		o1.m4();
	
	}
}
