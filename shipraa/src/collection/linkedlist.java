package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class linkedlist 
{
   public static void main(String[] args) 
   {
	   LinkedList L1=new LinkedList();
	   
	   L1.add(55);
	   L1.add("This");
	   L1.add("is");
	   L1.add("a");
	   L1.add("Link");
	   L1.add(null);
	   
	   System.out.println(L1.size());
	   System.out.println(L1.isEmpty());
	   
	   L1.set(5, "List");
	   System.out.println(L1);
	   
	   System.out.println(L1);
	   
	   System.out.println(L1.get(4));   //retrieval (worst choice)
	   
	   L1.add(2, "was");
		System.out.println(L1);	 
	   L1.remove(2);
	   System.out.println(L1);
	   System.out.println("====================");
	   
	   System.out.println("print values using for loop");
		
	   for(int i=0;i<L1.size();i++)
	   {
		   System.out.println(L1.get(i));
	   }
		
	   System.out.println("======================");	  
       System.out.println("Print values using for each loop");
       
       for(Object obj:L1)
       {
    	   System.out.println(obj);
       }
       
       System.out.println("===============================");
       System.out.println("Print values using iterator");
       
       Iterator itr=L1.iterator();
       
       while(itr.hasNext())
       {
    	   System.out.println(itr.next());
       }
       
       System.out.println("==============================");
       System.out.println("Print values using listiterator");
       
       ListIterator litr=L1.listIterator();
       
       while(litr.hasNext())
       {
    	   System.out.println(litr.next());
       }
}
}
