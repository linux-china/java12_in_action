package org.mvnsearch;

import org.openjdk.jmh.annotations.*;

/**
 * benchmark app
 *
 * @author linux_china
 */
@BenchmarkMode(Mode.AverageTime)
@Fork(1)
@State(Scope.Benchmark)
public class BenchMarkApp {

    @Param({"first", "second", "third"})
    private String word;

    @Setup
    public void setUp() {

    }

    @TearDown
    public void tearDown() {

    }

    @Benchmark
    public void testMethod1() {
        //you logic here
    }
}
