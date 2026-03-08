//Leetcode Question 704

import java.util.*;
class LeetcodeQues704{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n = xyz.nextInt();
		
		int a[]=new int[n];
		System.out.println("Enter element in an array");
		for(int i=0; i<a.length; i++){
			
			a[i] = xyz.nextInt();
			
		}
		System.out.println("Enter target: ");
		int target = xyz.nextInt();
		
		int res = BinarySearch(a,target);
		System.out.println("Target found on index : " + res);
		
		
	}
	
	public static int BinarySearch(int nums[],int target){
		// Main logic
		int n = nums.length;
		Arrays.sort(nums);
		int left=0,right=nums.length-1;
		while(left<=right){
			
			int mid = left +(right-left)/2;
			
			if(nums[mid] == target){
				
				return mid;
				
			}else if(nums[mid] <target){
				
				left = mid + 1;
				
			}else {
				
				right = mid -1 ;
				
			}
			
		}
		return -1;
	}
	
	
}
			
			
		

