package jdkEight;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CheckStreamOperability {
	public static void main(String[] args) {
		int i[] = {1,2,4,5};
		
		Stream st = Stream.of(i);
		
		System.out.println(st.collect(Collectors.counting()));
		
		st.forEach(x -> System.out.print(x));
	}

}
