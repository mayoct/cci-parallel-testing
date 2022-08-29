package net.mayoct.test;

import org.junit.Test;

public class TenSecondTest {
    @Test
    public void tenSecondTest() throws InterruptedException {
        Thread.sleep(10 * 1000);
    }
}