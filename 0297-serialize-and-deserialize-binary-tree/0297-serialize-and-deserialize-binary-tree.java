public class Codec {

    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        ser(root, sb);
        return sb.toString();
    }

    void ser(TreeNode root, StringBuilder sb) {
        if(root == null) {
            sb.append("#,");
            return;
        }

        sb.append(root.val).append(",");
        ser(root.left, sb);
        ser(root.right, sb);
    }

    public TreeNode deserialize(String data) {
        String[] arr = data.split(",");
        Queue<String> q = new LinkedList<>(Arrays.asList(arr));
        return des(q);
    }

    TreeNode des(Queue<String> q) {
        String s = q.poll();

        if(s.equals("#"))
            return null;

        TreeNode root = new TreeNode(Integer.parseInt(s));
        root.left = des(q);
        root.right = des(q);

        return root;
    }
}