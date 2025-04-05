package mm_programs;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int s = sc.nextInt();
		int[] arr = new int[s];
		System.out.println("Enter "+s+ " elements : ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Original array :   "+Arrays.toString(arr));
		
		int start = 0;
		int end = arr.length-1;
		
		while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
		System.out.println();
		System.out.print("Reversed array :  " +Arrays.toString(arr));
	}

}
