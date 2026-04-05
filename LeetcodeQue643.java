import java.util.*;

class LeetcodeQue643 {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;

        
        for (int i = 0; i < k; i++) {

            sum += nums[i];

        }
        double maxSum = sum;

        // Slide the window
        for (int i = k; i < nums.length; i++) {
            sum = sum + nums[i]-nums[i-k];
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum / k;
    }
	public static void main(String x[]){
	
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter size: ");
		int n = xyz.nextInt();
		
		int a[] = new int[n];
		System.out.println("Enter element in array: ");
		for(int i=0; i<a.length; i++){
		
			a[i] = xyz.nextInt();
			
		}
		System.out.println("Enter kth term: ");
		int k = xyz.nextInt();
		
		LeetcodeQue643 obj = new LeetcodeQue643();
		int res = obj.findMaxAverage(a,k);
		System.out.println("Average of subarray : " + res);
		
	}
}
		
