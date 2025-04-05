package mm_programs;
import java.util.Arrays;
import java.util.Scanner;
public class MoveZeroes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int s = sc.nextInt();
		int[] arr = new int[s];
		System.out.println("Enter  "+s+ " elements : ");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println();
		System.out.print("Original array :  " +Arrays.toString(arr));
		
		int j=0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]!=0) {
                arr[j] = arr[i];
                j++;
            }
        }
        while (j<arr.length) {
            arr[j] = 0;
            j++;
        }
        System.out.println();
        System.out.print("After moving zeroes :  "+Arrays.toString(arr));
       
	}

}
