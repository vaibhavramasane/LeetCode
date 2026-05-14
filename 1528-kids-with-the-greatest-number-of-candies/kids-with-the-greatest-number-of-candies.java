class Solution { //vaibhav
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        int maxc =0;
        for(int candy : candies){
            maxc = Math.max(maxc,candy);
        }

        List<Boolean> res = new ArrayList<>();
        for(int candy : candies){
            if(candy + extraCandies >= maxc) res.add(true);
            else res.add(false);
            
        }
        return res;
        
    }
}