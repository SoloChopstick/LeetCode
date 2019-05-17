/*
Solution 1: Recursion
Time: O(n)
Space: O(n)
*/
class Solution {
    public boolean isValidBST(TreeNode root) {
        return helper (root, null, null);
    }
    
    public boolean helper (TreeNode node, Integer min, Integer max) {
        //base case
        if (node == null) {
            return true;
        }
        //Bad cases
        if (min != null && node.val <= min) {
            return false;
        }
        if (max != null && node.val >= max) {
            return false;
        }
        //recursive call
        else {
            return helper(node.left, min, node.val) && helper(node.right, node.val, max);
        }
    }
}