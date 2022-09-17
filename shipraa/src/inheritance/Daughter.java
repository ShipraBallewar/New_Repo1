package inheritance;

public class Daughter extends Father
{
   public static void main(String[] args)
   {
	  Daughter o1= new Daughter();
	  o1.money();
	  o1.farm();
	  
	  house();
	  car();
}
   
   public void property()
   {
	   System.out.println("property");  
   }
   public void plot()
   {
	   System.out.println("5 plots");
   }
}
