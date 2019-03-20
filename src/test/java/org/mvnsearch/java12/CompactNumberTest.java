package org.mvnsearch.java12;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;

/**
 * compact number test
 *
 * @author linux_china
 */
public class CompactNumberTest {

    @Test
    public void testNumberFormat() {
        NumberFormat shortNF = NumberFormat.getIntegerInstance();
        shortNF.setMaximumFractionDigits(2);
        System.out.println(shortNF.format(1500.0280));
    }
}
