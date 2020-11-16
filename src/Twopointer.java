import java.util.*;
public class Twopointer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				 int A[] = { 1, 4, 45, 6, 10, -8 };
			     int target = 16;
			     int arr_size = A.length;
		
			     if(hastwoSum(A,arr_size,target)) 
					  System.out.println("Array has two elements with given target");
			     
				  else 
					  System.out.println("Array doesn't have two elements with given target");
				  
			  }

	public static boolean hastwoSum(int[] arr, int arr_size, int target) {
		// TODO Auto-generated method stub
		int i=0; int j= arr_size-1;
		   Arrays.sort(arr);
		   while(i<j) {
			   if(arr[i] + arr[j] < target) 
				   i++;
			   
			   else if(arr[i] + arr[j] > target) 
				   j--;
			   
			   else 
				   return true;
			   
		   }
		   return false;
	}

}
