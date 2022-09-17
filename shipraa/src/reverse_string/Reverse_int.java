package reverse_string;

public class Reverse_int {


	public static void main(String[] args) {
	
	
		int ab=123456;
		 
		String str = Integer.toString(ab);
		String rev ="";
		
		for(int i=str.length()-1; i>=0;i--)
		{
			rev= rev+str.charAt(i);
		}
		System.out.print(rev);
}
}