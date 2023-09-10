package jdkEight;

import java.security.KeyStore.Entry;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaximumNumberElement {
	 public static void main(String[] args) {
		Integer  arr[]={1,2,3,4,1,2,2,2,3,3,4};
				
	Map<Integer, Long> val = 
			
		Arrays.asList(arr).stream().collect(Collectors.groupingBy(num -> num, Collectors.counting()));
		
		java.util.Map.Entry<Integer, Long> maxEnty = Collections.max(val.entrySet(), Map.Entry.comparingByValue());
	
		System.out.println(maxEnty.getKey() + maxEnty.getValue());
		
	 
	 }
	 
}
