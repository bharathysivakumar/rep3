package sampl;

import java.util.Arrays;

public class SmallestLargest {
	public static void main(String args[]) {
	int arr[]=new int[]{0,2,34,12,67};
		/*int smallest=arr[0];
		int largest=arr[0];
		//smallest number
		for(int i=0;i<arr.length;i++){
		//	for(int j=0;j<arr.length;j++) {
		if(arr[i]<smallest){
		smallest=arr[i]; }
		//	}
		if(arr[i]>largest){ 
		largest=arr[i]; }}
		System.out.println(smallest+" "+largest);*/
		Arrays.sort(arr);

		System.out.println("Smallest two in the array: " + arr[0] + " and " + arr[1]);
		System.out.println("Largest two in the array: " + arr[arr.length-1] + " and " + arr[arr.length-2]);
	}
}
