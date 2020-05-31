//Java Program to implement hash table
package HashTable;

import java.util.Scanner;

 class HashTable {

	 int arr[];
	 int capacity;
	 
	 //constructor
	public HashTable(int capacity) {
		this.capacity = nextPrime(capacity);
		arr = new int[this.capacity];
		
	}

	//Function to insert
	public void insert(int item) {
		
		arr[item % capacity] = item ;
	}

	//Function to clear
	public void clear() {
		
		arr = new int[capacity];
	}
	
	//Function contains
	public boolean contains(int item) {
		
		return arr[item % capacity] == item;
	}
	
	//Function to delete
	public void delete(int item) {
		
		if(arr[item % capacity] == item)
			arr[item % capacity] = 0;
		else
            System.out.println("\nError : Element not found\n");
		
	}

	 /** Function to generate next prime number >= n **/
	private int nextPrime(int n) {
			
		if( n % 2 == 0)
			n++;
		
		for (; !isPrime(n); n += 2);
		 
        return n;
		
	}
	
	/** Function to check if given number is prime **/
    private static boolean isPrime(int n)
    {
        if (n == 2 || n == 3)
            return true;
        if (n == 1 || n % 2 == 0)
            return false;
        for (int i = 3; i * i <= n; i += 2)
            if (n % i == 0)
                return false;
        return true;
    }

	//Function to print hashtable
	public void printTable() {
		System.out.print("\nHash Table = ");
		for (int i = 0; i < capacity; i++)
            System.out.print(arr[i] +" ");
        System.out.println();
		
	}
	 

}

public class HashTableImpl {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Hash Table Set");
		System.out.println("Enter Size : ");
		//Make object of hashtable
		HashTable ht = new HashTable(sc.nextInt());

		char ch;
		//Perform hash table operations
		do
		{
			System.out.println("\nHash Table Operations\n");
            System.out.println("1. Insert ");
            System.out.println("2. Remove");
            System.out.println("3. Contains");            
            System.out.println("4. Clear");
            
            int choice = sc.nextInt();
            switch(choice)
            {
	            case 1 : 
	                System.out.println("Enter integer element to insert");
	                ht.insert( sc.nextInt() ); 
	                break;                          
	            case 2 :                 
	                System.out.println("Enter integer element to delete");
	                ht.delete( sc.nextInt() ); 
	                break;                        
	            case 3 : 
	                System.out.println("Enter integer element to check if present");
	                System.out.println("Contains : "+ ht.contains(sc.nextInt() ));
	                break;                                   
	            case 4 : 
	                ht.clear();
	                System.out.println("Hash Table Cleared\n");
	                break;
	            default : 
	                System.out.println("Wrong Entry \n ");
	                break;   
	            }
            //Display hash table
            ht.printTable();
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = sc.next().charAt(0);
			
		}while(ch == 'Y' || ch == 'y');
	}

}
