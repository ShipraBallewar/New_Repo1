package array;

public class Demo2
{
    public static void main(String[] args) 
    {
		
    	int ar[]=new int [10];
    	
    	ar[0]=123;
    	ar[1]=504;
    	ar[3]=13;
    	ar[4]=110;
    	ar[6]=453;
    	ar[5]=23;
    	ar[7]=97;
    	ar[8]=101;
    	ar[9]=311;
    	
    	int size = ar.length;
    	System.out.println(size);
    
    	System.out.println(ar[5]);
    	System.out.println(ar[9]);
    	
    	for(int i=0;i<=ar.length-1;i++)
    	{
    		System.out.println(ar[i]);
    	}
    	
    	
	}
}
