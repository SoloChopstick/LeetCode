/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

/*
Recursion
*/
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode left = root.left;
        TreeNode right = root.right;
        root.left = invertTree(right);
        root.right = invertTree(left);
        return root;
    }
}

/*
BFS
*/
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode current = q.remove();
            TreeNode temp = current.left;
            current.left = current.right;
            current.right = temp;
            if (current.left != null) q.add(current.left);
            if (current.right != null) q.add(current.right);
        }
        return root;
    }
}

/*
DFS
*/
class Solution {
    public TreeNode invertTree(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        if (root == null) return null;
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode current = stack.pop();
            TreeNode temp = current.left;
            current.left = current.right;
            current.right = temp;
            if (current.right != null) stack.push(current.right);
            if (current.left != null) stack.push(current.left);
        }
        return root;
    }
}