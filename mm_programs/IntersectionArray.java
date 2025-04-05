package mm_programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class IntersectionArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array 1 : ");
        int s1 = sc.nextInt();
        int[] arr1 = new int[s1];
        System.out.println("Enter " + s1 + " elements : ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter size of array 2 : ");
        int s2 = sc.nextInt();
        int[] arr2 = new int[s2];
        System.out.println("Enter " + s2 + " elements : ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println("Array 1 : " + Arrays.toString(arr1));
        System.out.println("Array 2 : " + Arrays.toString(arr2));

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0, j = 0;
        ArrayList<Integer> list = new ArrayList<>();

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                list.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }

        int[] result = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            result[k] = list.get(k);
        }

        System.out.println("Intersection of Two Arrays : " + Arrays.toString(result));
    }
}
