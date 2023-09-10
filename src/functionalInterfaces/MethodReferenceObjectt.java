package functionalInterfaces;

interface printFibonacci {
	void fibonacci(int num);
}

class InstanceRefrence {
	
	void calculateFibonacci(int num) {
	 int firstNum = 0;
	 int secondNum =1;
	 int tempNum;
	 /*
	 if(num == 1) {
		 System.out.println("Only One element is present" + firstNum);
	 }
	 if(num ==2) {
		 System.out.println("Series to be printed as :" + firstNum + " "+ secondNum);
	 }*/
	 
	 for(int i=2 ;i<=num ;i++) {
		 if(num < i) {
			 System.out.println("Series to be printed as :" + firstNum + " "+ secondNum);
		 } else {
			 	
			 	tempNum = firstNum + secondNum;
			 	System.out.println(tempNum);
			 	 firstNum = secondNum;
			 	 secondNum = tempNum; 
		 }
	 }
	}
}




public class MethodReferenceObjectt {
	
	static void printSeries(printFibonacci prtFibo, int num) {
		prtFibo.fibonacci(num);
	}
	
	public static void main(String[] args) {
		InstanceRefrence instanceReference = new InstanceRefrence();
		int num = 10;
		printSeries(instanceReference :: calculateFibonacci, num);
	}
}
