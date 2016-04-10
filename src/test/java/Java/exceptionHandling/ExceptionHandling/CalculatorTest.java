package Java.ExceptionHandling.ExceptionHandling;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

@RunWith(Parameterized.class)
public class CalculatorTest {
    private int a, b;
    private long pow;

    public CalculatorTest(int a, int b, long pow) {
        this.a = a;
        this.b = b;
        this.pow = pow;
    }

    @Parameterized.Parameters
    public static Iterable data() {
        return Arrays.asList(
                new Object[][]{
                        {10, 0, 1},
                        {0, 10, 0},
                        {5, 6, 15625},
                        {3, 3, 27},
                        {8, 0, 1},
                        {2, 3, 8},
                }
        );
    }

    @Test
    public void testPower() throws Exception {
        Calculator calculator = new Calculator();
        assertThat(calculator.power(a, b)).isEqualTo(pow);
    }

    @Test
    public void testException() throws Exception {
        Calculator calculator = new Calculator();

        // when
        Throwable thrown = catchThrowable(() -> {calculator.power(-1, 4);});

        // then
        assertThat(thrown).isInstanceOf(java.lang.Exception.class)
                .hasMessageContaining("n and p should be non-negative");

    }
}