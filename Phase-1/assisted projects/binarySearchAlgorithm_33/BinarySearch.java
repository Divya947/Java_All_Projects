package binarySearchAlgorithm_33;
import java.util.Scanner;
public class BinarySearch 
{
	public static  void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

	        int[] arr = {1,2,3,7,9,10,17,22,26,27};
	        System.out.println("Enter the key value to search:");
	        int key = sc.nextInt();
	        int arrlength = arr.length;
	        binarySearch(arr,0,key,arrlength);
	    }

	public static void binarySearch(int[] arr, int start, int key, int length){

	        int midValue = (start+length)/2;
	        while(start<=length){

	            if(arr[midValue]<key){

	                start = midValue + 1;
	            } else if(arr[midValue]==key){
	                System.out.println("Element is found at index :"+midValue);
	                break;
	            }else {

	                length=midValue-1;
	            }
	            midValue = (start+length)/2;
	        }
	            if(start>length){

	                System.out.println("Element is not found");
	            }

	}

}
