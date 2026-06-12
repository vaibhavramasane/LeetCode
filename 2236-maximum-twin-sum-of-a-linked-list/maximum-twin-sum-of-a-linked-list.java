/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        ArrayList<Integer> l = new ArrayList<>();
        ListNode n = head;
        while(n!=null){
            l.add(n.val);
            n = n.next;
        }
        int k = l.size(),maxx = -1;
        for(int i=0; i<k/2; i++){
            int x = l.get(i) + l.get(k-i-1);
            maxx = Math.max(maxx,x);
        }
        return maxx;
        
    }
}