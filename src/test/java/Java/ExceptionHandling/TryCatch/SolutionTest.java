package Java.ExceptionHandling.TryCatch;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;


@RunWith(Parameterized.class)
public class SolutionTest {
    private int a, b, result;

    public SolutionTest(int a, int b, int result) {
        this.a = a;
        this.b = b;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Iterable data() {
        return Arrays.asList(
                new Object[][]{
                        {10, 3, 3},
                        {23, 1, 23},
                }
        );
    }

    @Test
    public void testGetResult() throws Exception {

    }
}