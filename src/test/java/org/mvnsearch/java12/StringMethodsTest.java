package org.mvnsearch.java12;

import org.junit.jupiter.api.Test;

/**
 * String methods test
 *
 * @author linux_china
 */
public class StringMethodsTest {

    @Test
    public void testMethods() {
        //indent
        var name = "this \ngood\ndemo";
        System.out.println(name.indent(2));
        //transform
        Integer len = name.transform(String::length);
        System.out.println(len);
    }
}
