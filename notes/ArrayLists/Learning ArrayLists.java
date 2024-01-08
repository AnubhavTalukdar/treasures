import java.util.*;
public class Main
{
    //Learn add(position, data), remove(item or position), set, iteration thru advanced for-loop, indexOf(item), get(position), 
    // sorting, reversing & clearing
    
	public static void main(String[] args) {
        
        ArrayList<String> alist = new ArrayList<String>();
        
        ArrayList<Integer> intList = new ArrayList<Integer>();
        
        alist.add("A"); //Equivalent to JS's push method
        
        alist.add(1, "T"); //Pushing a new element in a specific position
        
        alist.set(1, "W"); //Updating an existing element 
        
        alist.add("X");
        alist.add("Y");
        alist.add("Z");
        alist.add("A");
        
        System.out.println(alist);
        
        //Now our ArrayList is [A, W, X, Y, Z, A]
        
        
        
        alist.remove("A"); //Now, only the first instance of A will be removed.
        
        //Now our ArrayList is [W, X, Y, Z, A] 
        
        System.out.println(alist);
        
        
        
        alist.remove(4); //The .remove() can also accept integers to denote positions to be removed.
        
        //Now our array is [w, X, Y, Z]     
        
        System.out.println(alist);
        
        
        //The proper way of iterating through a Array List is to use an advanced for-loop as shown below
        
        for(String str:alist)
            System.out.println(str);
            
        System.out.println("No. of elements in the Array list: "+alist.size());
        
        //Prints 4
        
        alist.add("A");
        
        alist.add("X");
        
        // Searching through an ArrayList:
        
        int pos = alist.indexOf("X"); //Returns -1 if no matches found
        System.out.println("Position of X: "+pos);
        
        //Returns 1 i.e. the first occurence only.
        
        
        //To fetch an item from the ArrayList:
        
        String str = alist.get(1); //Grab item at index 1 
        System.out.println("Element at position 1: "+str);
        
        //Prints X
        
        
        //To check the existence of an item in an ArrayList:
        
        boolean flag = alist.contains("Democracy");
        System.out.println("Does \"Democracy\" exist? "+flag);
        
        //Prints false

        System.out.println("Final list: "+alist);
        
        //Prints [W, X, Y, Z, A, X]
        
        
        //Sorting an ArrayList lexicographically:
        Collections.sort(alist);
        System.out.println("Sorted list: "+alist); 
        
        //Prints [A, W, X, X, Y, Z]  
        
        //Reversing a list:
        Collections.reverse(alist);
        System.out.println("Reversed list: "+alist); 
        
        //Prints [A, W, X, X, Y, Z]  

        
        
        //Clearing an ArrayList:
        alist.clear();
        System.out.println("The ArrayList after clearing: "+alist);
        
        //Prints []

		
		
		
		
	}
}

