package generalization_interface;

public class Test_Class 
{
   public static void main(String []args)
   {
	   Airtel o1=new Airtel();
	   o1.Calling();
	   o1.Internet();
	   o1.Messaging();
	   o1.Hotstar();
	   
	   System.out.println("==========");
	   
	   Jio o2=new Jio();
	   o2.Calling();
	   o2.Internet();
	   o2.Messaging();
	   o2.Jio_Saavan();
	   
	   System.out.println("==========");
	   
	   Idea o3=new Idea();
	   o3.Calling();
	   o3.Internet();
	   o3.Messaging();
	   o3.Hungama_music();
	   
   }
}
