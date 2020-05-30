package Array;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TwoSumProblem {

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
		
		System.out.println("Enter Target Sum : ");
		int sum = sc.nextInt();
		findElementsEqualSum(a,n,sum);
		
	}

	private static void findElementsEqualSum(int[] a, int n, int sum) {
		Set<Integer> s = new HashSet<>();
		
		for(int i = 0 ; i < n ;i++)
		{
			if(! s.contains(sum - a[i]))
			{
				s.add(a[i]);
			}
			else
			{
				System.out.println("Two numbers which are equal to "+sum+" are : " + a[i] +" , " +(sum - a[i]));
			}
		}
		
	}

}
