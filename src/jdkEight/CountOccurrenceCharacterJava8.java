package jdkEight;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOccurrenceCharacterJava8 {
	
	public static void main(String[] args) {
		Character ar []= {'a','a','b','c','d','e','e'};
		
	Map<Character, Long>  map =	Arrays.asList(ar).stream().
		collect(Collectors.groupingBy(x -> x, Collectors.counting()));

			System.out.println(map);
	
	}
	}
