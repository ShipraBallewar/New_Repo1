package Logical;

import java.util.HashMap;
import java.util.Set;

public class Character_occurance {

	public static void main(String[] args) {
		
		String str="mcnmnmfyuasttehfdtwgdyttttgsvbcvvnc";
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0;i<=str.length()-1;i++)
		{
			char value= str.charAt(i);
			
			if(map.containsKey(value))
			{
					map.put(value, map.get(value)+1);
		    }
			else
			{
				map.put(value, 1);
			}
		}
		
		Set<Character> itr = map.keySet();
		
		for(Character obj:itr)
		{
			System.out.println(obj +"=" +map.get(obj));
		}

	}

}
