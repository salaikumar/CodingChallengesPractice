

/*
* Least Common Ancestor of a binary tree.
* Now, without the Binary tree properties,let's see how u complete this
*/

// Using TreeNode, so that the solution can be submitted to leetcode
import java.util.*;
public class LCABinaryTree{

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            // Corner Cases
            if (root == null) {
                return null;
            }
            // If either of the values are root
            if (root.val == p.val || root.val == q.val) {
                return root;
            }
            List<TreeNode> nodePPath = getPath(root, p);
            List<TreeNode> nodeQPath = getPath(root, q);

            for ( TreeNode node:nodePPath ) {
              if (nodeQPath.contains(node)) {
                return node;
              }
            }
            return null;
    }

    /*
    * Finds the path from root to given Node
    * DFS  - inOrderTraversal
    */
    public List<TreeNode> getPath(TreeNode root, TreeNode to){
      List<TreeNode> path = new ArrayList<TreeNode>();
      TreeNode current = root;

      if(current == null)
        return null;

      if (current.val == to.val) {
        path.add(current);
        return path;
      }
      else{
         List<TreeNode> leftSearchPath = getPath(root.left, to);
         if (leftSearchPath == null) {
           List<TreeNode> rightSearchPath = getPath(root.right, to);
           if (rightSearchPath != null) {
              rightSearchPath.add(root);
              return rightSearchPath;
           }
         }else{
           leftSearchPath.add(root);
           return leftSearchPath;
         }
      }
      return null;
    }
}
