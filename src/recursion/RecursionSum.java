package recursion;

import java.util.Scanner;

public class RecursionSum{

	static int summit(int n, int sum){
		if(n < 1)
		return sum+1;
		else {
		sum = sum + n;
		return  sum + summit(n-1, sum);
		}
	}

public static void main(String ars[]){
	Scanner scan = new Scanner(System.in);
	int  n = scan.nextInt();
	scan.close();
	int sum =0;
	int sumTotal = summit(n, sum);

	System.out.println(sumTotal);

}

}
