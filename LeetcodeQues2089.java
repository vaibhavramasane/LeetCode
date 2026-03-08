// Leetcode Number 2089 : 
import java.util.*;

class LeetcodeQues2089{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n = xyz.nextInt();
		
		int a[] = new int[n];
		System.out.println("Enter element in an array: ");
		for(int i =0; i<a.length; i++){
			
			a[i] = xyz.nextInt();
			
		}
		System.out.println("Enter a Target: ");
		int t = xyz.nextInt();
		
		List<Integer> res = targetIndices(a,t);
		System.out.println("Target found at Index: " + res);
		
	}
	
	public static List<Integer> targetIndices(int[] nums, int t) {
		
		Arrays.sort(nums);
		ArrayList<Integer>li = new ArrayList<Integer>();
		for(int i=0; i<nums.length; i++){
			
			if(nums[i] == t){
				
				li.add(i);
				
			}
		}
		return li;
	}
}

