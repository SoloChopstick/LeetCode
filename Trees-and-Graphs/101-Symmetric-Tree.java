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
    public boolean isSymmetric(TreeNode root) {
        return helper(root, root);
    }
    
    public boolean helper (TreeNode l, TreeNode r) {
        if (l == null && r == null) return true;
        else if (l == null || r == null) return false;
        else if (l.val == r.val) return helper(l.left, r.right) && helper(l.right, r.left);
        else return false;
    }
}


/*
Iterative BFS solution using Queue
*/

class Solution {
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode l = q.remove();
            TreeNode r = q.remove();
            if (l == null && r == null) continue;
            else if (l == null || r == null) return false;
            else if (l.val != r.val) return false;
            else {
                q.add(l.left);
                q.add(r.right);
                q.add(l.right);
                q.add(r.left);
            }
        }
        return true;
    }
}

/*
Iterative DFS solution using stack
*/

class Solution {
    public boolean isSymmetric(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        stack.add(root);
        
        while (!stack.isEmpty()) {
            TreeNode l = stack.pop();
            TreeNode r = stack.pop();
            if (l == null && r == null) continue;
            else if (l == null || r == null) return false;
            else if (l.val != r.val) return false;
            else {
                stack.add(l.left);
                stack.add(r.right);
                stack.add(l.right);
                stack.add(r.left);
            }
        }
        return true;
    }
}