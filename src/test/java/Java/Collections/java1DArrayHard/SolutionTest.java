package Java.Collections.java1DArrayHard;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void shouldBeYesWithStepThree() throws Exception {
        int[] array = {0, 0, 0, 0, 0};
        int jump = 3;

        assertThat(Solution.isPossibleToWin(array, jump)).isEqualTo("YES");
    }

    @Test
    public void shouldBeYesWithStepFive() throws Exception {
        int[] array = {0, 0, 0, 1, 1, 1};
        int jump = 5;

        assertThat(Solution.isPossibleToWin(array, jump)).isEqualTo("YES");
    }

    @Test
    public void shouldBeNoWithStepThree() throws Exception {
        int[] array = {0, 0, 1, 1, 1, 0};
        int jump = 3;

        assertThat(Solution.isPossibleToWin(array, jump)).isEqualTo("NO");
    }

    @Test
    public void shouldBeNoWithStepOne() throws Exception {
        int[] array = {0, 1, 0};
        int jump = 1;

        assertThat(Solution.isPossibleToWin(array, jump)).isEqualTo("NO");
    }

    @Test
    public void shouldBeYesWithStepTwo() throws Exception {
        int[] array = {0, 1, 0, 1, 0, 1};
        int jump = 2;

        assertThat(Solution.isPossibleToWin(array, jump)).isEqualTo("YES");
    }

    @Test
    public void shouldBeNoWithStepSix() throws Exception {
        int[] array = {0, 0, 1, 1, 0, 0, 1, 1, 0, 0};
        int jump = 6;

        assertThat(Solution.isPossibleToWin(array, jump)).isEqualTo("NO");
    }

    @Test
    public void shouldBeYesWithStepThreeAndSizeTen() throws Exception {
        int[] array = {0, 0, 1, 1, 0, 0, 1, 1, 0, 0};
        int jump = 3;

        assertThat(Solution.isPossibleToWin(array, jump)).isEqualTo("YES");
    }




}