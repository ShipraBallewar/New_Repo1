package interface_;

public class Demo4 implements Demo3
{
   public static void main(String[] args) 
   {
	Demo4 o1=new Demo4();
	o1.m1();
	o1.m2();
	o1.m3();
	o1.m4();
	o1.xyz();
	o1.abc();
}
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("METHOD  M1 IS RUNNING");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("METHOD M2 IS RUNNING");
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("METHOD M3 IS RUNNING");
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		System.out.println("METHOD M4 IS RUNNING");
	}

	@Override
	public void xyz() {
		// TODO Auto-generated method stub
		System.out.println("METHOD XYZ IS RUNNING");
	}

	@Override
	public void abc() {
		// TODO Auto-generated method stub
		System.out.println("METHOD ABC IS RUNNING");
	}

}
