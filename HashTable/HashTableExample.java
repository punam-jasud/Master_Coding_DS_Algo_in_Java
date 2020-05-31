package HashTable;

import java.util.Hashtable;
import java.util.Iterator;

public class HashTableExample {

	public static void main(String[] args) {
		
		//1.create hashtable
		Hashtable<Integer,String> hashtable = new Hashtable<>();
		
		//2.Add mappings to hashtable
		hashtable.put(1, "A");
		hashtable.put(2, "B");
		hashtable.put(3, "C");
		hashtable.put(4, "D");
		hashtable.put(5, "E");
		
		System.out.println(hashtable);
		
		//3. get a mapping key
		String value = hashtable.get(1); //A
		System.out.println(value);
		
		//4.Removing a mapping
		hashtable.remove(3);  //3 will be deleted
		
		//5.Iterate over mappings
		Iterator<Integer> itr = hashtable.keySet().iterator();
		
		while(itr.hasNext())
		{
			Integer key = itr.next();
			String mappedValue = hashtable.get(key);
			System.out.println("Key : " + key + " , Value : " + mappedValue);
		} 

	}

}
