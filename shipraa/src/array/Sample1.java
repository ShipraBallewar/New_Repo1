package array;

public class Sample1
{     
    //10  20
   //30  40
	 
	
	public static void main(String[] args)
	{
		
	       int Ar[] []= new int [2][2];
	       
	       Ar[0][0]=10;
	       Ar[0][1]=20;
	       Ar[1][1]=40;
	       Ar[1][0]=30;  
	       
	       
	       for(int i=0;i<=1;i++)
	       {
	    	   for(int j=0;j<=1;j++)
	    	   {
	    		   System.out.print(Ar[i][j] +" ");
	    	   }
	    	   System.out.println();
	       }
	
	
}
}