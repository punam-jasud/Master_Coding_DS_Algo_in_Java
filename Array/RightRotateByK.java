package Array;

import java.util.Arrays;

public class RightRotateByK {

	public static void main(String[] args) {
	
	int a [] = {1 , 2 , 3, 4 , 5, 6 , 7};
	int k = 3;
	
	Approach1 obj1 = new Approach1();
	obj1.rotateArray(a,k);
	System.out.println("Rotated Array Approach1 : " +Arrays.toString(a));
	
	int b [] = {1 , 2 , 3, 4 , 5, 6 , 7};
	Approach2 obj2 = new Approach2();
	obj2.rotateArrayUsingAuxilarySpace(b,k);
	System.out.println("Rotated Array Approach2 : " +Arrays.toString(a));
	
	int c [] = {1 , 2 , 3, 4 , 5, 6 , 7};
	BestApproach obj3 = new BestApproach();
	obj3.rotateRight(c,k , c.length);
	System.out.println("Rotated Array BestApproach : " +Arrays.toString(a));
		
	}

}

//Time Complexity - O(n*k)
class Approach1{

	public void rotateArray(int[] a, int k) {
		
		for(int i = 0 ; i < k ; i++)
		{
			rotateByOne(a);
		}
		
	}

	private void rotateByOne(int[] a) {
		
		int last = a[a.length - 1];
		for(int i = a.length - 2 ; i >=0 ;i--)
		{
			a[i + 1] = a[i];
		}
		a[0] = last;
	}	
	
}

//Time Complexity - O(n) , Auxilary Space - O(k)
class Approach2{

	public void rotateArrayUsingAuxilarySpace(int[] a, int k) {
		
		int n = a.length ;
		int aux[] = new int[k];
		
		//Fill auxilary array with last three elemnts
		for(int i  = 0 ; i < k ; i++)
		{
			aux[i] = a[n - k + i];
		}
		
		//Shift n-k elementts to the end of array
		for(int i = n-k - 1 ; i >= 0 ; i--)
		{
			a[i + k] = a[i];
		}
		// put the elements of the auxiliary array at their
		// correct positions in the input array
		for(int  i = 0 ; i < k ;i++)
		{
			a[i] = aux[i];
		}
		
	}
	
}

//Time Complexity - O(n) , Auxilary space = 0(1)
class BestApproach{

	public void rotateRight(int[] a, int k, int n) {
		
		//First rotate last k elements
		reverse(a,n-k,n-1);
		
		//Second Rotate n-k elements
		reverse(a,0,n-k-1);
		
		//Third reverse whole array
		reverse(a,0,n-1);
		
	}

	private void reverse(int[] a, int low, int high) {
		int i , j ;
		for(i = low , j = high ; i < i/2 ; i++ , j-- )
		{
			int temp  = a[i];
			a[i] = a[j] ;
			a[j] = temp ;
		}
		
	}

}