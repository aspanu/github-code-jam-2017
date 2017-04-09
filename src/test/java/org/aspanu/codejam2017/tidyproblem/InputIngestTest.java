package org.aspanu.codejam2017.tidyproblem;

import org.aspanu.codejam2017.tidyproblem.InputIngest;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by aspanu on 2017-04-08.
 */

public class InputIngestTest {

    @Test
    public void testInputIngest() throws UnsupportedEncodingException {
        String data = "3\n" +
            "132\n" +
            "1000\n" +
            "7\n";
        InputStream testInput = new ByteArrayInputStream(data.getBytes("UTF-8"));
        InputStream standardIn = System.in;
        System.setIn(testInput);
        InputIngest input = new InputIngest();
        input.init();
        assertThat(input.getNumProbs(), equalTo(3));
        assertThat(input.getInputNumbers(), hasItems(132L, 1000L, 7L));

        System.setIn(standardIn);
    }


}
