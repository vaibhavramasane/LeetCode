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
    private int ans =0;
    public int longestZigZag(TreeNode root) {
        dfs(root,true,0);
        dfs(root,false,0);
        return ans;  
    }
    private void dfs(TreeNode N,boolean Lef,int length){
        if(N==null) return;
        ans = Math.max(ans,length);
        if (Lef) {
            dfs(N.left, false, length + 1);
            dfs(N.right, true, 1);
        } else {
            dfs(N.right, true, length + 1);
            dfs(N.left, false, 1);
        }
    }
}