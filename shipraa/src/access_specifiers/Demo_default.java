package access_specifiers;

public class Demo_default extends Default_
{
    public static void main(String[] args)
    {
		 Default_ o1=new Default_();
		 o1.m2();
		 
		 Default_.m1();
		 
		 Demo_default o2=new  Demo_default();
		 o2.m3();
		 
	}
    
    public void m3()
    {
    	System.out.println(super.L);
    }
}
