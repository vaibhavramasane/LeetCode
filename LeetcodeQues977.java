// Leetcode question Number 977 : Square of a sorted Array

import java.util.*;

class LeetcodeQues977{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n = xyz.nextInt();
		
		int a[] = new int[n];
		System.out.println("Enter elements in an array: ");
		for(int i=0; i<a.length; i++){
			
			a[i] = xyz.nextInt();
			
		}
		int res[] = sortarr(a);
		System.out.println("Square of a Sorted Array : " );
		for(int i=0; i<a.length; i++){
			
			System.out.println(res[i]);
			
		}
		
	}
	
	public static int[] sortarr(int nums[]){
			
		
		int arr[] = new int[nums.length];
		for(int i=0; i<nums.length; i++){
			
			arr[i] = nums[i] * nums[i];
			
		}
		Arrays.sort(arr);
		return arr;
		
	}
}

		

