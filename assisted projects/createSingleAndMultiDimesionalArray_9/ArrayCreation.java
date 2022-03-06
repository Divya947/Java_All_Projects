package createSingleAndMultiDimesionalArray_9;

public class ArrayCreation {
	public static void single()
	{
		int a[]=new int[3]; 
	    a[0]=10;  
	    a[1]=20;  
	    a[2]=30;   
	    for(int i=0;i<a.length;i++)
	        System.out.println(a[i]); 
	}
	public static void multi()
	{
		int arr[][]={{1,2,3},{4,5,6},{7,8,9}};  
		for(int i=0;i<3;i++)
		{  
		 for(int j=0;j<3;j++)
		 {  
		   System.out.print(arr[i][j]+" ");  
	     }  
		 System.out.println();
		}
	}
	public static void main(String args[]){  
		single();
		multi();
	}
}
