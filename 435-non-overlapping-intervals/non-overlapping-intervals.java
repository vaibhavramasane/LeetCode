class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int res = 0;
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        int prend = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (prend > intervals[i][0]) {
                res++;
            } else {
                prend = intervals[i][1];
            }
        }
        return res;        
    }
}