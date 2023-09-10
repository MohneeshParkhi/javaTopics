package functionalInterfaces;

interface SomeFunc<T> {

	T genericFunction(T t);
}

public class GenericFunc {
	public static void main(String[] args) {
			
		SomeFunc<String> reverse = (str) -> {
			String result = " ";
			int length = str.length();
			for(int i= length-1 ; i>0 ;i--) {
				result += str.charAt(i);
			}
			return result;	
		};
		
		SomeFunc<Integer> factorial = (num) -> {
			int result =1;
			for(int i=1 ;i<= num ; i++) {
				result = result * i;
			}
			
			return result;
		};
		
		System.out.println(reverse.genericFunction("gyanvista"));
		System.out.println(factorial.genericFunction(5));
		
	}
}
