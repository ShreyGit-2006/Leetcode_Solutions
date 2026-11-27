class Solution {
    int tilt = 0;
    private int Sum(TreeNode root)
    {
        if(root == null) return 0;
        int left = Sum(root.left);
        int right = Sum(root.right);
        tilt += Math.abs(left - right);
        return left + right + root.val;
    }

    public int findTilt(TreeNode root) {
        Sum(root);
        return tilt;
    }
}