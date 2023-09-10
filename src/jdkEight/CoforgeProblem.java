package jdkEight;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CoforgeProblem {
	public static void main(String[] args) {
		Integer arr[] = {2,3,2,1,5,6,7,1,10,3,1};
		
		Integer abr [] = {4,5,1,1,1,2,1,4};
		
		Stream.of(abr).
		collect(Collectors.groupingBy(x -> x, Collectors.counting())).entrySet().
		stream().filter(entry -> entry.getValue() == 1).forEach(entry -> System.out.println(entry.getKey()));
	}

}
