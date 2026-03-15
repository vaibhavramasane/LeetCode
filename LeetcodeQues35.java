// leetcode 35 question
/*Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2 */

import java.util.*;

class LeetcodeQues35{
	
	public static void main(String x[]){
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter size: ");
		int n = xyz.nextInt();
		
		int a[] = new int[n];
		System.out.println("Enter elements in an array: ");
		for(int i=0; i<a.length; i++){
			
			a[i]= xyz.nextInt();
			
		}
		System.out.println("Enter target: ");
		int t = xyz.nextInt();
		
		
		int res = search(a,t);
		System.out.println("output: " + res);
		
	}
	
	public static int search(int [] nums, int target){
		
		int left =0,mid,right=nums.length-1;
		while(left<right){
			
			mid = left + (right -left)/2;
			if(nums[mid] == target){
				
				return mid;
				
			}
			else if(nums[mid]<target){
				
				left = mid + 1;
				
			}else{
				
				right = mid -1;
			}
		}
		return left;
	}
}


	






