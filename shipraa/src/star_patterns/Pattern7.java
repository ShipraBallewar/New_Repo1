package star_patterns;

public class Pattern7
{
  public static void main(String[] args) 
  {
	  //1 2 3 4 5
	  //1 2 3 4
	  //1 2 3
	  //1 2
	  //1
	  
	  
	  int n=5;
	  int m=5;
	  
	  for(int i=1;i<=n;i++)
	  {
		  for(int j=1;j<=m;j++)
		  {
			 System.out.print(j+" "); 
		  }
		  System.out.println();
		  m--;
	  }
}
}
