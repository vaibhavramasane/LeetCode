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
    public int maxLevelSum(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);

        int maxsum = Integer.MIN_VALUE;
        int maxlevel =1;
        int currlevel = 1;

        while(!que.isEmpty()){
            int levelsize = que.size();
            int levelsum =0;

            for(int i=0; i<levelsize; i++){
                TreeNode node = que.poll();
                levelsum += node.val;
                if(node.left!=null) que.offer(node.left);
                if(node.right !=null) que.offer(node.right);
            }
            if(levelsum > maxsum){
                maxsum = levelsum;
                maxlevel =currlevel;
            }
            currlevel++;
        }
        return maxlevel;
        
    }
}