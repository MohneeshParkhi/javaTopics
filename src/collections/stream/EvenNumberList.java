package collections.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EvenNumberList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList();
		
	//	list.add(null);
	//	list.add(null);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
	
	// Collecrting even numbers only in List using Java 8
		
		list.stream().filter(even -> (even %2) == 0).collect(Collectors.toList()).forEach(element -> System.out.println(element));
		
	}
}
