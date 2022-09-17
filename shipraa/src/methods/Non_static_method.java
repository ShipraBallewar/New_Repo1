package methods;

public class Non_static_method
{
   public void Z1()
   {
	   System.out.println("Non static method is running");
   }
   
   public static void main(String[] args)
   {
	   Non_static_method obj=new Non_static_method();
	   
	   obj.Z1();
			   
   }
	   
   
   
}

