package org.mvnsearch.java12;

import org.junit.jupiter.api.Test;

/**
 * switch expression test
 *
 * @author linux_china
 */
public class SwitchExpressionTest {


    @Test
    public void testSwitchExpression() {
        int id = 1;
        //traditional switch
        String textName;
        switch (id) {
            case 1:
                textName = "first";
                break;
            case 2:
                textName = "second";
                break;
            default:
                textName = "unknown";
        }
        System.out.println(textName);
        //switch expression
        String name = switch (id) {
            case 1 -> "first";
            case 2 -> "second";
            default -> "unknown";
        };
        System.out.println(name);
    }
}
