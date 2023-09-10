package jdkEight;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RepeatingElementsArray {
	public static void main(String[] args) {
		Integer[] arr = {1,1,2,2,3,4};
		
	  	IntStream.range(0,arr.length-1).
	  	filter(x -> arr[x] == arr[x+1]).mapToObj(x -> arr[x]).forEach(i -> System.out.println(i));	
		
		
	}

}
