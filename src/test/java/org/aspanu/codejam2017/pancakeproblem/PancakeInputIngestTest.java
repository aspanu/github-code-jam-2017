package org.aspanu.codejam2017.pancakeproblem;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by aspanu on 4/9/17.
 */
public class PancakeInputIngestTest {

    @Test
    public void testGetInput() throws UnsupportedEncodingException {
        String data = "3\n" +
            "---+-++- 3\n" +
            "+++++ 4\n" +
            "-+-+- 4";
        InputStream testInput = new ByteArrayInputStream(data.getBytes("UTF-8"));
        InputStream standardIn = System.in;
        System.setIn(testInput);
        PancakeInputIngest input = new PancakeInputIngest();
        input.init();
        assertThat(input.getNumProblems(), equalTo(3));

        System.setIn(standardIn);
    }

    @Test
    public void testToBinary() {
        PancakeInputIngest input = new PancakeInputIngest();

//        assertThat(input.toBinary("+++"), equalTo(Collections))

    }

}
