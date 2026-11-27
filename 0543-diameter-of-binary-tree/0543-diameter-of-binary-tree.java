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
    int dia=0;
    private int maxDepth(TreeNode root)
    {
        if(root==null) return 0;
        int sleft=maxDepth(root.left);
        int sright=maxDepth(root.right);

        int currlen=sleft+sright;
        if(currlen>dia)
        {
            dia=currlen;
        }
        return 1+Math.max(sleft,sright);
    }
   int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 0;
        maxDepth(root);
        return dia;
    }
}