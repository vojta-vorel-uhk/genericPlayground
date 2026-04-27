package pro1.Task4b;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test
{
    @org.junit.Test
    public void test01() throws Exception {
        var k1 = new Circle<Integer>(5);
        var k2 = new Circle<Float>(5.8f);
        var k3 = new Circle<Double>(5.8d);

        // TODO: Doplň třídu Circle podobně jako FloatCircle.
        //       Třída Circle musí umět uchovat hodnotu radius jako integer, float,
        //       nebo double podle aktuální potřeby.
        //       Do třídy Circle přidej také getter GetRadius.

         assertEquals(
                78.54,
                k1.getArea(),
                0.01
        );
        assertEquals(
                105.68,
                k2.getArea(),
                0.01
        );
        assertEquals(
                105.68,
                k3.getArea(),
                0.01
        );
    }
}
