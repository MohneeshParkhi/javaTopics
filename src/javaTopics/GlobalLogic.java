package javaTopics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GlobalLogic {
	 public static void main(String[] args) {
		Integer []list = {4,2,8,6,5,1,7,3,9};
		int size = list.length;
		int mid = size/2;
		
		
		
		List temp1 = new ArrayList(mid);
		
		List temp2 = new ArrayList(mid+1);
		int tempi =0 ;
				
		Arrays.asList(list).stream().sorted().forEach(x -> {
			if(temp1.size() != mid) {
				temp1.add(x);
			}
		});
	
		Arrays.asList(list).stream().sorted().forEach(x -> {
			if(temp2.size() != (size -mid+1 )) {
				temp2.add(x);
			}
		});
	
		temp2.stream().sorted(Comparator.reverseOrder());
	   	
		
		List finalL = new ArrayList(size);
		
		for(int i=0;i < mid ;i++) {
			while(temp1.size() != 0) {
			finalL.add(temp1.get(i));
			temp1.remove(i);
		}
			
		}
		
		for(int i=mid;i < size-1 ;i++) {
			finalL.add(temp2.get(i));	
		}
			
		
		
		finalL.stream().forEach(x -> System.out.println(x));
		
	 }
	 
}





