package functionalInterfaces;


// functional interface
interface StringFunc{
	String func(String str);
}

// class having static method for refrence
class StringReverse {
	
	static String strReverse(String str) {
		String reverse ="";
		for(int i= str.length()-1 ;i>0 ;i++) {
			reverse += str.charAt(i);
		}
		
		return reverse;
	}
}


public class MethodReferenceOne {
	
	static String stringOp(StringFunc methRef, String strr) {
	return methRef.func(strr);
	}
	public static void main(String[] args) {
	 String input = "GynaVista";
	 String output = "";
	 
	 output = stringOp(StringReverse::strReverse, input);
	
	 System.out.println(output);
	}
}
