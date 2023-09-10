package functionalInterfaces;

// Only throws those exceptions that are declared as part of method definition

interface PlayWithNumbers<T> {
	T playWithNum(int x, int y) throws NumberNotValidException;
}

class NumberNotValidException extends Exception {

	NumberNotValidException(String mes) {
		super(mes);
	}
}

public class LambdaThroughsException {
	public static void main(String[] args) throws NumberNotValidException {

		int x = 0;
		int y = 2;
		int z = 10;

		PlayWithNumbers<Integer> play = (a, b) -> {
			int valid = 0;
			if (a == 0 || b == 0) {
				throw new NumberNotValidException("Not valid Number");
			} else
				valid = a + b;
			return valid;
		};
		
		System.out.println(play.playWithNum(x, y));
	}
}
