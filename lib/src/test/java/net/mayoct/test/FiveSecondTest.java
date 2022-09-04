package net.mayoct.test;

import org.junit.Test;

public class FiveSecondTest {
    @Test
    public void fiveSecondTest() throws InterruptedException {
        Thread.sleep(5 * 1000);
    }
}