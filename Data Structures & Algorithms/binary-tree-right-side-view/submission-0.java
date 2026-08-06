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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode rightSideNode = null;
            int qLength = queue.size();
            for(int idx = 0 ; idx < qLength ; idx++){
                TreeNode node = queue.poll();
                if(node != null){
                    rightSideNode = node;
                    queue.offer(node.left);
                    queue.offer(node.right);
                }
            }
            if(rightSideNode != null)
                result.add(rightSideNode.val);
        }
        return result;

    }
}
