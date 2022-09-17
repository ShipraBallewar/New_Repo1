package reverse_string;

public class reverse_int_withoutStrring {

	
	public static void main(String[] args) {
		
		int num=12323233;
		
		int rev=0;
		
		while(num>0)
		{
			int rem=num%10;
			
			rev=rev*10+rem;
			
			num=num/10;
			
			//System.out.print(num);
		}
		System.out.println(rev);
	}
}
