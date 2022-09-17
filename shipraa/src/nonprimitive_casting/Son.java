package nonprimitive_casting;

public class Son extends Father

{
     public void Phone()
     {
    	 System.out.println("Phone Recharged");
     }
     
     public void Bike() 
     {
    	 System.out.println("Half petrol used");
     }
     
     public void Money()
     {
    	 System.out.println("200 left");
     }
     
     public void Sons_money()
     {
    	 System.out.println("700");
     }
     
     public void Mobile()
     {
    	 System.out.println("Samsung");
     }
     
     public static void main(String[] args)
     {
		Father o1=new Son();
		o1.Money();
		o1.Phone();
		o1.Bike();
		
	}
}
