package sampl;

import java.util.Scanner;

public class Sample12 {
	
	/*public boolean only14(int[] nums) {

		  boolean flag = false;

		  for (int i = 0; i < nums.length; i++) {

		    if (nums[i] == 1 || nums[i] == 4) {
		      flag = true;
		    } else {
		      return false;
		    }
		  }
		  return flag;
		}public static void main ( String args [] )
		{
			Scanner sc = new Scanner ( System.in ) ;
			int nums[] = new int[5];
			for(int i=0;i<5;i++) {
				nums[i]=sc.nextInt();
			}
		*/
	public static void main ( String args [] )
	{
		Scanner sc = new Scanner ( System.in ) ;
	int i, k=0 ;
	int a [] = new int [ 5] ;
	System.out.println (" Enter the array elements ");
	for ( i=0;i<a.length;i++)
	{
	a [i] = sc.nextInt();
	}
	System.out.println ("The array elements are");
	for ( i=0;i<a.length;i++)
	{
	System.out.println ( a[ i ] + " " ) ;
	}
	for ( i=0;i<a.length;i++)
	{
	if ( a [ i ] == 1 || a [ i ] == 4 )
	k++;
	}
	if ( k == a.length )
	System.out.println (" True ");
	else
	System.out.println (" False ");

}}