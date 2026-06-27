class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);

        int n = spells.length;
        int m = potions.length;
        int res[] = new int[n];
        for(int i=0; i<n; i++){
            long minpotion = (success + spells[i]-1)/spells[i];
            int left=0,right=m-1,index=m;
            while(left<=right){
                int mid = left +(right-left)/2;
                if(potions[mid]>=minpotion){
                    index = mid;
                    right = mid-1;
                }
                else{
                    left = mid +1;

                }

            }
            res[i] = m-index;
        }
        return res;
          
    }
}