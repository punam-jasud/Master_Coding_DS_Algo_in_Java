/*Input Array : [2, -3, 7, -4, 2, 5, -8, 6, -1]
Continous Sub Array With Maximum Sum : [ 7 -4 2 5 ]
Sum : 10*/


package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSubarray {

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
		
		maximumSubArray(a,n);

	}

	private static void maximumSubArray(int[] a, int n) {
		
		int bestSum = a[0];
		int bestStart = 0 ;
		int bestEnd = 0 ;
		
		int currentSum = 0;
		int currentStart = 0;
		
		for(int i = 1 ; i < n; i++)
		{
			currentSum = currentSum + a[i] ;
			
			if(currentSum < 0)
			{
				currentSum = 0;
				currentStart = i + 1;
			}
			else if(currentSum > bestSum)
			{
				bestSum = currentSum;
				bestStart = currentStart;
				bestEnd = i;
			}
		}
		
		System.out.println("Input Array : " + Arrays.toString(a));
		System.out.print("Subarray : [ ");
		for(int i = bestStart ; i <= bestEnd ; i++)
		{
			System.out.print(a[i]+""
					+ " ");
		}
		System.out.println(" ]\n");
		System.out.println("Sum = " + bestSum);
		
	}

}
