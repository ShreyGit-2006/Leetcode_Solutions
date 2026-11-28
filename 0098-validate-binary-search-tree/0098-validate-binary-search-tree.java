class Solution {
    private boolean valid(TreeNode main, TreeNode left, TreeNode right) {
        if (main == null) return true;

        if (left != null && main.val <= left.val) return false;
        if (right != null && main.val >= right.val) return false;

        return valid(main.left, left, main) && valid(main.right, main, right);
    }

    public boolean isValidBST(TreeNode root) {
        return valid(root, null, null);
    }
}