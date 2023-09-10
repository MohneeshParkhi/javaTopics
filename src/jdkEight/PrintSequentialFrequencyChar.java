package jdkEight;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrintSequentialFrequencyChar {
	public static void main(String[] args) {
		String input = "aabbccddiizzeeffhhkkaabb";
		
		
		// in order of their occurrence
		Stream.of(input.toLowerCase().split(""))
        .collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting()))
        .entrySet()
        .stream()
        .map(e -> e.getKey()+e.getValue()+" ")
        .forEach(System.out::print);
		
	}	
	
}
