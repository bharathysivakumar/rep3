package sampl;

public class MinMax { 
	    public static void main(String[] args) {
	        int arr[] = new int[]{1,2,3,-4,-5,6,-9,0,3,-1};         
	        int max = arr[0];
	        int min = arr[0];
	        for(int i = 1; i < arr.length; i++){
	            if(max < arr[i]){
	                max = arr[i];
	            }else if(min > arr[i]){
	                min = arr[i];
	           }                      
	        }
	        System.out.println("Maximum number = " 
	             + max + " Minimum number = " + min);        
	    }
	}

