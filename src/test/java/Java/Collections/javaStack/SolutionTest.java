package Java.Collections.javaStack;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(Parameterized.class)
public class SolutionTest {
    private String inputString;
    private boolean balanced;

    public SolutionTest(String inputString, boolean balanced) {
        this.inputString = inputString;
        this.balanced = balanced;
    }

    @Parameterized.Parameters
    public static Iterable data() {
        return Arrays.asList(
                new Object[][]{
                        {"[({})(())]", true},
                        {"(({()})))[[", false},
                        {"({(){}()})()({(){}()})(){()}{}((()))", true},
                        {"{}()))(()()({}}{}", false},
                        {"}}}}", false},
                        {"))))", false},
                        {"{{{", false},
                        {"(((", false},
                        {"{}(){()}((())){{{}}}{()()}{{}{}}", true},
                        {"{{{{{{{)))))))))))))))))))", false},
                        {"{}{}(", false},
                        {"{}}}{}}", false},
                        {"()()()())))", false},
                        {"(((((()()()", false},
                        {"(){}{{}}()(()){{()()}}", true},
                        {"{}{{{}}}{{{((()))}}}", true},
                        {"((()))[]", true},
                        {"{{}}(()[])", true},
                        {"({}[])", true},
                        {"(({()})))", false},
                        {"({(){}()})()({(){}()})(){()}", true},
                        {"{}()))(()()({}}{}", false},
                        {"}}}}]]", false},
                        {"))))]]", false},
                        {"{{{{{{]]", false},
                        {"(((]]", false},
                        {"[]{}(){()}((())){{{}}}{()()}{{}{}}", true},
                        {"[[]][][]", true}
                }
        );
    }

    @Test
    public void testIsBalanced() throws Exception {
        assertThat(balanced).isEqualTo(Solution.isBalanced(inputString));

    }
}