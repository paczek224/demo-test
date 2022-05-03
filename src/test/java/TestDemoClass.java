import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

@Test
public class TestDemoClass extends BaseTest {


    public void shouldReturn4WhenAdd2And2() {
        int result = 2 + 2;

        Assertions.assertThat(result).isEqualTo(4);
    }
    public void shouldReturn0WhenMinus2And2() {
        int result = 2 - 2;

        Assertions.assertThat(result).isEqualTo(0);
    }
}
