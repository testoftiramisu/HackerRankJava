package ThirtyDaysOfCode.Day29.BitwiseAND;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(Parameterized.class)
public class SolutionTest {
    private int n;
    private int k;
    private int result;

    public SolutionTest(int n, int k, int result) {
        this.n = n;
        this.k = k;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Iterable data() {
        return Arrays.asList(
                new Object[][]{
                        {5, 2, 1},
                        {8, 5, 4},
                        {2, 2, 0},
                }
        );
    }

    @Test
    public void testGetMax() throws Exception {
        assertThat(result).isEqualTo(Solution.getMax(n, k));
    }
}