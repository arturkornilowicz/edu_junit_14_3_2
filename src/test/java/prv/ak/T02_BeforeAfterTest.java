package prv.ak;

import org.junit.*;
import static org.junit.Assert.*;

public class T02_BeforeAfterTest {

    @Test
    public void test1() {
        System.out.println("*** T02_ArtificialTest_1");
        assertTrue(true);
    }

    @Test
    public void test2() {
        System.out.println("*** T02_ArtificialTest_2");
        assertFalse(false);
    }

    // before each single test
    @Before
    public void beforeActions() {
        System.out.println("*** BEFORE T02_ArtificialTest");
    }

    // after each single test
    @After
    public void afterAction() {
        System.out.println("*** AFTER T02_ArtificialTest");
    }

    // once before first test
    // static method
    @BeforeClass
    public static void beforeALL() {
        System.out.println("*** BEFORE CLASS T02_ArtificialTests");
    }

    // once after last test
    // static method
    @AfterClass
    public static void AfterALL() {
        System.out.println("*** AFTER CLASS T02_ArtificialTests");
    }
}
