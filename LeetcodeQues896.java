// leetcode question 896: Monotonic Array

import java.util.*;

class LeetcodeQues896{

	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n = xyz.nextInt();
		
		int a[] = new int[n];
		System.out.println("Enter elements in an array: ");
		for(int i=0; i<a.length; i++){
			
			a[i] = xyz.nextInt();
			
		}
		
		System.out.println("If monotronic found then true otherwise false : " + IsMonoTronic(a));
		
		
	}
	public static boolean IsMonoTronic(int nums[]){
		
		boolean incre = false;
		boolean decre = false;
		
		for(int i=1; i<nums.length; i++){
			
			if(nums[i]>nums[i-1]){
				incre = true;
				
			}else if(nums[i]<nums[i-1]){
				decre = true;
			}
		}
		return !(decre&&incre);
	}
}

		
	
	

	

	