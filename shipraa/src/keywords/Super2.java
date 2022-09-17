package keywords;

public class Super2 extends Super1
{
  public void m1()
  {
	  String l="Helllo";
  System.out.println("value of integer ABC="+ super.XYZ);
  System.out.println(l);
 }
  
  public void m2()
  {
	  System.out.println("Character="+ super.ABC);
	  System.out.println("Decimal value of F="+super.F);
  }
  
  public static void main(String[] args)
  {
	Super2 o1= new Super2();
	  o1.m1();
	  
	 System.out.println("Main method");
	 
	 Super2 o2 = new Super2();
	 o2.m2();
}
  
  
  
  }
