package prv.ak;

import org.junit.*;
import static org.junit.Assert.*;

public class T05_App_Silnia_Test {

    App app = new App();

    @Test
    public void test1() {
        System.out.println("*** T05_App_Silnia_Test_1");
        assertEquals(1,app.silnia(0));
    }

    @Test
    public void test2() {
        System.out.println("*** T05_App_Silnia_Test_2");
        assertEquals(1,app.silnia(1));
    }

    @Test
    public void test3() {
        System.out.println("*** T05_App_Silnia_Test_3");
        assertEquals(120,app.silnia(5));
    }
}
