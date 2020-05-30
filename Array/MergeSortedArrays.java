package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArrays {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of first array : ");
		int n1 = sc.nextInt();
		int a[] = new int[n1];
		
		System.out.println("Enter size of Second array : ");
		int n2 = sc.nextInt();
		int b[] = new int[n2];
		
		System.out.println("Enter elements of First Array : ");
		for(int i =0 ; i < n1 ; i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter elements of Second Array : ");
		for(int i =0 ; i < n2 ; i++)
		{
			b[i] = sc.nextInt();
		}
		
		Arrays.sort(a);
		Arrays.sort(b);
		mergeSortedArray(a,n1,b,n2);

	}

	private static void mergeSortedArray(int[] a, int n1, int[] b, int n2) {
		int n3 = n1 + n2;
		int c[]  = new int[n3];
		
		int k = 0 , i = 0 , j = 0;
		while(i < n1 && j < n2)
		{
			if(a[i] <= b[j])
			{
				c[k] = a[i];
				i++;
			}
			else
			{
				c[k] = b[j];
				j++;
			}
			k++;
			
		}
		if( i >= n1)
		{
			while(j < n2)
			{
				c[k] = b[j];
				j++;
				k++;
			}
		}
		else
		{
			while(i < n1)
			{
				c[k] = a[i];
				i++;
				k++;
			}
		}
 		System.out.println("Merged Array : ");
		for(int m = 0 ; m < n3 ; m++)
		{
			System.out.print(c[m] + " ");
		}
		System.out.println(" ");
	}

}
