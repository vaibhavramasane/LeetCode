class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
        int res[] [] = new int[n][2];
        for(int i=0; i<n; i++)
            res[i] = new int[]{nums2[i],nums1[i]};
        Arrays.sort(res,(a,b) ->b[0]-a[0]);
        PriorityQueue<Integer> pq = new PriorityQueue<>(k, (a, b) -> a - b);
        long ees = 0, sumS = 0;
        for (int[] es : res) {
            pq.add(es[1]);
            sumS = (sumS + es[1]);
            if (pq.size() > k)
                sumS -= pq.poll();
            if (pq.size() == k)
                ees = Math.max(ees, (sumS * es[0]));
        }
        return ees;
    }
}