
package multithreading;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrimeNumber {

	void checkPrimeNumber(int num) {

		int mid = num / 2;
		boolean flag = true;
		if (num == 0 || num == 1) {
			System.out.println("Not a Prime number");
		} else {
			for (int i = 2; i <= mid; i++) {
				if (num % i == 0) {
					System.out.println(num+" is not prime number"); 
					flag = false;
					break;
				}
			}

		}
		if (flag == false) {
			System.out.println("Not a prime number");
		}
	}
}

public class ExecutorFrameworkTest {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4 };

		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.checkPrimeNumber(17);
		primeNumber.checkPrimeNumber(11);
		primeNumber.checkPrimeNumber(19);

		// ExecutorService executorService = Executors.newCachedThreadPool();

	}
}
