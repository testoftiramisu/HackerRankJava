package ThirtyDaysOfCode.Day27.Testing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(Parameterized.class)
public class IsCancelledTest {
    private int[] arrivalTimes;
    private int threshold;
    private boolean lectureCancelled;

    public IsCancelledTest(int threshold, int[] arrivalTimes, boolean lectureCancelled) {
        this.arrivalTimes = arrivalTimes;
        this.threshold = threshold;
        this.lectureCancelled = lectureCancelled;
    }

    @Parameterized.Parameters
    public static Iterable data() {
        return Arrays.asList(
                new Object[][]{
                        {4, new int[]{-1, -3, 4, 2, 0}, true},
                        {1, new int[]{0, -1, -2, 1, 4, -6, -5}, false},
                        {4, new int[]{-1, -3, 4, 2, 0, 1}, true},
                        {2, new int[]{0, -1, -2, 1, 4, -2, -1, -3}, false},
                        {3, new int[]{-1, 0, 4}, true},
                }
        );
    }

    @Test
    public void testIsCancelled() throws Exception {
        assertThat(lectureCancelled).isEqualTo(Solution.isCancelled(threshold, arrivalTimes));
    }

}