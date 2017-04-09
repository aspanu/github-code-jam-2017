package org.aspanu.codejam2017.tidyproblem;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by aspanu on 4/8/17.
 */
public class TidyProblemTest {


    private TidyProblem tidy;

    @Before
    public void setUp() {
        tidy = new TidyProblem();
    }

    @Test
    public void testIsTidyNumber() {
        assertThat(tidy.isTidyNumber(123L), equalTo(true));
        assertThat(tidy.isTidyNumber(10L), equalTo(false));
        assertThat(tidy.isTidyNumber(132L), equalTo(false));
        assertThat(tidy.isTidyNumber(7L), equalTo(true));
        assertThat(tidy.isTidyNumber(99999999999999999L), equalTo(true));
    }

    @Test
    public void testPreviousTidyNumberNaive() {
        assertThat(tidy.previousTidyNumberNaive(132L), equalTo(129L));
        assertThat(tidy.previousTidyNumberNaive(1000L), equalTo(999L));
        assertThat(tidy.previousTidyNumberNaive(7L), equalTo(7L));
        // This takes too long for the naive implementation
        //assertThat(tidy.previousTidyNumberNaive(111111111111111110L), equalTo(99999999999999999L));
    }

    @Test
    public void testGetUntidyIndex() {
        assertThat(tidy.getUntidyIndex(7L), equalTo(-1));
        assertThat(tidy.getUntidyIndex(132L), equalTo(1));
        assertThat(tidy.getUntidyIndex(1000L), equalTo(0));
    }

    @Test
    public void testLowerDigitAndCascadeNumber() {
        assertThat(tidy.lowerDigitAndCascadeNumber(10L, 0), equalTo(9L));
        assertThat(tidy.lowerDigitAndCascadeNumber(20L, 0), equalTo(19L));
        assertThat(tidy.lowerDigitAndCascadeNumber(1066L, 1), equalTo(999L));
        assertThat(tidy.lowerDigitAndCascadeNumber(10066L, 2), equalTo(9999L));
    }

    @Test
    public void testPreviousTidyNumberIntelligent() {
        TidyProblem tidyProblem = new TidyProblem();
        assertThat(tidyProblem.previousTidyNumberIntelligent(132L), equalTo(129L));
        assertThat(tidyProblem.previousTidyNumberIntelligent(1000L), equalTo(999L));
        assertThat(tidyProblem.previousTidyNumberIntelligent(7L), equalTo(7L));
        assertThat(tidyProblem.previousTidyNumberIntelligent(111111111111111110L), equalTo(99999999999999999L));
    }


}
