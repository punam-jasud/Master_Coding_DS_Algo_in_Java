package Array;

import java.util.Scanner;

public class MyArray {
	
	public static void main(String[] args) {
		
		Array obj = new Array();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		while(true){
				
			System.out.println("\nEnter Your Choice : \n");
			
			System.out.println("1.Insertion At End"); //0(1)
			System.out.println("2.Insert Element at Middle"); //0(n)
			System.out.println("3.Delete from Last"); //o(1)
			System.out.println("4.Delete Random Element"); //0(n)
			System.out.println("5.Search Element"); //0(n)
			System.out.println("6.Access Random Element"); //0(1)
			System.out.println("7.Display Elements"); //o(n)
			System.out.println("8.Exit\n");
			
			System.out.print("Choice : ");
			int ch = sc.nextInt();
		
			switch(ch){
				case 1: obj.insertEnd();
						break;
				case 2: obj.insertAtMiddle();
						break;
				case 3:	obj.deleteLast();
						break;
				case 4: obj.deleteRandom();
						break;
				case 5: obj.searchElement();
						break;
				case 6: obj.accessElement();
						break;
				case 7: obj.displayElements();
						break;
				case 8:	System.out.println("Existing...");
						System.exit(0);
			}
		}
	}
}
class Array{
	
	 int a[] = new int[10];   		//Array
     static int size;   		//Size of array
	
     Scanner sc = new Scanner(System.in);

	public void insertEnd() {
		//You can insert only upto 10 elements bcoz array size is 10
		
		System.out.print("\nHow many elements : ");
		size = sc.nextInt();
		
		System.out.print("\nEnter the elements :\n\n");
		for(int i = 0; i < size; i++){
			
			System.out.print("["+i+"]:  ");
			a[i] = sc.nextInt();
		}
		
		
	}


	public void accessElement() {
		
		System.out.print("Enter index of element you want to access : ");
		int index = sc.nextInt();
		System.out.println("Element is : "+a[index]);
		
	}


	public void searchElement() {
		System.out.println("Enter the element you want to search : ");
		int item = sc.nextInt();
		
		for(int i = 0 ; i < size ; i++)
		{
			if(a[i] == item)
			{
				System.out.println("Element found at index "+i);
				return;
			}
			
		}
		System.out.println("Element not found");
		
	}


	public void deleteRandom() {
	
		System.out.println("Enter the index of element that you want to delete : ");
		int index = sc.nextInt();
		int deletedItem = a[index];
		for(int i = index ; i < size ; i++)
		{
			a[i] = a[i+1];
		}
		size = size - 1;
		System.out.println("\nRemoved Element : " + deletedItem);
	}


	public void deleteLast() {
		//No shifting is required , just decrement array size by 1
		size = size - 1;
		System.out.println("\nRemoved Element");
		
	}


	public void insertAtMiddle() {
		
		System.out.print("\nEnter the index where you want to insert element : ");
		int index = sc.nextInt(); //Should be less than or equal to size-1
		
		System.out.print("\nEnter Element you want to insert at ["+index+"]: ");
		int item = sc.nextInt();
		
		size = size + 1; //Increment array size by 1
	
		for(int i = size-1; i >= index+1; i--){
			a[i]  = a[i-1];
		}
		a[index] = item;	
		
		System.out.println(a[index]+" inserted at ["+index+"]\n");
	}


	public void displayElements() {
		System.out.println("\nElements of Array :\n");
		for (int i = 0; i < size; i++) {
			System.out.print("["+i+"]:  "+a[i]);
			System.out.println(" ");
		}
		
	}
}
