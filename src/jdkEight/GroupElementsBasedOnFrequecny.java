package jdkEight;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupElementsBasedOnFrequecny {
public static void main(String[] args) {
	Integer arr[] = {1,1,2,2,2,3,4};
	
	Stream.of(arr).collect(Collectors.groupingBy(x -> x,Collectors.counting())).
	entrySet().stream().forEach(x -> System.out.print(x + "\n") );
}
}
