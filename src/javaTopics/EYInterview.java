package javaTopics;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EYInterview {
	
	static boolean checkPalinderome(String input) {
		StringBuilder sb = new StringBuilder(input);
		
		String reverse  = sb.reverse().toString();
		
		boolean	 check = input.equals(reverse);
	  return check;
	 	
	}
	
	
	public  static void main(String args[]) {
	
		String init = "babade";
		List<String> list= new ArrayList<String>();
		String [] longestSubString = new String[2] ; 
		int sizeOfString = init.length();
		
		 boolean checkStr = false;
		
		int k =0;
		
		String longestString  = null ;
		String tempString = null;
		for(int i = 0 ;i < sizeOfString ; i++) {
			for(int j = i+1 ; j < sizeOfString-1 ;j++ ) {
				
				String subString = init.substring(i,j);
				System.out.println("SUBSTRING "+subString);
			      checkStr = checkPalinderome(subString);
			    // System.out.print(checkStr); 
			      if(checkStr) {
			    	  tempString = subString; 
			      }
			     
			}
			
			if((longestString == null || tempString.length() >= longestString.length()) && checkStr) {
		    	 longestString = tempString;
	
		    	 list.add(longestString);
		    	 k++;
			}
			
		}
	// change t representation	
	list.stream().collect(Collectors.toSet()).forEach(x -> System.out.println(x)); 
	//Stream.of(longestSubString).forEach(x -> System.out.print(x));
	
	}


}
