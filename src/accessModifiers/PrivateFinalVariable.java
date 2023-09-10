package accessModifiers;

class PrivateFinal{
	
	final private int i;
	
	PrivateFinal(int j){
		this.i = j;
	}
}


public class PrivateFinalVariable extends PrivateFinal{
	
			PrivateFinalVariable(int j) {
					super(j);
		// TODO Auto-generated constructor stub
				}

	public static void main(String[] args) {
		PrivateFinalVariable input = new PrivateFinalVariable(10);
		PrivateFinal accessPrivate = new PrivateFinalVariable(20);
		System.out.print(accessPrivate);
	}
}
