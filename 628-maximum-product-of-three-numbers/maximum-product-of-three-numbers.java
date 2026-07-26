class Solution {
    public int maximumProduct(int[] a) {
        Arrays.sort(a);

        int p1=a[0]*a[1]*a[a.length-1];
        int p2=a[a.length-1]*a[a.length-2]*a[a.length-3];

        return Math.max(p1,p2);
    }
}