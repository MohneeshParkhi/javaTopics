package jdkEight;

@FunctionalInterface
interface PrintEmployeeDetails {

	public void printDetails();

}

public class JavaFunctionalInterface  {
	public static void main(String[] args) {

		PrintEmployeeDetails printDetails = new PrintEmployeeDetails(){

			 public void printDetails() {
				System.out.println("Hello Java");
			}

		};
		printDetails.printDetails();
		

	}

}
