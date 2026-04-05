import java.util.*;
class LeetcodeQu27 {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        return i;
        
    }
	
	public static void main(String x[]){
	
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter size: ");
		int n = xyz.nextInt();
		
		int a[] = new int[n];
		System.out.println("Enter element in an array: ");
		for(int i=0; i<a.length; i++){
		
			a[i] = xyz.nextInt();
			
		}
		System.out.println("Enter value: ");
		int v = xyz.nextInt();
		
		LeetcodeQu27 obj  = new LeetcodeQu27();
		int res = obj.removeElement(a,v);
		System.out.println("Output: " + res);
		
	}
	
		
}