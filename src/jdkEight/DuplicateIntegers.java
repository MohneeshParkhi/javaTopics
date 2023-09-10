package jdkEight;

import java.util.Arrays;
import java.util.stream.IntStream;

public class DuplicateIntegers {
	public static void main(String[] args) {
		Integer arr [] = {1,1,2,3,4,4};
		
		IntStream.range(0, arr.length-1).filter(i -> arr[i] == arr[i+1]).
		mapToObj(x -> arr[x]).forEach(element -> System.out.print(element));
	
		
	
	}
}
