package Array;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ContainsDuplicate {

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
		
		boolean flag = containsDuplicate(a,n);
		if(flag)
			System.out.println("\nArray contains Duplicates");
		else
			System.out.println("\nArray does not contain Duplicates");

	}

	private static boolean containsDuplicate(int[] a, int n) {
		Set<Integer> set = new HashSet<>();
		boolean flag = false ;
		for(int i = 0 ; i < n ; i++)
		{
			if(! set.contains(a[i]))
			{
				set.add(a[i]);
			}
			else
			{
				System.out.print(a[i] + " ");
				flag = true ; 
			}
		}
		return flag;
	}
	

}
