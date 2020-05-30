package Array;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to reverse : ");
		String str = sc.nextLine();
		String reversedString = reverseString(str);
		System.out.print("Reversed String : " + reversedString);

	}

	private static String reverseString(String str) {
		
		char s[]  = str.toCharArray();
		int i , j;
		
		for(i= 0 , j = s.length - 1 ; i < s.length / 2 ; i++ , j--)
		{
			char temp = s[i];
			s[i] = s[j];
			s[j] = temp;
		}
		
		return String.valueOf(s);
	}

}
