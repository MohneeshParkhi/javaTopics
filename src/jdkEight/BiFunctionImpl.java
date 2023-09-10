package jdkEight;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Function;

@FunctionalInterface
interface ShowBifunction<T,U,R>{
		
	Integer performSum(BiFunction<T, U, R> parm);
}



public class BiFunctionImpl extends ArrayList{
	  
	    
	public static void main(String[] args) {
		
		BiFunction<Integer,Integer,Integer> fun = (x,y) -> {
			return x+y;
		};
		
		
		
		
		System.out.println(fun.apply(10, 10));
	
		// Targeting the BiFunction method 
		ShowBifunction<Integer, Integer, Integer> biFunRef = (k) -> {
			 return k.andThen( element -> element*100).apply(10, 10); 
			
		};
		
		System.out.println(biFunRef);
	}
}
