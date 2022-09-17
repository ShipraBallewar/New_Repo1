package Logical;

public class BusCar {

	public static void main(String[] args) {
	
		//1 to 100
		//no/3 bus 
		//no/5 car
		//no/[3&5] BusCar
		
		for(int i=1;i<=100;i++)
		{
			if((i%3==0) || (i%5==0) ||(i%3==0) && (i%5==0))
			{
				if((i%3==0) && (i%5==0))
				{
					System.out.println(i+"===" + "BusCar");
				}
				
				else if (i%3==0)
				{
					System.out.println(i+"=="+"Bus");
				}
				
				else if(i%5==0)
				{
					System.out.println(i+"=="+ "Car");
				}
			}
		}

	}

}
