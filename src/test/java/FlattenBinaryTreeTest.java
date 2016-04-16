import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.*;

public class FlattenBinaryTreeTest{

  @Test
  public void shouldTestFlattenExtraMemory(){
    FlattenBinaryTree fbt = new FlattenBinaryTree();
    // Let's try it for a Binary Tree.
    TreeNode root = new TreeNode(7);
    root.left = new TreeNode(9);
    root.right = new TreeNode(4);
    root.left.left = new TreeNode(2);
    root.left.right = new TreeNode(6);
    root.right.left = new TreeNode(8);
    root.right.right = new TreeNode(3);
    root.right.right.left = new TreeNode(1);

    List<Integer> expected = new LinkedList<Integer>();
    expected.add(7);
    expected.add(9);
    expected.add(2);
    expected.add(6);
    expected.add(4);
    expected.add(8);
    expected.add(3);
    expected.add(1);

    assertThat(fbt.flattenExtraMemory(root),is(expected));
  }
}
