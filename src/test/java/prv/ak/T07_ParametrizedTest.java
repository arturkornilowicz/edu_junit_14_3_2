package prv.ak;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class T07_ParametrizedTest
{
    //public static
    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][] {{0,3,3},{-1,-5,-6},{0,0,0}};
    }

    int a, b, wynik;

    public T07_ParametrizedTest(int a, int b, int wynik) {
        this.a = a;
        this.b = b;
        this.wynik = wynik;
    }

    App app = new App();

    @Test
    public void test() {
        System.out.println("*** T07_App_Suma_Test z danymi: " + a + " " + b + " " + wynik );
        assertEquals(wynik,app.suma(a,b));
    }
}
