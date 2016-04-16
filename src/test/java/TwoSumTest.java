import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.*;

public class TwoSumTest{

  @Test
  public void shouldTestTwoSum(){
    TwoSum ts = new TwoSum();
    int[] values = new int[4];
    values[0] = 15;
    values[1] = 7;
    values[2] = 11;
    values[3] = 2;
    int[] expected = new int[2];
    expected[0] = 1;
    expected[1] = 3;
    assertThat(ts.twoSum(values, 9),is(expected));
  }
}
