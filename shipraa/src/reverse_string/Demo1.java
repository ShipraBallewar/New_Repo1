package reverse_string;

public class Demo1 {

	public static void main(String[] args) {
		
		
		String A= "Shipra Ballewar";
		
		int size = A.length();
	
		//String reverse = "";
		
		
	
		for(int i= size-1;i>=0;i--)
		{
			 System.out.print(A.charAt(i));
			//reverse= reverse + A.charAt(i);
		}
      //     System.out.println(reverse);
	}

}
