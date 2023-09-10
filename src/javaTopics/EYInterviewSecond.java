package javaTopics;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EYInterviewSecond {
	public static void main(String[] args) {
		String arr [] = {"abc","def","aef"};
		int size = arr.length;
		int temp = size;
		StringBuilder sb = new StringBuilder(); 
		int i=0;
		while(temp != 0) {
			sb.append(arr[i]);
			i++;
			temp--;
		}
		
		//Stream.of(arr).flatMap(x -> x.)
		
		/*
		 * IntStream.range(0, sb.toString().length()-1) .mapToObj(x ->
		 * sb.toString().charAt(x)). collect(Collectors.groupingBy(x -> x,
		 * Collectors.counting())).entrySet().forEach(x -> System.out.print(x));
		 */
    Stream.of(arr).
				collect(Collectors.joining()).chars().mapToObj(x -> sb.toString().charAt(x)).
				collect(Collectors.groupingBy(x -> x, Collectors.counting())).entrySet().forEach(x -> System.out.print(x));
		
	}
}
