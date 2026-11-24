package prv.ak;

public class App
{
    int suma(int a, int b) {
        return a+b;
    }

    int silnia(int n) {
        return n <= 1 ? 1 : n * silnia(n-1);
    }

    public static void main( String[] args )
    {
        System.out.println("JUnit 4.13.2");
    }
}
