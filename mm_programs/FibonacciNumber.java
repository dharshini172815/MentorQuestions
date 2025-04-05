package mm_programs;
import java.util.Scanner;
public class FibonacciNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of terms to print fibonacci number : ");
		int n = sc.nextInt();
		
		int a = 0;
		int b = 1;
		System.out.println();
		System.out.print("Fibonacci number :  ");
		for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
	}

}
