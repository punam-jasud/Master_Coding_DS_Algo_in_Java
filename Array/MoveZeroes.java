package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZeroes {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elemnts : ");
		int n = sc.nextInt();
		int a[] = new int[n];
		
		System.out.println("Enter elements : ");
		for(int i = 0 ; i < n ;i++)
		{
			a[i] = sc.nextInt();
		}
		moveZeroesToEnd(a,n);
		moveZeroesToBeg(a,n);

	}

	private static void moveZeroesToBeg(int[] a, int n) {
		int counter = n-1;
		for(int i = n-1 ; i >= 0 ; i--)
		{
			if(a[i] != 0)
			{
				a[counter] = a[i];
				counter--;
			}
		}
		for(int i = counter ; i >= 0 ; i--)
		{
			a[i] = 0;
			
		}
		
		System.out.println("Zeroes at Begining : " + Arrays.toString(a));
		
	}

	private static void moveZeroesToEnd(int[] a, int n) {
		
		int counter = 0;
		for(int i = 0 ; i < n ; i++)
		{
			if(a[i] != 0)
			{
				a[counter] = a[i];
				counter++;
			}
		}
		for(int i = counter ; i < n ; i++)
		{
			a[i] = 0;
			
		}
		
		System.out.println("Zeroes at End : " + Arrays.toString(a));
	}

}
