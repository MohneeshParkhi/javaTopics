package functionalInterfaces;

interface addTwoNumbers{
	int addnumbers(int a, int b);
}



public class LambdaAsArgument {

	static void printAddtion(addTwoNumbers ref , int x, int y) {
		System.out.println(ref.addnumbers(x, y));
	}
	
	
	public static void main(String[] args) {
		
		addTwoNumbers addNum = (x,y) ->  x+y;
		
		printAddtion((x,y) ->  x+y, 4,5);
		printAddtion(addNum, 4,5);
		
	}
}
