import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.*;

public class GoodSubsetTest{

  @Test
  public void shouldTestFindGoodSubset(){
    int[] arr = new int[4];
    arr[0] = 4;
    arr[1] = 2;
    arr[2] = 3;
    arr[3] = 8;
    GoodSubset gs = new GoodSubset();
    assertThat(gs.findGoodSubSet(arr),is(3));
  }
}
