/*
* Given a tree, print all paths from root to leave nodes
*/


import java.util.*;

public class Path{

  // Commmenting out this one, in order to test GeeksforGeeks Solution
  // Print all root to leaf path
  // public List<String> binaryTreePaths(TreeNode root) {
  //   Stack<TreeNode> nodes = new Stack<TreeNode>();
  //   TreeNode current = root;
  //   nodes.push(current);
  //   List<String> paths = new ArrayList<String>();
  //   while(!stack.empty()){
  //     current = stack.pop();
  //     StringBuilder path = new StringBuilder(); // No support for Synchornization
  //     path.append()
  //   }
  // }

    static TreeNode root;

    /*Given a binary tree, print out all of its root-to-leaf
     paths, one per line. Uses a recursive helper to do the work.*/
    public void printPaths(TreeNode node) {
        int path[] = new int[1000];
        printPathsRecur(node, path, 0);
    }

    /* Recursive helper function -- given a node, and an array containing
     the path from the root node up to but not including this node,
     print out all the root-leaf paths.*/
    public void printPathsRecur(TreeNode node, int path[], int pathLen) {
        if (node == null) {
            return;
        }

        /* append this node to the path array */
        path[pathLen] = node.val;
        pathLen++;

        /* it's a leaf, so print the path that led to here  */
        if (node.left == null && node.right == null) {
            printArray(path, pathLen);
        } else {

            /* otherwise try both subtrees */
            printPathsRecur(node.left, path, pathLen);
            printPathsRecur(node.right, path, pathLen);
        }
    }

    /* Utility function that prints out an array on a line. */
    public void printArray(int ints[], int len) {
        int i;
        for (i = 0; i < len; i++) {
            System.out.print(ints[i] + " ");
        }
        System.out.println("");
    }
}
