package string;

public class Function 
{
      public static void main(String[] args)
      {
		//string can be used in 2 ways:
        //using keyword
        //without using keyword
    	  
    	  String abc ="Hello";
    			  
    	  String ABC=new String ("HELLO");
    	  
    	  System.out.println(ABC);
    	  System.out.println(abc);
    	  System.out.println("=============");
    	  
    	  String A="Java";
    	  String B="Java is secured";
    	  String C="Java is platform independent";
    	  String D="Java is object oriented programming languauge";
    	  
    	  //1. Length--to identify the length of string
    	  
    	  int Size=A.length();
    	  System.out.println(Size);
    	  System.out.println(B.length());
    	  System.out.println(C.length());
    	  System.out.println(D.length());
    	  System.out.println("=============");
    	  
    	  //2. Uppercase--Use to convert character to uppercase
    	  
    	  String Upr=A.toUpperCase();
    	  System.out.println(Upr);
    	  System.out.println(B.toUpperCase());
    	  System.out.println(C.toUpperCase()); 
    	  System.out.println(D.toUpperCase());
    	  System.out.println("============");
    	  
    	  //3. Lowercase--Use to convert character to lowercase
    	  
    	  String Low=A.toLowerCase();
    	  System.out.println(Low);
    	  System.out.println(B.toLowerCase());
    	  System.out.println(C.toLowerCase());
    	  System.out.println(D.toLowerCase());
    	  System.out.println("============");
    	  
    	  //4. Starts with--it shows String starts with which character(Boolean)
    	  
    	  boolean str=A.startsWith("Ja");
    	  System.out.println(str);
    	  System.out.println(B.startsWith("java"));
    	  System.out.println(C.startsWith("jAva"));
    	  System.out.println(D.startsWith("Hava"));
    	  System.out.println("============");
    	  
    	  //5.Ends with--its shows String ends with which character(boolean)
    	  
    	  boolean end=A.endsWith("va");
    	  System.out.println(end);
    	  System.out.println(B.endsWith("cured"));
    	  System.out.println(C.endsWith("Dent"));
    	  System.out.println(D.endsWith("e"));
    	  System.out.println("===========");
    	  
    	  //6.Equal--Used to compare two Strings (boolean)
    	  
    	  boolean comp=A.equals(C);
    	  System.out.println(comp);
    	  System.out.println(B.equals(D));
    	  System.out.println(C.equals("Java is platform independent"));
    	  System.out.println(D.equals(A));
    	  System.out.println("===========");
    	  
    	  //7.Equal Ignore Case
    	  
    	  boolean xyz=A.equalsIgnoreCase(D);
    	  System.out.println(xyz);
    	  System.out.println(A.equalsIgnoreCase("Java"));
    	  
    	  
    	  
    	  
    	  
	}
      
}
