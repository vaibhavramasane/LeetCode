import java.util.*;

class twosum { 
    
    public int[] twoSum(int[] nums, int target) {
        int a[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    a[0] = i;
                    a[1] = j;
                }
            }
        }
        return a;
    }
    
    public static void main(String[] args) {
        twosum solution = new twosum();
        Scanner xyz = new Scanner(System.in);
		System.out.println("Enter size: ");
		int n = xyz.nextInt();
		
		int nums[] = new int[n];
		System.out.println("Enter elements in an array: ");
		for(int i=0; i<nums.length; i++){
			
			nums[i] = xyz.nextInt();
			
		}
		
		System.out.println("Enter a target: ");
		int target = xyz.nextInt();
		
		
        //int[] nums = {2, 7, 11, 15};
        //int target = 9;
        
        int[] result = solution.twoSum(nums, target);
        
        System.out.println("Indices: " + Arrays.toString(result));
    }
}
