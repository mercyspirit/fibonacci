package fib;
import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args) throws Exception {
		Scanner scan;
		int input;
		System.out.println("Fibonacci Machine");
		scan = new Scanner(System.in);
			System.out.print("Enter a number:");
			input = scan.nextInt();
			System.out.print("Output:");
			System.out.println(fib(input));			
			scan.close();		
	}
	
	public static int fib (int x) {
		if (x == 0) return 0;
		if (x == 1 || x == 2) return 1;
		return fib(x - 1) + fib(x - 2);
	}
}
