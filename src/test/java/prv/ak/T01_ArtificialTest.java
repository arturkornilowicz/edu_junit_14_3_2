package prv.ak;

import org.junit.Test;
import static org.junit.Assert.*;

// domyślnie nazwa klasy kończy się Test
public class T01_ArtificialTest {

    // public method
    // void result type
    // no arguments
    @Test
    public void test1() {
        System.out.println("*** T01_ArtificialTest_1");
        assertTrue(true);
        assertTrue(2 == 2);
    }

    @Test
    public void test2() {
        System.out.println("*** T01_ArtificialTest_2");
        assertFalse(false);
        assertFalse(2 == 3);
    }

    @Test
    public void test3() {
        System.out.println("*** T01_ArtificialTest_3");
        assertEquals(2,2);
        assertEquals(3.14,3.1401,0.001);
    }
}
