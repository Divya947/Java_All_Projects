package arrayRotation_22;

	class RotateArray 
	{ 
		public void rotate(int[] num, int k) 
		{
		    		if(k > num.length) 
		       			k=k%num.length;
		 		int[] result = new int[num.length];
		 		for(int i=0; i < k; i++)
		 		{
		        			result[i] = num[num.length-k+i];
		 		}
		 		int j=0;
		    		for(int i=k; i<num.length; i++)
		    		{
		        			result[i] = num[j];
	                     	j++;
		    		}
		 		System.arraycopy( result, 0, num, 0, num.length );
		}
	} 
	public class ArrayRotation 
	{
			public static void main(String[] args) 
			{
				RotateArray r = new RotateArray();
		        		int arr[] = { 2, 4, 6, 8, 10, 12, 14 }; 
		        		r.rotate(arr, 4); 
		        		for(int i=0;i<arr.length;i++)
		        		{
		            			System.out.print(arr[i]+" ");
		        		}
			}
	}

