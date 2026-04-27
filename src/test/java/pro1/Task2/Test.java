package pro1.Task2;

import pro1.Task6.Resistor;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test
{
    @org.junit.Test
    public void test01() throws Exception {
        var k = new FloatCircle(5.8f);
        // TODO: Změnit radius na 5.9 (pouze přidáním kódu na tomto místě)
        var field= FloatCircle.class.getDeclaredField("radius");
        field.setAccessible(true);
        field.set(k, 5.9f);

         assertEquals(
                 109.3588,
                k.getArea(),
                0.01
        );
    }
}
