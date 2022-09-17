package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Hashset1
{
    public static void main(String[] args)
    {
		   
    	LinkedHashSet hs= new LinkedHashSet();
    	    
    	hs.add(123);
    	hs.add("hellloo");
    	hs.add(11111);
    	hs.add("hiiiiiiii");
    	hs.add(3333333);
    	hs.add("bye");
    	hs.add(null);
    	hs.add("hellloo");
    	hs.add(null);
    	hs.add("hellloo");
    	
    	
    	
    	int size = hs.size();
    	System.out.println(size);
    	System.out.println("==================");
    	
    	
////    	hs.remove(0);
////    	hs.add(0000000);
////    	
//    	
    	Iterator itr = hs.iterator();
    	
    	while(itr.hasNext())
    			{
    		System.out.println(itr.next());
    			}
    	
    	System.out.println("===============");
    	
    	for(Object obj:hs)
    	{
    		System.out.println(obj);
    	}
    	System.out.println("==================");
    	
    	for(int i=0; i<=hs.size()-1;i++)
    	{
    		System.out.println(i);
    	}
    	
    	
    	
	}
}
