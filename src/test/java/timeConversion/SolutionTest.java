package timeConversion;

import Algorithms.Warmup.timeConversion.Solution;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void convert07PM() {
        assertThat(Solution.convert("07:05:45PM")).isEqualTo("19:05:45");
    }

    @Test
    public void convert12PM() {
        assertThat(Solution.convert("12:05:45PM")).isEqualTo("12:05:45");
    }

    @Test
    public void convert1159PM() {
        assertThat(Solution.convert("11:59:45PM")).isEqualTo("23:59:45");
    }

    @Test
    public void convert12AM() {
        assertThat(Solution.convert("12:00:00AM")).isEqualTo("00:00:00");
    }

    @Test
    public void convert1201AM() {
        assertThat(Solution.convert("12:01:00AM")).isEqualTo("00:01:00");
    }

    @Test
    public void convert0101AM() {
        assertThat(Solution.convert("01:01:00AM")).isEqualTo("01:01:00");
    }




}