/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int goodNodes(TreeNode root) {
        return DFS(root,root.val);        
    }
    public int DFS(TreeNode node,int maxx){
        if(node == null )return 0;
        int count=0;
        if(node.val>=maxx) count=1;
        maxx = Math.max(maxx,node.val);
        count+=DFS(node.left,maxx);
        count+=DFS(node.right,maxx);
        return count;
    }
}