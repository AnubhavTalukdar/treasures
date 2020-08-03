//Learning 2D ArrayLists

import java.util.*;

public class Main
{
    public static void main (String[]args)
    {
        //Declaring the 2D Array:
        ArrayList<ArrayList<Integer>> arr = new ArrayList < ArrayList<Integer>>();
        
        //Allocating space for the first row. Without doing this, the get() will return an error
        //in the next statement
        
        arr.add(0, new ArrayList<Integer>());
        
        //Adding the first element = 1 to (0,0);
        //Follow the format arr.get(i).add(j, data);
        
        arr.get(0).add(0, 1);
        
        //Populating our matrix:
        arr.get(0).add(1, 2);
        arr.get(0).add(2, 3);
        
        arr.add(1, new ArrayList<Integer>());
        
        //For 2nd row,
        arr.get(1).add(0, 4);
        arr.get(1).add(1, 5);
        arr.get(1).add(2, 6);
        
       //For 3rd row,
        arr.add(2, new ArrayList<Integer>(Arrays.asList(7,8,9)));
        
        
                
        int i, j, sum1 = 0, sum2=0, size = arr.size(), ;

        for(i=0, j=--size;i<size; i++,j--)
        {
            sum1+ = arr.get(i).get(i);
            sum2+ = arr.get(i).get(j);
        }
        return Math.abs(sum1-sum2);
        
        
        
        System.out.println(arr);
        
        //Accessing a specific element from the matrix:
        System.out.println("2nd element: "+arr.get(0).get(1));
    
    }
}
