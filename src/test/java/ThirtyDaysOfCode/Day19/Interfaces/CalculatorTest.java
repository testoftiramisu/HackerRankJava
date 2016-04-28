package ThirtyDaysOfCode.Day19.Interfaces;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(Parameterized.class)
public class CalculatorTest {
    private int input;
    private int output;

    public CalculatorTest(int input, int output) {
        this.input = input;
        this.output = output;
    }

    @Parameterized.Parameters
    public static Iterable data() {
        return Arrays.asList(
                new Object[][]{
                        {6, 12},
                        {1, 1},
                        {20, 42}
                }
        );
    }


    @Test
    public void testDivisorSum() throws Exception {
        AdvancedArithmetic myCalculator = new Calculator();
        assertThat(output).isEqualTo(myCalculator.divisorSum(input));
    }

}