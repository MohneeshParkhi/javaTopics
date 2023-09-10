package jdkEight;

import java.util.ArrayList;
import java.util.HashMap;

public class ReverseStringUsingJDkEight {
	public static void main(String[] args) {
		String s = "mohneesh";
		char [] arr = s.toCharArray();
		Character [] temp= null ;
		
		int count = arr.length;
		ArrayList  aLi = new ArrayList(arr.length);

		for(int i=0; i< arr.length ;i++){
			aLi.add(arr[i]);
		}


		aLi.stream().forEach(
		ch -> {
		temp[count] = (Character)ch;
		}
		);
		
		for(int i=0; i< temp.length ;i++){
			System.out.println(temp[i]);
		}

		
	}
}
