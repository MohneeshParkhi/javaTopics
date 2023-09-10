package jdkEight;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountNumberofWorld {
 public static void main(String[] args) {
	String sentence = "My Name is Mohneesh Parkhi I am Mohneesh Parkhi";
	
	Stream.of(sentence.split(" ")).map(element -> new String(element)).
	collect(Collectors.groupingBy( x -> x, Collectors.counting())).entrySet().forEach( entry -> System.out.print(entry));
	
}
}
