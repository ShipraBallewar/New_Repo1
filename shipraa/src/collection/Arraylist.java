package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylist 
{
      public static void main(String[] args) 
  {
	  ArrayList Al=new  ArrayList();
	   
	  Al.add("roll no:" + 400);
	  Al.add("Hello");
	  Al.add(null);
	  Al.add("Hiiiii");
	  Al.add(400);
	  Al.add("Hello");
	  Al.add(true);
	  Al.add(false);
	  
	  System.out.println(Al.get(5));  //Retrieval
	  
	  System.out.println(Al.size());
	  
	  System.out.println(Al);
	  
	  Al.add(2, "hey");
	  System.out.println(Al);      //manipulation
	  
	  Al.remove(2);
	  System.out.println(Al);
	 System.out.println("==========================="); 
	 
	 System.out.println("print values using for loop");
	 
	 for(int i=0;i<=Al.size()-1;i++ )
	 {
		 System.out.println(Al.get(i));
	 }
		
	 System.out.println("=============================");
	 
	 System.out.println("print values using for Each loop");
	 
	 for(Object abc:Al)
	 {
		 System.out.println(abc);
	 }
	  
     System.out.println("=============================");
	 
	 System.out.println("print values using Iterator"); 
	 
	 Iterator itr= Al.iterator();
	 
	 while(itr.hasNext())
	 {
		 System.out.println(itr.next());
	 }
	 
     System.out.println("=============================");
	 
	 System.out.println("print values using ListIterator"); 
	 
	 ListIterator Litr= Al.listIterator();
	 
	 while(Litr.hasNext())
	 {
		System.out.println(Litr.next()); 
	 }
	 
	 
}
}
