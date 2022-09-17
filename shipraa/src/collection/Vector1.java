package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector1 
{
   public static void main(String[] args)
   {
	  Vector V= new Vector();
	  
	  V.add("XyZ");
	  V.add(200);
	  V.add("abcd");
	  V.add(200);
	  V.add(null);
	  V.add(null);
	  V.add(true);
	  V.add(200);
	  
	  System.out.println(V.size());
	  System.out.println(V.get(4));     //retrieval
	  System.out.println(V);
	      
	  V.add(0, "hey");
	  System.out.println(V);
	  
	  V.remove(0);
	  System.out.println(V);
	  
	 System.out.println("=============================");
	 System.out.println("Print values using for loop");
	 
	  for(int i=0;i<=V.size()-1;i++)
	  {
		  System.out.println(V.get(i));
	  }
	  
	  System.out.println("=============================");
	  System.out.println("Print values using for each loop");
		  
	  for(Object obj:V)
	  {
		  System.out.println(obj);
	  }
	  
	  System.out.println("=============================");
	  System.out.println("Print values using for Iterator");
	  
	  Iterator itr= V.iterator();
	  
	  while(itr.hasNext())
	  {
		  System.out.println(itr.next());
	  }
	  
	  System.out.println("=============================");
	  System.out.println("Print values using for List iterator");
	  
	  ListIterator List= V.listIterator();
	  
	  while(List.hasNext())
	  {
		  System.out.println(List.next());
	  }
		 
	  System.out.println("=============================");
	  System.out.println("Print values using Enumeration");
	  
	  Enumeration enu=V.elements();
	  
	  while(enu.hasMoreElements())
	  {
		  System.out.println(enu.nextElement());
	  }
		  
}
}
