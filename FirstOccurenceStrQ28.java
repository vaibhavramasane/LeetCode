//Find index of the first occurence in a string

import java.util.*;

class FirstOccurenceStrQ28{
	public static boolean firstOcrr(String haystack,String needle){
	
		//main logic for leetocode
		if(haystack.contains(needle))
			
			return (haystack.indexOf(needle));
			
		return false;
	}

	
	public static void main(String x[]){
		
		String haystack = "sadbutsad";
		String needle = "sad";
		
		firstOcrr(haystack,needle);
		
	}
	
}
		
		
		
			
			

