package mm_programs;
import java.util.Scanner;
public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		String reversed = "";
		for(int i=str.length()-1; i>=0; i--) {
			reversed += str.charAt(i);
		}
		if(str.equals(reversed)) {
			System.out.println("Given string is palindrome");
		}
		else {
			System.out.println("Given string is not palindrome");
		}
	}

}
