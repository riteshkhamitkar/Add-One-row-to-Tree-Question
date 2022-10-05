class Solution {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth == 1){
            return new TreeNode(val, root, null);
        } else {
            solve(root, val, depth);
            return root;
        }
    }
    void solve(TreeNode h, int val, int depth){
        if(h != null){
            depth -= 1;
            if(depth == 1){
                h.left = new TreeNode(val, h.left, null);
                h.right = new TreeNode(val, null, h.right);
            } else {
                solve(h.left, val, depth);
                solve(h.right, val, depth);
            }
        }
    }
}
