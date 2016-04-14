import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.*;

public class LCABinaryTreeTest{

  @Test
  public void shouldTestLCABT(){

    // Testing the getPath method
    LCABinaryTree lcaBT = new LCABinaryTree();

    // Let's for a Binary Tree.
    TreeNode root = new TreeNode(7);
    root.left = new TreeNode(9);
    root.right = new TreeNode(4);
    root.left.left = new TreeNode(2);
    root.left.right = new TreeNode(6);
    root.right.left = new TreeNode(8);
    root.right.right = new TreeNode(3);
    root.right.right.left = new TreeNode(1);

    List<TreeNode> expected = new ArrayList<TreeNode>();
    // Adding path to 1
    expected.add(root.right.right.left);
    expected.add(root.right.right);
    expected.add(root.right);
    expected.add(root);
    assertThat( lcaBT.getPath(root, root.right.right.left),is(expected));
    assertThat( lcaBT.iterativeGetPath(root, root.right.right.left),is(expected));
    assertThat( lcaBT.lowestCommonAncestor(root, root, root.right),is(root));
    assertThat( lcaBT.lowestCommonAncestor(root, root.left.right, root.right),is(root));


    // Special Case Testing
    TreeNode root1 = new TreeNode(7);
    root1.left = new TreeNode(9);
    root1.right = new TreeNode(4);
    root1.left.left = new TreeNode(2); // left side of root
    root1.left.right = new TreeNode(6);
    root1.right.left = new TreeNode(2); // right side of root
    root1.right.right = new TreeNode(3);
    root1.right.right.left = new TreeNode(1);
    List<TreeNode>  pathtoP = lcaBT.iterativeGetPath(root1,root1.left.left);
    List<TreeNode>  pathtoQ = lcaBT.iterativeGetPath(root1,root1.right.left);
    System.out.println("*** Path to P ***");
    for (TreeNode node : pathtoP) {
      System.out.print(node.val + ",");
    }

    System.out.println("\n*** Path to Q ***");
    for (TreeNode node1 : pathtoQ) {
      System.out.print(node1.val + ",");
    }

    assertThat( lcaBT.lowestCommonAncestor(root1, root1.left.left, root1.right.left).val,is(root1.val));
  }
}
