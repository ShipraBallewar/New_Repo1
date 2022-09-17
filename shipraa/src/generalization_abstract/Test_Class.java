package generalization_abstract;

public class Test_Class 
{
  public static void main(String[] args)
  {
	Husky o1=new Husky();
	o1.behaviour();
	o1.Energy();
	o1.Height();
	o1.Size();
	
	System.out.println("=======");
	
	Chuhuahua o2=new Chuhuahua();
	o2.behaviour();
	o2.Energy();
	o2.Height();
	o2.Size();
}
}
