package star_patterns;

public class Pattern3 
{
	//*
	//**
	//***
	//****
	//*****
	//******
      
	public static void main(String[] args) 
	{
		int star=1;
		
		for(int i=1; i<=6; i++)
		{
			for(int j=1; j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			star++;
		}
		
		System.out.println("===============");
		
		int str=6;
		
		for(int i=1; i<=6;i++) 
		{
			for(int j=6; j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		
	}
}
