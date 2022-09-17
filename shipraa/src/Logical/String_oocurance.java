package Logical;

import java.util.HashMap;
import java.util.Set;

public class String_oocurance {

	
	public static void main(String[] args) {
		
		String str= "aa bbb ccc aa ccc the id is is bbb";
		
		String[] array = str.split(" ");
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i =0;i<=array.length-1;i++)
		{
			String value = array[i];
			if(map.containsKey(value))
			{
			map.put(value, map.get(value)+1);
			}
			else
			{
				map.put(value, 1);
			}
		}
		
		Set<String> iterator = map.keySet();
		
		for(String obj:iterator)
		{
			System.out.println(obj+"=="+ map.get(obj));
		}
	}
}

