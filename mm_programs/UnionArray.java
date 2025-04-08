package mm_programs;

import java.util.Scanner;

public class UnionArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array 1: ");
        int s1 = sc.nextInt();
        int[] arr1 = new int[s1];
        System.out.println("Enter " + s1 + " elements:");
        for (int i = 0; i < s1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of array 2: ");
        int s2 = sc.nextInt();
        int[] arr2 = new int[s2];
        System.out.println("Enter " + s2 + " elements:");
        for (int i = 0; i < s2; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] temp = new int[s1 + s2];
        int k = 0;

        for (int i = 0; i < s1; i++) {
            if (!isPresent(temp, k, arr1[i])) {
                temp[k++] = arr1[i];
            }
        }

        for (int i = 0; i < s2; i++) {
            if (!isPresent(temp, k, arr2[i])) {
                temp[k++] = arr2[i];
            }
        }

        for (int i = 0; i < k - 1; i++) {
            for (int j = 0; j < k - i - 1; j++) {
                if (temp[j] > temp[j + 1]) {
                    int tempSwap = temp[j];
                    temp[j] = temp[j + 1];
                    temp[j + 1] = tempSwap;
                }
            }
        }

        System.out.print("Union Array is: ");
        for (int i = 0; i < k; i++) {
            System.out.print(temp[i] + " ");
        }
    }

    public static boolean isPresent(int[] arr, int len, int num) {
        for (int i = 0; i < len; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }
}
