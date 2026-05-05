import java.util.*;
class LeetcodeQues53 {
    public int maxSubArray(int[] nums) {
        int sum = 0 , maxi = Integer.MIN_VALUE;;
        int i = 0 , j = 0;
        while(j<nums.length){
           
            if(sum < 0 && nums[j] >= sum){
                sum = 0;
                i = j;
            }
             sum += nums[j];
            maxi = Math.max(maxi , sum);
            j++;
        }
        return maxi;
    }
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter size: ");
		int n = xyz.nextInt();
		
		int a[] = new int[n];
		System.out.println("enter elements in an array: ");
		for(int i=0; i<a.length; i++){
			
			a[i] = xyz.nextInt();
			
		}
		LeetcodeQues53 obj= new LeetcodeQues53();
		int result = obj.maxSubArray(a);
		System.out.println("Maximum Subarray: " + result);
	}
}