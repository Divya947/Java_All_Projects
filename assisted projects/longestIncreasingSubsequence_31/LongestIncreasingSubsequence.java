package longestIncreasingSubsequence_31;

public class LongestIncreasingSubsequence 
{
	LongestIncreasingSubsequence(int my_arr[], int arr_len)
	{
		 int LongestIncreasingSubsequence;int[] arr = null; int i = 0; int n = 0; int prev = 0;
		 {
			 if (i == n) {
				 return;
				 }
		 }
		 int excl = LongestIncreasingSubsequence(arr, i + 1, n, prev);
		 // case 2: include the current element if it is greater
		 // than the previous element in LIS
		 int incl = 0;
		 if (arr[i] > prev) {
		 incl = 1 + LongestIncreasingSubsequence(arr, i + 1, n, arr[i]);
		 }
		 return;
	 }
	 private static int LongestIncreasingSubsequence(int[] arr, int i, int n, int prev) {
		// TODO Auto-generated method stub
		return 0;
	}
	public static void main(String[] args)
	 {
	 int[] arr = { 1, 5, 8, 20, 11, 16, 60, 25, 45, 35, 15,66,19 };
	 System.out.print("The length of the LIS is "
	 + LongestIncreasingSubsequence(arr, 0, arr.length, Integer.MIN_VALUE));
	 }
	}