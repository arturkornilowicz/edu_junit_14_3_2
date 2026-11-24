package prv.ak;

import org.junit.*;

public class T03_TimeTest {

    @Test(timeout = 2000)
    public void test() {
        System.out.println("*** T03_TimeTest");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
    }
}
