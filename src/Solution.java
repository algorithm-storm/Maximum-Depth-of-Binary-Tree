/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */
public class Solution {

    public static void main(String [] args){

        TreeNode root = new TreeNode(1);
        TreeNode leftTree = new TreeNode(2);
        root.left = leftTree;
        TreeNode rightTree4 = new TreeNode(4);
        TreeNode rightTree5 = new TreeNode(5);
        TreeNode rightTree = new TreeNode(3);
        rightTree.left = rightTree4;
        rightTree.right = rightTree5;
        root.right = rightTree;

        Solution a = new Solution();
        System.out.println(a.maxDepth(root));

    }

    /**
     * @param root: The root of binary tree.
     * @return: An integer.
     */
/*

    private int depth;

    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        depth = 0;
        helper(root,1);
        return depth;
    }

    private void helper(TreeNode root, int curDepth){
        if(root == null)
            return;
        if(curDepth > depth){
            depth = curDepth;
        }
        helper(root.left,curDepth+1);
        helper(root.right,curDepth+1);
    }
*/

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }

}