package prv.ak;

import org.junit.*;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class T04_App_Suma_Test {

    App app = new App();

    @Test
    public void test1() {
        System.out.println("*** T04_App_Suma_Test_1");
        assertEquals(5,app.suma(2,3));
    }

    @Test
    public void test2() {
        System.out.println("*** T04_App_Suma_Test_2");
        assertEquals(-5,app.suma(2,-7));
    }
}