class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;
        int seqsum =nums[0];
        for(int j=1; j<n; j++){
            if(nums[j]== nums[j-1]+1){
                seqsum+=nums[j];
            }else{
                break;
            }
        }
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int x =seqsum;
        while(set.contains(x)) x++;
        return x;
        
    }
}