package mm_programs;
import java.util.Arrays;
import java.util.Scanner;
import java.util.HashSet;
public class UnionArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array 1 : ");
		int s1 = sc.nextInt();
		int[] arr1 = new int[s1];
		System.out.println("Enter " +s1+ " elements : ");
		for(int i=0; i<arr1.length; i++) {
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("Enter size of array 2 : ");
		int s2 = sc.nextInt();
		int[] arr2 = new int[s2];
		System.out.println("Enter " +s2+ " elements : ");
		for(int i=0; i<arr2.length; i++) {
			arr2[i]=sc.nextInt();
		}
		
		System.out.println("Array 1 : " +Arrays.toString(arr1));
		System.out.println("Array 2 : " +Arrays.toString(arr2));
		
		HashSet<Integer> set = new HashSet<>();
		for(int i : arr1) {
			set.add(i);
		}
		for(int j : arr2) {
			set.add(j);
		}
		
		int[] unionArr = new int[set.size()];
		int index = 0;
        for (int num : set) {
            unionArr[index++] = num;
        }
        
        Arrays.sort(unionArr);
        System.out.println("Union Array is " +Arrays.toString(unionArr));
	}

}
