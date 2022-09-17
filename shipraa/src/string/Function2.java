package string;

public class Function2
{
   public static void main(String[] args)
   {
	   String A="Java";
 	   String B="Java is secured";
 	   String C="Java is platform independent";
 	   String D="Java is object oriented programming languauge";
 	   
 	   //8.Replace--- Used to replace/update the new character
 	   
 	   
 	   //Replace few characters
 	   String new1= A.replace("Ja", "La");
 	   System.out.println(new1);
 	   System.out.println(B.replace("is", "isn't"));	
 	   System.out.println(C.replace("independent", "dependent"));
 	   System.out.println(D.replace("J", "L"));
 	   System.out.println("==========");
 	   
 	   
 	   //Replace full string
 	   String new2=A.replaceAll("Java", "Python");
 	   System.out.println(new2);
 	   System.out.println(B.replaceAll("Java is secured", "Hello"));	
 	   System.out.println(C.replaceAll("platform independent", "platform dependent"));
 	   System.out.println(D.replaceAll("Java is object oriented programming languauge", "OK"));
 	   System.out.println("===========");
 	   
 	   //Replace first word
 	   String new3=A.replaceFirst("J", "K");
 	   System.out.println(new3);
 	   System.out.println(B.replaceFirst("Java", "C++"));
 	   System.out.println(C.replaceFirst("is", "was"));
 	   System.out.println(D.replaceFirst("p", "d"));
 	   System.out.println("=============");
 	   
 	   
 	   //9.FinD character--Used to find the character present at the index(starts from 0,counts whitespaces)
 	   
 	   char cha=A.charAt(2);
 	   System.out.println(cha);
 	   System.out.println("Value stored at no.0="+ B.charAt(0));
 	   System.out.println("Value stored at no.12="+ C.charAt(12));
 	   System.out.println("Value stored at no.44="+ D.charAt(44));
 	   System.out.println("============");
 	   
 	   
 	   //10.SubString--used to return the part of string based on specific index
 	   
 	   String Sub=A.substring(1);
 	   System.out.println(Sub);
 	   String sub=B.substring(4,9);
 	   System.out.println(sub);
 	   System.out.println(C.substring(1,18));
 	   System.out.println(D.substring(2, 40));
 	   System.out.println("=============");
 	   
 	  //11.Concatenation--used to connect two strings
 	    //concat , +
 	   
 	   String add=A.concat(B);
 	   System.out.println(add);
 	   System.out.println(A.concat(" is portable"));
 	   System.out.println(D.concat(B));
 	   System.out.println(A+ B);
 	   System.out.println("=============");
 	   
 	   //12.Contains
 	   
 	   boolean Con=A.contains(B);
 	   System.out.println(Con);	
 	   System.out.println(B.contains(A));
 	   System.out.println(D.contains(A));
 	   System.out.println(C.contains(D));
 	   System.out.println("=============");
 	   
 	   //13.Index of--It shows index by providing character
 	         //Left----->Right
 	   
 	   int index=A.indexOf('v');
 	   System.out.println(index);
 	   System.out.println(B.indexOf('r'));
 	   System.out.println(C.indexOf('d'));
 	   System.out.println(D.indexOf('a'));
 	   System.out.println("=============");
 	   
 	   
 	   //14.Last Index of--It shows index by providing character
 	          //Left <----- Right
 	   
 	   int indexx=A.lastIndexOf('J');
 	   System.out.println(indexx);
 	   System.out.println(B.lastIndexOf('e'));
 	   System.out.println(C.lastIndexOf('t'));
 	   System.out.println(D.lastIndexOf('o'));
 	   
 	   
 	   
 	   
 	   
 	   
 	   
}
}
