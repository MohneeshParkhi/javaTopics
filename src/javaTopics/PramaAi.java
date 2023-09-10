package javaTopics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Input: [1, 2, 3, 4, 5] , K=9
	Output: [2, 3, 4]
 */
public class PramaAi {

	public static List<Integer> findSubarrayWithGivenSum(List<Integer> arr, int sum) {
		Map<Integer, Integer> map = new HashMap();
		List<Integer> subarray = new ArrayList<>();
		int currSum = 0;
		for (int i = 0; i < arr.size(); i++) {
			currSum += arr.get(i);
			if (map.containsKey(currSum - sum)) {
				subarray = arr.subList(map.get(currSum - sum) + 1, i + 1);
				break;
			}
			map.put(currSum, i);
		}
		return subarray;
	}

	public static void main(String args[]) {

		List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
		int givenSum = 9;
		List<Integer> subarray = findSubarrayWithGivenSum(arr, givenSum);
		if (subarray.isEmpty()) {
			System.out.println("No subarray with given sum found");
		} else {
			System.out.print("Subarray: [ ");
			for (int i : subarray) {
				System.out.print(i + " ");
			}
			System.out.println("]");
		}
	}

}
