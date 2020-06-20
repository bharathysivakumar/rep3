package sampl;

import java.util.*;

public class Duplicate {
	/* public static void main(String[] args) {     
	        int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};   
	          
	        System.out.println("Duplicate elements in given array: "); 
	        for(int i = 0; i < arr.length; i++) {  
	            for(int j = i + 1; j < arr.length; j++) {  
	                if(arr[i] == arr[j])  
	                    System.out.println(arr[j]); */ 
	            ////}  
	      //  }  


		public static void main(String[] args) {
			int[] array = {12, 34, 12, 45, 67, 89};
			List<Integer> distinctArray = new ArrayList<>();

			for (int item : array) {
				if (!distinctArray.contains(item))
					distinctArray.add(item);
			}

			System.out.println(Arrays.toString(distinctArray.toArray()));		
	    }  
}
