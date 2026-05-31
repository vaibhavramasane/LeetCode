import java.util.*;
class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int n : arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        HashSet<Integer> set = new HashSet<Integer>();
        for(int f : map.values()){
            if(!set.add(f)){
                return false;
            }
        }
        return true;
    }
}