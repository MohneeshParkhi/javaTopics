package jdkEight;

import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CountOccurrenceCharacters {
	public static void main(String[] args) {
		String str = "ABACCCACDEFEGHGGGG";
		
		Stream.of(str.split("")).collect(Collectors.toCollection(
	}
	}
