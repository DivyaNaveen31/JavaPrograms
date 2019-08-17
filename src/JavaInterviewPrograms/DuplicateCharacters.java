package JavaInterviewPrograms;

import java.util.HashMap;
import java.util.Iterator;

public class DuplicateCharacters 
{
	public static void findDuplicateCharacters(String str)
	{
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		
		for(int i=0; i<str.length(); i++)
		{
			char characters = str.charAt(i);
			
			if(hashMap.get(characters) != null)
			{
				hashMap.put(characters, hashMap.get(characters) + 1);
			}
			else
			{
				hashMap.put(characters, 1);
			}		
		}

		//To Print all the Characters that are appeared in a String.
		System.out.println(hashMap);
				
		System.out.println("########################################");
				
		//To Print Only and Only Duplicate Characters from a String.
		Iterator<Character> tempString = hashMap.keySet().iterator();
		while(tempString.hasNext())
		{
			Character temp = tempString.next();
			if(hashMap.get(temp) > 1)
			{
				System.out.println("The Character " + temp + " appeared " + hashMap.get(temp) + " Times.");
			}
		}
	}
	
	public static void main(String args[])
	{
		findDuplicateCharacters("cdbjavabjavabef");
	}
}
