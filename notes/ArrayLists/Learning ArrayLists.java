import java.util.*;
public class Main
{
	public static void main(String[] args) {
        
        ArrayList<String> alist = new ArrayList<String>();
        
        ArrayList<Integer> intList = new ArrayList<Integer>();
        
        alist.add("Anubelle"); //Equivalent to JS's push method
        
        alist.add(1, "Talukdar"); //Pushing a new element in a specific position
        
        alist.set(1, "Shreyabelle"); //Updating an exisiting element 
        
        alist.add("Talukdar");
        alist.add("Jaiswal");
        alist.add("Talukdar");
        
        //Now our array is [Anubelle, Shreyabelle, Talukdar, Jaiswal, Talukdar] 
        
        
        
        alist.remove("Talukdar"); //Now, only the first instance of Talukdar will be removed.
        
        //Now our array is [Anubelle, Shreyabelle, Jaiswal, Talukdar] 
        
        
        
        alist.remove(3); //The .remove() can also accept integers to denote positions to be removed.
        
        //Now our array is [Anubelle, Shreyabelle, Jaiswal]    
        
        
        
        //The proper way of iterating through a Array List is to use an advanced for loop as shown below
        
        for(String str:alist)
            System.out.println(str);
            
        System.out.println("No. of elements in the Array list: "+alist.size());
        
        
        // Searching through an ArrayList:
        
        int pos = alist.indexOf("Shreyabelle"); //Returns -1 if no matches found
        System.out.println("Position of Shreyabelle: "+pos);
        
        
        //To fetch an item from the ArrayList:
        
        String str = alist.get(1); //Grab item at index 1 
        System.out.println("Element at position 1: "+str);
        
        
        //To check the existence of an iten in an ArrayList:
        
        boolean flag = alist.contains("Democracy");
        System.out.println("Does \"Democracy\" exist? "+flag);
        
        
        
        
        //Sorting an ArrayList lexicographically:
        
        Collections.sort(alist);
        
        System.out.println("Final list: "+alist); //Printing our ArrayList
        
        //Reversing a list:
        
        Collections.reverse(alist);
        System.out.println("Reversed list: "+alist); //Printing our ArrayList

        
        
        //Clearing an ArrayList:
        
        alist.clear();
        System.out.println("The ArrayList after clearing: "+alist); //Printing our ArrayList

		
		
		
		
	}
}
