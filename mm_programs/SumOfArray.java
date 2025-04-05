package mm_programs;
import java.util.Scanner;
public class SumOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int s = sc.nextInt();
		int[] arr = new int[s];
		System.out.println("Enter " +s+ " elements : " );
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("Sum of the array elements : " +sum);

	}

}
