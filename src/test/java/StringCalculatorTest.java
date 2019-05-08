import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by wasadmin on 5/7/2019.
 */
public class StringCalculatorTest {

    private StringCalculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new StringCalculator();
    }

    @Test
    public void testBlankStringInput() {
        assertThat(calculator.add(""), is(0));
    }

    @Test
    public void testStringOfOne() {
        assertThat(calculator.add("1"), is(1));
    }

    @Test
    public void testStringOfSix() {
        assertThat(calculator.add("6"), is(6));
    }

    @Test
    public void testStringOfOneCommaTwo() {
        assertThat(calculator.add("1,2"), is(3));
    }

    @Test
    public void testStringOfTenCommaEleven() {
        assertThat(calculator.add("10,11"), is(21));
    }

    @Test
    public void testStringOfOneCommaTwoCommaThree() {
        assertThat(calculator.add("1,2,3"), is(6));
    }

    @Test
    public void testStringOfOneCommaTenCommaFifteen() {
        assertThat(calculator.add("1,10,15"), is(26));
    }

    @Test
    public void testStringOfOneNewLineTwoNewLineThree() {
        assertThat(calculator.add("1\n2\n3"), is(6));
    }

    @Test
    public void testStringOfSemiColonSeperator() {
        assertThat(calculator.add("//;\n1;2;3"), is(6));
    }

    @Test
    public void testStringOfQuestionMarkSeperator() {
        assertThat(calculator.add("//?\n2?5?7"), is(14));
    }

    @Test
    public void testStringOfFiveSeperator() {
        assertThat(calculator.add("//5\n1510516"), is(26));
    }
}
