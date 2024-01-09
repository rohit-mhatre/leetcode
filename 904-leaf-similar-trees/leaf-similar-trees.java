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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaf1 = new ArrayList<>();
        List<Integer> leaf2 = new ArrayList<>();

        collectValues (root1, leaf1);
        collectValues (root2, leaf2);

        return leaf1.equals(leaf2);        
    }

    private void collectValues (TreeNode root, List<Integer> leaf) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            leaf.add (root.val);
        }
        collectValues (root.left, leaf);
        collectValues (root.right, leaf);
    }
}