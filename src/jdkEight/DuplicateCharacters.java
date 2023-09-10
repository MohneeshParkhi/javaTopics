package jdkEight;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DuplicateCharacters {
	public static void main(String[] args) {
		String str = "ABCCDD";
		
		IntStream.range(0, str.length()-1).filter(i -> str.charAt(i) == str.charAt(i+1))
		.mapToObj(i -> str.charAt(i) ).forEach(x -> System.out.print(x));
	
		
	}
}
