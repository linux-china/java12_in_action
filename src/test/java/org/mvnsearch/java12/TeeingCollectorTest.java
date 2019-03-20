package org.mvnsearch.java12;

import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * teeing collector test
 *
 * @author linux_china
 */
public class TeeingCollectorTest {
    @Test
    public void testCollector() {
        Integer gap = Stream.of(1, 2, 3).collect(Collectors.teeing(
                Collectors.maxBy(Integer::compareTo),
                Collectors.minBy(Integer::compareTo),
                (max, min) -> max.orElse(0) - min.orElse(0)
        ));
        System.out.println(gap);
    }
}
