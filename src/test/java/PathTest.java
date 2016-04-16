import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.*;

public class PathTest{

  @Test
  public void shouldTestPath(){
    Path path = new Path();
    TreeNode root = new TreeNode(7);
    root.left = new TreeNode(9);
    root.right = new TreeNode(4);
    root.left.left = new TreeNode(2);
    root.left.right = new TreeNode(6);
    root.right.left = new TreeNode(8);
    root.right.right = new TreeNode(3);
    root.right.right.left = new TreeNode(1);
    path.printPaths(root);

  }
}
