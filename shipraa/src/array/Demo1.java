package array;

public class Demo1
{
   public static void main(String[] args)
   {
	
	   String ar[]=new String[5];
	   
	   ar[0]="Hii";
	   ar[1]="Hello";
	   ar[2]="PQR";	
	   ar[3]="ABCD";
	   ar[4]="XYZ";
			   	  
	   int size =ar.length;
	   System.out.println(size);
	   System.out.println(ar[0].length());
	   
	   System.out.println(ar[4]);
	   
	   for(int i=0; i<=ar.length-1; i++)
	   {
		   System.out.println(ar[i]);
	   }
}
}
