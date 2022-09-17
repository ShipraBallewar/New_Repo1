package constructor;

public class Sample3  
{
	Sample3(int a, int b)
	{
		System.out.println("Multiplication od a & b is="+(a*b));
	}
   public static void main(String[] args)
   {
     Sample2 F1=new Sample2();
     
     Sample2 F2=new Sample2(12,52,66);
     
     Sample1 F3=new Sample1("hheelllloo");
     
     Sample3 F4=new Sample3(71, 20);
     
     Sample2 F5=new Sample2(502,62,3,7);
     
     Sample2 F6=new Sample2("Hey", "How are you?", "byeee");
     
     Sample1 F7=new Sample1(5555,151);
}
}
