class Solution {
    int min = Integer.MAX_VALUE;
    TreeNode prev = null;

    private void diff(TreeNode root) {
        if (root == null) return;

        diff(root.left);

        if (prev != null) {
            min = Math.min(min, root.val - prev.val);
        }

        prev = root;

        diff(root.right);
    }

    public int minDiffInBST(TreeNode root) {
        diff(root);
        return min;
    }
}