package HashTable;

import java.util.Hashtable;
import java.util.Scanner;

public class FirstRecurring {

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
		
		naiveApproach(a,a.length);
		usingHashtable(a ,a.length);

	}

	private static void usingHashtable(int[] a, int length) {
		
		Hashtable<Integer,Integer> ht = new Hashtable<>();
		
		for (int i = 0; i < length; i++) {
			
			if(ht.contains(a[i]))
			{
				System.out.println("First Recurring Using Hashtable: "+a[i]);
				return;
			}
			else
			{
				ht.put(i, a[i]);
			}
			
		}
		
	}

	private static void naiveApproach(int[] a, int length) {
		
		for(int i = 0 ; i < length ; i++)
		{
			for(int j = i+1 ; j < length ; j++)
			{
				if(a[j] == a[i])
				{
					System.out.println("First Recurring Using For Loop: "+a[i]);
					return;
				}
			}
		}
		
	}

}
