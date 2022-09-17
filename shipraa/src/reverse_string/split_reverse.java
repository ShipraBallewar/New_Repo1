package reverse_string;

public class split_reverse {

	public static void main(String[] args) {
	
		
		String str= "Shipra Ballewar";
		
		String[] splittedstring = str.split(" ");
		
		System.out.println(splittedstring[0]);
		System.out.println(splittedstring[1]);
		
		for(int i=0;i<=splittedstring.length-1;i++)
		{
			StringBuffer sb = new StringBuffer(splittedstring[i]+" ");
			
			System.out.print(sb.reverse());
		}
		
		
	}

}
