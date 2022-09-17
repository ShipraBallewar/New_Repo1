package parameters;

public class Result
{
    public static void main(String[] args)      //static method
    {
	StaticMethod.R1(77, 103);
		
		  StaticMethod.D2(21, 78, 45, 11);
		
		  StaticMethod.S3(841, 654, 12);
		
		
    NonstaticMethod R1=new  NonstaticMethod();          //Non static method
		 
		  R1.M1(606, 111);
		 
		  R1.S4("Hello", "Good Morning"," Have a nice day");
		
	NonStaticmethod2 L1=new NonStaticmethod2();
	
	      L1.A1(2, 333);
	      L1.A2("This method is running from different class");
			
	}
		
	
}
