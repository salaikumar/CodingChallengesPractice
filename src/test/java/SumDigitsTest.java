import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.*;

public class SumDigitsTest{

  @Test
  public void shouldTestSumDigits(){
    SumDigits sd = new SumDigits();
    assertThat(sd.sumDigits(689),is(5));
    assertThat(sd.sumDigits(68914758),is(3));
  }
}
