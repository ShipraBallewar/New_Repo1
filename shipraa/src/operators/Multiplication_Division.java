package operators;

public class Multiplication_Division
{
	public void Multiplication()
	{
		int p=136;
		int q=515;
		int r=p*q;
		
		System.out.println("Multiplication of p & q is:"+ r);
	}
	
	public void Division()
	{
		int j=8080;
		int k=60;
		int l=j/k;
		
		System.out.println("Division of j & k is:"+l);
	}
      
	public static void main(String []args)
	{
		Multiplication_Division Result=new Multiplication_Division();
		
		Result.Multiplication();
		Result.Division();
	}
}
