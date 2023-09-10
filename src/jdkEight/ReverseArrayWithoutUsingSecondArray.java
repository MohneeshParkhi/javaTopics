package jdkEight;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseArrayWithoutUsingSecondArray {
		
		public static void main(String[] args) {
			
			Integer[] arr = {1,2,3,4,5};
			
			// Using Java eight
			
			List<Integer> l = Stream.of(arr).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
			
			Stream.of(l).forEach(x -> System.out.print(x));
	
		}
}
