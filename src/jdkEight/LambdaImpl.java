package jdkEight;

@FunctionalInterface
interface LambdaExample{
 void print();
}

class LambdaImpl {
	public static void main(String args[]){
		LambdaExample example = () -> {System.out.println("Hello GyanVista");};
		
		example.print();
	}
}