import java.util.Arrays;
//The Arrays class is present in the java.util package

public class Main
{
	public static void main(String[] args) 
	{
	    
        int arr[] = {20, 10, 35, 15, 22, 13, 17}, i;
         
        Arrays.sort(arr);
        
        for(i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
            
        //Output: 10 13 15 17 20 22 35
        
        System.out.println();

         
        Arrays.sort(arr,2,5); //1st index inclusive, 2nd index exclusive
         
        for(i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        
        //Output: 20 10 15 22 35 13 17
		
		System.out.println();
		
		String cities[] = {"Delhi", "Chennai", "Alaska", "Calcutta", "Madras", "Mumbai", "Amritsar"};
		Arrays.sort(cities);
		for(i=0;i<cities.length;i++)
			System.out.print(cities[i]+" ");
			
		//Output: Alaska Amritsar Calcutta Chennai Delhi Madras Mumbai


	}
}
