package org.aspanu.codejam2017.tidyproblem;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by aspanu on 4/8/17.
 */
public class TidyProblemTest {

    @Test
    public void testIsTidyNumber() {
        TidyProblem tidy = new TidyProblem();
        assertThat(tidy.isTidyNumber(123), equalTo(true));
    }
}
