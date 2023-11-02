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
    int currValue;
    int currCount = 0;
    int maxCount = 0;
    List<Integer> mode = new ArrayList<>();
    public int[] findMode(TreeNode root) {
        traversal(root);
        int[] result = new int[mode.size()];
        for (int i = 0; i < mode.size(); i++){
            result[i] = mode.get(i);
        }
        return result;
    }
    void traversal (TreeNode node){
        if (node == null)
            return;
        
        traversal(node.left);
        if (node.val == currValue){
            currCount = currCount + 1;
        }
        else{
            currValue = node.val;
            currCount = 1;
        }
        if (currCount == maxCount){
            mode.add(node.val);
        }
        else if (currCount > maxCount){
            maxCount = currCount;
            mode.clear();
            mode.add(node.val);
        }
        traversal (node.right);
    }
}