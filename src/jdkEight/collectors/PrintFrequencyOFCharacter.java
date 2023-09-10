package jdkEight.collectors;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrintFrequencyOFCharacter {
	public static void main(String[] args) {
		String str = "AABBCCDD";
		
	 Stream.of(str.toLowerCase().split("")).collect(Collectors.groupingBy(e -> e, Collectors.counting()))
	 .entrySet().stream().map(e -> e.getKey() +" "+ e.getValue()).
	 forEach(System.out::print);		
	}

}
