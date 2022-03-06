package exponentialSearchAlgorithm_34;
import java.util.Arrays;
import java.util.Scanner;
public class ExponentialSearch 
{
	public static  void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] arr = {1,3,4,6,7,9,12,16,19,21};
		System.out.println("Enter the value of array to search:");
	    int length= arr.length;
	    int value =sc.nextInt();
	    int outcome = expSearch(arr,length,value);

	    if(outcome<0)
	    {

	       System.out.println( "Element is not present in the array");

	    }
	    else 
	    {

	        System.out.println( "Element is  present in the array at index :"+outcome);
	    }

	 }
	public static int expSearch(int[] arr ,int length, int value )
	{
		if(arr[0]==value)
		{
	            return 0;
	    }
	    int i=1;
	    while(i<length && arr[i]<=value)
	    {
	    	i=i*2;
	    }
	    return Arrays.binarySearch(arr,i/2,Math.min(i,length),value);
	}


}
