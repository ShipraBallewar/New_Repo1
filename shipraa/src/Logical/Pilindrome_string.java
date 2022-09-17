package Logical;

public class Pilindrome_string {

	
	public static void main(String[] args) {
		
		String str= "NITIN";
		String newvalue="";
		 
		StringBuffer sb= new StringBuffer(str);
		
		System.out.println(sb.reverse());
		 
		String org= sb.toString();
		
		if(org.equalsIgnoreCase(str))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	    
		System.out.println("==============");
		
	
		
		for(int i=str.length()-1;i>=0;i--)
		{
			newvalue=newvalue+ str.charAt(i);
		}	
			if(newvalue.equals(str))
			{
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
		
	}
}
