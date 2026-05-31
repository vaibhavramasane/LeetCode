import java.util.*;
class Solution {
    public boolean uniqueOccurrences(int[] arr) {

       int freq[]=new int[2001];
        for(int i=0;i<arr.length;i++)
        {
            freq[arr[i]+1000]++;
        }
        Set<Integer> set=new HashSet<>();
        for (int count : freq) {
            if (count > 0) {
                if (!set.add(count)) return false;
            }
        }
        return true; 
    }
}