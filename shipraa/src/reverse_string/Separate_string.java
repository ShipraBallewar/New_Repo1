package reverse_string;

public class Separate_string 
{
    public static void main(String[] args) 
    {
		String str="shipra1+6454$$% Ballewar12###%&(";
		
		for(int i=0;i<=str.length()-1;i++)
		{
			if(Character.isAlphabetic(str.charAt(i)) || (Character.isSpaceChar(str.charAt(i))))
			{
				System.out.print(str.charAt(i));
			}
		
		}
		
		
		System.out.println("========================");
		
		for(int i=0;i<=str.length()-1;i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				System.out.print(str.charAt(i));
			}
			
		}
	}
}
