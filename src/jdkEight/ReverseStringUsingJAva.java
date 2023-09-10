package jdkEight;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseStringUsingJAva {
	public static void main(String[] args) {
		Character [] s = {'G','y','n','a','v','i','s','t','a'};
		
		String str = "Mohneesh";
		
	String rv=	Stream.of(str).map( c -> 
	new StringBuilder(c).reverse()).collect(Collectors.joining());
		
		System.out.println(rv);
	}
}
